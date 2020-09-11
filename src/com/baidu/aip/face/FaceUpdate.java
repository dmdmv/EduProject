package com.baidu.aip.face;

import com.baidu.aip.util.HttpUtil;
import com.baidu.aip.auth.AuthService;
import com.baidu.aip.util.Base64Util;
import com.baidu.aip.util.FileUtil;
import com.baidu.aip.util.GsonUtils;

import java.io.IOException;
import java.util.*;

/**
* 人脸更新
*/
public class FaceUpdate {

    /**
    * 重要提示代码中所需工具类
    * FileUtil,Base64Util,HttpUtil,GsonUtils请从
    * https://ai.baidu.com/file/658A35ABAB2D404FBF903F64D47C1F72
    * https://ai.baidu.com/file/C8D81F3301E24D2892968F09AE1AD6E2
    * https://ai.baidu.com/file/544D677F5D4E4F17B4122FBD60DB82B3
    * https://ai.baidu.com/file/470B3ACCA3FE43788B5A963BF0B625F3
    * 下载
    */
    public static String faceUpdate(String image) {
        // 请求url
        String url = "https://aip.baidubce.com/rest/2.0/face/v3/faceset/user/update";
        try {
            Map<String, Object> map = new HashMap<>();
            map.put("image",image);
            map.put("group_id", "test");
            map.put("user_id", "328478274");
            map.put("user_info", "sda");
            map.put("liveness_control", "NORMAL");
            map.put("image_type","BASE64");
            map.put("quality_control", "LOW");

            String param = GsonUtils.toJson(map);

            // 注意这里仅为了简化编码每一次请求都去获取access_token，线上环境access_token有过期时间， 客户端可自行缓存，过期后重新获取。
            String accessToken = AuthService.getAuth();

            String result = HttpUtil.post(url, accessToken, "application/json", param);
            System.out.println(result);
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
    	byte[] bytes1;
		try {
			bytes1 = FileUtil.readFileByBytes("D:\\TianRuanRelative\\Test\\test1.jpg");
			String image = Base64Util.encode(bytes1);
			FaceUpdate.faceUpdate(image);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
