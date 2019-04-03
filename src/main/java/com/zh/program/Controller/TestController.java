package com.zh.program.Controller;

import com.alibaba.fastjson.JSONObject;
import com.zh.program.Common.authorization.annotation.Decrypt;
import com.zh.program.Entrty.Users;
import com.zh.program.Service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class TestController {
    @Resource
    private RedisTemplate<String, String> redis;
    @Autowired
    private UsersService usersService;

    @RequestMapping("/view")
    public String view(){
        return "index.html";
    }

    @Decrypt
    @ResponseBody
    @RequestMapping("get")
    public String get(){
        List<Users> list = usersService.selectAll(new HashMap<>());
        return JSONObject.toJSONString(list);
    }
    @ResponseBody
    @RequestMapping("get1")
    public String get1(){
        Map map = new HashMap();
        List<Users> list = usersService.selectAll(map);
        return JSONObject.toJSONString(list);
    }
/*
    @ResponseBody
    @RequestMapping("query")
    public String query(String name){
        List<User> list = userDao.query(name);
        return JSONObject.toJSONString(list);
    }*/
}
