package com.zh.program;

import com.alibaba.fastjson.JSONObject;
import com.zh.program.Common.Constants;
import com.zh.program.Common.encrypt.AES;
import com.zh.program.Common.encrypt.BASE64;
import com.zh.program.Common.encrypt.RSA;
import com.zh.program.Common.utils.HTTP;
import com.zh.program.Common.utils.StrUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ProgramApplicationTests {
    private static String webUrl = "http://localhost:8080/";
    private String get(String url,String params,String sign,String token){
        StringBuffer s = new StringBuffer();
        s.append(url)
                .append("?sign=").append(sign)
                .append("&params=").append(params);
        Map<String, String> map = null;
        if(!StrUtils.isBlank(token)){
            map = new HashMap<String, String>();
            map.put("token", token);
        }
        try {
            return HTTP.get(s.toString(), map);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    private String post(String url,String params,String sign,String token, String key){
        Map<String, String> body = new HashMap<String, String>();
        Map<String, String> header = null;
        body.put("params", params);
        if(!StrUtils.isBlank(sign)){
            body.put("sign", sign);
        }
        if(!StrUtils.isBlank(key)){
            body.put("secret_key", key);
        }

        if(!StrUtils.isBlank(token)){
            header = new HashMap<String, String>();
            header.put("token", token);
        }

        try {
            return HTTP.postFrom(url, header, body);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    @Test
    public void contextLoads() throws Exception {
        String aesKey = "5274e323bb474c36";
        String secretKey = RSA.encode(aesKey, RSA.getPublikKey(BASE64.decoderByte(Constants.RSA_PUBLIC_KEY)));
        String token = "5274e323bb474c36";
        String url = webUrl + "get";
        Map<String, Object> map = new HashMap<>();
        map.put("aaa", "123");
        JSONObject json = new JSONObject(map);
        String params = AES.encrypt(json.toJSONString(), aesKey);
        String result = post(url, params, null, token, token);
        System.out.println(result);
    }

}
