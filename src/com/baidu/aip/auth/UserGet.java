package com.baidu.aip.auth;

import com.baidu.aip.util.HttpUtil;
import com.baidu.aip.util.GsonUtils;

import java.util.*;

/**
* 用户信息查询
*/
public class UserGet {

    public static String userGet(String user_id,String group_id) {
        // 请求url
        String url = "https://aip.baidubce.com/rest/2.0/face/v3/faceset/user/get";
        try {
            Map<String, Object> map = new HashMap<>();
            map.put("user_id",user_id);
            map.put("group_id",group_id);

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
        UserGet.userGet("user1","test");
    }
}
