package com.zh.program.Controller;

import com.zh.program.Common.authorization.annotation.CurrentUser;
import com.zh.program.Common.enums.ResultCode;
import com.zh.program.Common.utils.StrUtils;
import com.zh.program.Dto.Result;
import com.zh.program.Entrty.UserAuth;
import com.zh.program.Entrty.UserInfo;
import com.zh.program.Service.UserAuthService;
import com.zh.program.Service.UserInfoService;
import com.zh.program.Service.UserLoginLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("userLogin")
public class UserLoginController {
    @Autowired
    private UserAuthService userAuthService;
    @Autowired
    private UserInfoService userInfoService;
    @Autowired
    private UserLoginLogService userLoginLogService;

    public String regiestUser(@CurrentUser UserAuth userAuth, HttpServletRequest request, String phone){
        if(StrUtils.isBlank(phone)){
            return Result.toResult(ResultCode.PARAM_IS_BLANK);
        }
        userAuth = (UserAuth) request.getAttribute("user");
        Map<Object, Object> map = new HashMap<>();
        map.put("userId", userAuth.getUserId());
        List<UserInfo> userInfoList = userInfoService.selectAll(map);
        if(userInfoList.size() == 0){
            return Result.toResult(ResultCode.PARAM_IS_INVALID);
        }
        UserInfo userInfo = userInfoList.get(0);
        userInfo.setPhone(phone);
        userInfoService.updateByPrimaryKeySelective(userInfo);
        return Result.toResult(ResultCode.SUCCESS);
    }
}
