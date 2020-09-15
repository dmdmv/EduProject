<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<meta name="description" content="">
	<meta name="author" content="webThemez.com">
	<title></title>
	<link rel="favicon" href="assets/images/favicon.png">
	<link rel="stylesheet" media="screen" href="http://fonts.useso.com/css?family=Open+Sans:300,400,700">
	<link rel="stylesheet" href="../resources/home/assets/css/bootstrap.min.css">
	<link rel="stylesheet" href="../resources/home/assets/css/font-awesome.min.css">
	<!-- Custom styles for our template -->
	<link rel="stylesheet" href="../resources/home/assets/css/bootstrap-theme.css" media="screen">
	<link rel="stylesheet" href="../resources/home/assets/css/style.css">
	<link href="../resources/home/assets/AmazeUI-2.4.2/css/admin.css" rel="stylesheet" type="text/css">
	<link href="../resources/home/assets/AmazeUI-2.4.2/css/amazeui.css" rel="stylesheet" type="text/css">
	<link rel="stylesheet" href="../resources/home/assets/css/infstyle.css">
	<link rel="stylesheet" href="../resources/home/assets/css/personal.css">
	
</head>

<body>
	<!-- Fixed navbar -->
	<div class="navbar navbar-inverse">
		<div class="container">
			<div class="navbar-header">
				<!-- Button for smallest screens -->
				<button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse"><span class="icon-bar"></span><span class="icon-bar"></span><span class="icon-bar"></span></button>
				<a class="navbar-brand" href="index.html">
					<img src="../resources/home/assets/images/logo.png" alt="Techro HTML5 template"></a>
			</div>
			<div class="navbar-collapse collapse">
				<ul class="nav navbar-nav pull-right mainNav">
					<li><a href="index.html">Home</a></li>
					<li><a href="about.html">About</a></li>
						<li><a href="courses.html">Courses</a></li>
					<li class="active"><a href="price.html">Price</a></li>
					<li><a href="videos.html">Videos</a></li>
					<li class="dropdown">
						<a href="#" class="dropdown-toggle" data-toggle="dropdown">Pages <b class="caret"></b></a>
						<ul class="dropdown-menu">
							<li><a href="sidebar-right.html">Right Sidebar</a></li>
							<li><a href="#">Dummy Link1</a></li>
							<li><a href="#">Dummy Link2</a></li>
							<li><a href="#">Dummy Link3</a></li>
						</ul>
					</li>
					<li><a href="contact.html">Contact</a></li>
				</ul>
			</div>
			<!--/.nav-collapse -->
		</div>
	</div>
	<!-- /.navbar -->

	<header id="head" class="secondary" >
            <div class="container">
                    <h1>个人中心</h1>
                    <p>学习使我快乐</p>
            </div>
    </header>
    
	<div class="center">
			<div class="col-main">
				<div class="main-wrap">
					<div class="user-info">
						<!--标题 -->
						<div class="am-cf am-padding">
							<div class="am-fl am-cf"><strong class="am-text-danger am-text-lg">个人资料</strong> / <small>Personal&nbsp;information</small></div>
						</div>
						<hr/>

						<!--头像 -->
						<div class="user-infoPic">

							<div class="filePic">
								<form action="../changeImage" id="form1" enctype="multipart/form-data" method="post">
									<input type="file" id="file1" class="inputPic" name = "f1" onchange="this.form.submit()">
									<%-- <%
									if(info==null||info.getImgpath()==null){
									%>
										<img class="am-circle am-img-thumbnail" id="am-circle am-img-thumbnail" src="${info.getImgpath()}" alt="图片加载错误" />
									<%
									}else{
									%>
										<img class="am-circle am-img-thumbnail" id="am-circle am-img-thumbnail" src="${info.getImgpath()}" alt="图片加载错误" />
									<%
									}
									%> --%>
									<img alt="头像" src="">
								</form>
							</div>
							<p class="am-form-help">头像</p>
						
							<div class="info-m">
								<div><b>用户名：<i>测试</i></b></div>
								<div class="u-level">
									<span class="rank r2">
							             <s class="vip1"></s><a class="classes" href="#">用户等级：100</a>
						            </span>
								</div>
								<div class="u-safety">
									<a href="safety.html">
									 账户积分：
									<span class="u-profile"><i class="bc_ee0000" style="width: 60px;" width="0">10000</i></span>
									</a>
								</div>
							</div>
						</div>

						<!--个人信息 -->
						<div class="info-main">
							<form class="am-form am-form-horizontal" action="../personalinfo" method="post">

								<div class="am-form-group">
									<label for="user-name2" class="am-form-label">昵称</label>
									<div class="am-form-content">
										<input type="text" id="user-name2" name="nickname" placeholder="测试" value="测试" style="padding-left: 0px;">

									</div>
								</div>

								<div class="am-form-group">
									<label for="user-name" class="am-form-label">姓名</label>
									<div class="am-form-content"style="margin-top: 8px;">
										测试
										<!-- <input type="" id="user-name2" placeholder=""> -->

									</div>
								</div>

								<div class="am-form-group">
									<label class="am-form-label">性别</label>
									<div class="am-form-content sex">
											<label class="am-radio-inline" style="padding-left: 0px">
											<input type="radio" name="radio10" value="男" data-am-ucheck> 男
											</label>
											<label class="am-radio-inline">
											<input type="radio" name="radio10" value="女" data-am-ucheck> 女
											</label>
											<label class="am-radio-inline">
											<input type="radio" name="radio10" value="保密" data-am-ucheck checked> 保密
									</label>
								<%-- <%
										if(user==null||info==null){
											response.sendRedirect("../login");
										}else if(info.getGender().equals("")&&info.getGender()==null){
											%>
											<label class="am-radio-inline">
											<input type="radio" name="radio10" value="男" data-am-ucheck> 男
											</label>
											<label class="am-radio-inline">
											<input type="radio" name="radio10" value="女" data-am-ucheck> 女
											</label>
											<label class="am-radio-inline">
											<input type="radio" name="radio10" value="保密" data-am-ucheck checked> 保密
											</label>
											<%
										}else if(info.getGender().equals("男")){
											%>
											<label class="am-radio-inline">
											<input type="radio" name="radio10" value="男" data-am-ucheck checked> 男
											</label>
											<label class="am-radio-inline">
											<input type="radio" name="radio10" value="女" data-am-ucheck > 女
											</label>
											<label class="am-radio-inline">
											<input type="radio" name="radio10" value="保密" data-am-ucheck> 保密
											</label>
											<%
										}else if(info.getGender().equals("女")){
											%>
											<label class="am-radio-inline">
											<input type="radio" name="radio10" value="男" data-am-ucheck> 男
											</label>
											<label class="am-radio-inline">
											<input type="radio" name="radio10" value="女" data-am-ucheck checked> 女
											</label>
											<label class="am-radio-inline">
											<input type="radio" name="radio10" value="保密" data-am-ucheck> 保密
											</label>
											<%
										}else{
											%>
											<label class="am-radio-inline">
											<input type="radio" name="radio10" value="男" data-am-ucheck> 男
											</label>
											<label class="am-radio-inline">
											<input type="radio" name="radio10" value="女" data-am-ucheck> 女
											</label>
											<label class="am-radio-inline">
											<input type="radio" name="radio10" value="保密" data-am-ucheck checked> 保密
											</label>
											<%
										}
										%> --%>
									</div>
								</div>

							    <div class="am-form-group">
									<label for="user-birth" class="am-form-label">生日</label>
									<div class="am-form-content birth">
										<div class="birth-select">
											<select data-am-selected>
												<option value="a">2015</option>
												<option value="b">1987</option>
											</select>
											<em>年</em>
										</div>
										<div class="birth-select2">
											<select data-am-selected>
												<option value="a">12</option>
												<option value="b">8</option>
											</select>
											<em>月</em></div>
										<div class="birth-select2">
											<select data-am-selected>
												<option value="a">21</option>
												<option value="b">23</option>
											</select>
											<em>日</em></div>
									</div>
							
								</div> 
								<div class="am-form-group">
									<label for="user-phone" class="am-form-label">电话</label>
									<div class="am-form-content">
										<input id="user-phone" value="" name="phonenum" placeholder="" type="tel">

									</div>
								</div>
								<div class="am-form-group">
									<label for="user-email" class="am-form-label">电子邮件</label>
									<div class="am-form-content">
										<input id="user-email" name="email" value=""  placeholder="" type="email">

									</div>
								</div>
								<div class="am-form-group address">
									<label for="user-address" class="am-form-label">收货地址</label>
									<div class="am-form-content address">
										<a href="address.html">
											<p class="new-mu_l2cw">
												<span class="province">湖北</span>省
												<span class="city">武汉</span>市
												<span class="dist">洪山</span>区
												<span class="street">雄楚大道666号(中南财经政法大学)</span>
												<span class="am-icon-angle-right"></span>
											</p>
										</a>

									</div>
								</div>
								<div class="am-form-group safety">
									<label for="user-safety" class="am-form-label">账号安全</label>
									<div class="am-form-content safety">
										<a href="safety.html">

											<span class="am-icon-angle-right"></span>

										</a>

									</div>
								</div>
								<div class="info-btn">
									<!-- <div class="am-btn am-btn-danger">保存修改</div> -->
									<input type="submit" value="保存修改"  class="am-btn am-btn-danger">
								</div>

							</form>
						</div>

					</div>

				</div>
				<!--底部-->
				<div class="footer">
					<div class="footer-hd">
						<p>
						
							<a href="index.jsp">商城首页</a>
							<b>|</b>
							<a href="javascript:void(0)">支付宝</a>
							<b>|</b>
							<a href="javascript:void(0)">物流</a>
						</p>
					</div>
					
				</div>
			</div>

			<aside class="menu">
				<ul>
					<li class="person">
						<a href="userInfo.jsp">个人中心</a>
					</li>
					<li class="person">
						<a href="javascript:void(0)">个人资料</a>
						<ul>
							<li class="active"> <a href="information.jsp">个人信息</a></li>
							<li> <a href="safety.html">安全设置</a></li>
							<li> <a href="address.html">收货地址</a></li>
						</ul>
					</li>
					<li class="person">
						<a href="javascript:void(0)">我的交易</a>
						<ul>
							<li><a href="../userOrderinfo">订单管理</a></li>
							
						</ul>
					</li>
					

					<li class="person">
						<a href="javascript:void(0)">我的小窝</a>
						<ul>
							
							<li> <a href="comment.html">评价</a></li>
							<li> <a href="news.html">消息</a></li>
						</ul>
					</li>

				</ul>

			</aside>
		</div>
	<!-- JavaScript libs are placed at the end of the document so the pages load faster -->
	<script src="../resources/home/assets/js/jquery.min.js"></script>
	<script src="../resources/home/assets/js/bootstrap.min.js"></script>
	<script src="../resources/home/assets/js/custom.js"></script>
	<script src="../resources/home/assets/AmazeUI-2.4.2/js/amazeui.js"></script>
</body>
</html>
