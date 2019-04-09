package com.zh.program.Controller;

import com.zh.program.Common.enums.ResultCode;
import com.zh.program.Dto.Result;
import com.zh.program.Entrty.UserAuth;
import com.zh.program.Service.UserAuthService;
import com.zh.program.Service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/auth")
public class AuthController {
    @Autowired
    private UserAuthService userAuthService;
    @Autowired
    private UserInfoService userInfoService;

    @GetMapping("/validate")
    public String getIdentity(String code){
        UserAuth userAuth = userAuthService.getUser(code);
        Integer status = userAuth.getAuth();
        String token = userAuth.getToken();
        Map<String, Object> map = new HashMap<>();
        map.put("status", status);
        map.put("token", token);
        return Result.toResult(ResultCode.SUCCESS, map);
    }
}
