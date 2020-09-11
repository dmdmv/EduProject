<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ZH-CN">
<head>
<meta charset="utf-8">
<title>face 测试</title>
<style>
#video {
	border: 1px solid #ddd;
}
 
.booth {
	position: relative;
}
 
.picLine {
	border: 1px solid #ddd;
	width: 400px;
	height: 300px;
	position: absolute;
	top: 0px;
	left: 0px;
}
 
.vid {
	border: 1px solid #ddd;
	width: 400px;
	height: 300px;
	position: absolute;
	top: 0px;
	left: 0px;
	z-index: 99;
}
 
.screencapture {
	border: 1px solid #ddd;
	width: 400px;
	height: 300px;
	position: absolute;
	left: 500px;
}
 
.info {
	position: absolute;
	top: 350px;
}
</style>
 
<script type="text/javascript" src="../resources/home/js/jquery-3.3.1.min.js"></script>
</head>
<body>
	<div class="booth">
 
		<div class="vid">
			<video id="video" width="400" height="300"></video>
		</div>
	</div>
 
	<div>
		<div class="screencapture">
			<canvas id='canvas' width='400' height='300'></canvas>
		</div>
	</div>
	<div class="info">
		匹配得分：<p id="name">adsfsf</p>
	</div>
 
 
 
	<script>
    var video = document.getElementById('video'),
            canvas = document.getElementById('canvas'),
            snap = document.getElementById('tack'),
            img = document.getElementById('img'),
            vendorUrl = window.URL || window.webkitURL;
 
    //媒体对象
    navigator.getMedia = navigator.getUserMedia ||
            navagator.webkitGetUserMedia ||
            navigator.mozGetUserMedia ||
            navigator.msGetUserMedia;
    navigator.getMedia({
        video: true, //使用摄像头对象
        audio: false  //不适用音频
    }, function (strem) {
        console.log(strem);
        video.srcObject = strem;
        video.play();
    }, function (error) {
        //error.code
        console.log(error);
    });
    
    //截取图片并请求后台
    function login() {
    	var isok = false;
        //绘制canvas图形
        canvas.getContext('2d').drawImage(video, 0, 0, 400, 300);
        var saveImg = canvas.toDataURL('image/png');
 
        $.ajax({
            url: "face",
            type: 'post',
            data: {"saveImg":saveImg.substring(22)},
            success: function (data) {
            	
                document.getElementById("name").innerHTML = data;
            	this.isok = true;
                console.info(data);
            }
        });
        
        return isok;
    }
    
    //隔一秒请求一次
    function search(){
    	var lo = login();
    	if(lo){
    		return 0;
    	}else{
    		setTimeout(search,5000);
    	}
    }
    
    window.onload=function (){
    	search();
    }
 
</script>
</body>
</html>