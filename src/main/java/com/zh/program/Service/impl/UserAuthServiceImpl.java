package com.zh.program.Service.impl;

import com.zh.program.Dao.UserAuthMapper;
import com.zh.program.Entrty.UserAuth;
import com.zh.program.Service.UserAuthService;
import java.util.List;
import java.util.Map;
import javax.annotation.Resource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * 
 * @author: autogeneration
 * @date: 2019-04-03 16:38:59
 **/ 
@Service("userAuthService")
public class UserAuthServiceImpl implements UserAuthService {
    @Resource
    private UserAuthMapper userAuthMapper;

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
}