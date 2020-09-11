package com.baidu.aip.auth;

import com.baidu.aip.util.HttpUtil;
import com.baidu.aip.util.Base64Util;
import com.baidu.aip.util.FileUtil;
import com.baidu.aip.util.GsonUtils;

import java.util.*;

/**
* 人脸对比
*/
public class FaceMatch {
    public static String faceMatch(String face1) {
        // 请求url
        String url = "https://aip.baidubce.com/rest/2.0/face/v3/match";
        try {
        	List images = new ArrayList<>();
        	
        	//byte[] p1 = b;
        	byte[] p2 = FileUtil.readFileByBytes("D:\\TianRuanRelative\\Test\\test5.jpg");
        	//String t1 = Base64Util.encode(p1);
        	String t2 = Base64Util.encode(p2);
        	Map map = new HashMap();
        	map.put("image", face1);
        	map.put("image_type","BASE64");
        	map.put("face_type","LIVE");
        	map.put("quality_control","LOW");
        	map.put("liveness_control","NONE");
        	
        	Map map2 = new HashMap();
        	map2.put("image", t2);
        	map2.put("image_type","BASE64");
        	map2.put("face_type", "LIVE");
        	map2.put("quality_control","LOW");
        	map2.put("liveness_control","NONE");
        	images.add(map);
        	images.add(map2);
            String param = GsonUtils.toJson(images);

            // 注意这里仅为了简化编码每一次请求都去获取access_token，线上环境access_token有过期时间， 客户端可自行缓存，过期后重新获取。
            String accessToken =AuthService.getAuth();

            String result = HttpUtil.post(url, accessToken, "application/json", param);
            System.out.println(result);
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
    //    FaceMatch.faceMatch();
//    	String auth = AuthService.getAuth();
//    	System.out.println(auth);
    }
}
