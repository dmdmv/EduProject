package com.baidu.aip.auth;

import com.baidu.aip.util.HttpUtil;
import com.baidu.aip.util.Base64Util;
import com.baidu.aip.util.FileUtil;
import com.baidu.aip.util.GsonUtils;

import java.util.*;

/**
* �����Ա�
*/
public class FaceMatch {

    /**
    * ��Ҫ��ʾ���������蹤����
    * FileUtil,Base64Util,HttpUtil,GsonUtils���
    * https://ai.baidu.com/file/658A35ABAB2D404FBF903F64D47C1F72
    * https://ai.baidu.com/file/C8D81F3301E24D2892968F09AE1AD6E2
    * https://ai.baidu.com/file/544D677F5D4E4F17B4122FBD60DB82B3
    * https://ai.baidu.com/file/470B3ACCA3FE43788B5A963BF0B625F3
    * ����
    */
    public static String faceMatch() {
        // ����url
        String url = "https://aip.baidubce.com/rest/2.0/face/v3/match";
        try {
        	List images = new ArrayList<>();
        	
        	byte[] p1 = FileUtil.readFileByBytes("D:\\TianRuanRelative\\Test\\test1.jpg");
        	byte[] p2 = FileUtil.readFileByBytes("D:\\TianRuanRelative\\Test\\test2.jpg");
        	String t1 = Base64Util.encode(p1);
        	String t2 = Base64Util.encode(p2);
        	Map map = new HashMap();
        	map.put("image", t1);
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

            // ע�������Ϊ�˼򻯱���ÿһ������ȥ��ȡaccess_token�����ϻ���access_token�й���ʱ�䣬 �ͻ��˿����л��棬���ں����»�ȡ��
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
        FaceMatch.faceMatch();
//    	String auth = AuthService.getAuth();
//    	System.out.println(auth);
    }
}
