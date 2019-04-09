package com.zh.program.Service.impl;

import com.zh.program.Common.Constants;
import com.zh.program.Common.exception.WeixinException;
import com.zh.program.Common.utils.CommonMethod;
import com.zh.program.Common.utils.UUIDs;
import com.zh.program.Dao.UserAuthMapper;
import com.zh.program.Dao.UsersMapper;
import com.zh.program.Dto.Token;
import com.zh.program.Dto.WxStatus;
import com.zh.program.Entrty.UserAuth;
import com.zh.program.Entrty.UserInfo;
import com.zh.program.Entrty.Users;
import com.zh.program.Service.UserAuthService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Resource;

import lombok.extern.log4j.Log4j2;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * 
 * @author: autogeneration
 * @date: 2019-04-03 16:38:59
 **/
@Log4j2
@Service("userAuthService")
public class UserAuthServiceImpl implements UserAuthService {
    @Resource
    private UserAuthMapper userAuthMapper;
    @Resource
    private UsersMapper usersMapper;

    private static final Logger logger = LoggerFactory.getLogger(UserAuthServiceImpl.class);

    @Override
    public int insert(UserAuth record) {
        return this.userAuthMapper.insert(record);
    }

    @Override
    public int insertSelective(UserAuth record) {
        return this.userAuthMapper.insertSelective(record);
    }

    @Override
    public int updateByPrimaryKey(UserAuth record) {
        return this.userAuthMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateByPrimaryKeySelective(UserAuth record) {
        return this.userAuthMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return this.userAuthMapper.deleteByPrimaryKey(id);
    }

    @Override
    public UserAuth selectByPrimaryKey(Integer id) {
        return this.userAuthMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<UserAuth> selectAll(Map<Object, Object> param) {
        return this.userAuthMapper.selectAll(param);
    }

    @Override
    public List<UserAuth> selectPaging(Map<Object, Object> param) {
        return this.userAuthMapper.selectPaging(param);
    }

    @Override
    public int selectCount(Map<Object, Object> param) {
        return this.userAuthMapper.selectCount(param);
    }

    @Override
    public UserAuth getUser(String code) {
        try {
            WxStatus wxStatus = CommonMethod.getWxStatus(code);
            String openid = wxStatus.getOpenid();
            Map<Object, Object> map = new HashMap<>();
            map.put("token", openid);
            List<UserAuth> list = userAuthMapper.selectAll(map);
            if(list == null || list.size() == 0){
                Users users = new Users();
                usersMapper.insert(users);
                UserAuth userAuth = new UserAuth();
                userAuth.setAuth(Constants.STATUS_USER);
                userAuth.setIdentityType(Constants.AUTHORIZE_WECHAT);
                userAuth.setToken(UUIDs.uuid());
                userAuth.setOpenId(openid);
                userAuth.setUserId(users.getId());
                userAuthMapper.insert(userAuth);
                return userAuth;
            }else{
                UserAuth userAuth = list.get(0);
                userAuth.setToken(UUIDs.uuid());
                return userAuth;
            }
        } catch (Exception e) {
            e.printStackTrace();
            log.info(WeixinException.ACCESS_TOKEN_ERROR);
            return null;
        }
    }
}