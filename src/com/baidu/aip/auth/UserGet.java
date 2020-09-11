package com.baidu.aip.auth;

import com.baidu.aip.util.HttpUtil;
import com.baidu.aip.util.GsonUtils;

import java.util.*;

/**
* �û���Ϣ��ѯ
*/
public class UserGet {

    public static String userGet(String user_id,String group_id) {
        // ����url
        String url = "https://aip.baidubce.com/rest/2.0/face/v3/faceset/user/get";
        try {
            Map<String, Object> map = new HashMap<>();
            map.put("user_id",user_id);
            map.put("group_id",group_id);

            String param = GsonUtils.toJson(map);

            // ע�������Ϊ�˼򻯱���ÿһ������ȥ��ȡaccess_token�����ϻ���access_token�й���ʱ�䣬 �ͻ��˿����л��棬���ں����»�ȡ��
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
