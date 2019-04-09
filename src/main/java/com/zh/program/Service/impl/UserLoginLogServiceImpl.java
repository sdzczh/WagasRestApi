package com.zh.program.Service.impl;

import com.zh.program.Dao.UserLoginLogMapper;
import com.zh.program.Entrty.UserLoginLog;
import com.zh.program.Service.UserLoginLogService;
import java.util.List;
import java.util.Map;
import javax.annotation.Resource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * 
 * @author: autogeneration
 * @date: 2019-04-09 10:17:55
 **/ 
@Service("userLoginLogService")
public class UserLoginLogServiceImpl implements UserLoginLogService {
    @Resource
    private UserLoginLogMapper userLoginLogMapper;

    private static final Logger logger = LoggerFactory.getLogger(UserLoginLogServiceImpl.class);

    @Override
    public int insert(UserLoginLog record) {
        return this.userLoginLogMapper.insert(record);
    }

    @Override
    public int insertSelective(UserLoginLog record) {
        return this.userLoginLogMapper.insertSelective(record);
    }

    @Override
    public int updateByPrimaryKey(UserLoginLog record) {
        return this.userLoginLogMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateByPrimaryKeySelective(UserLoginLog record) {
        return this.userLoginLogMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return this.userLoginLogMapper.deleteByPrimaryKey(id);
    }

    @Override
    public UserLoginLog selectByPrimaryKey(Integer id) {
        return this.userLoginLogMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<UserLoginLog> selectAll(Map<Object, Object> param) {
        return this.userLoginLogMapper.selectAll(param);
    }

    @Override
    public List<UserLoginLog> selectPaging(Map<Object, Object> param) {
        return this.userLoginLogMapper.selectPaging(param);
    }

    @Override
    public int selectCount(Map<Object, Object> param) {
        return this.userLoginLogMapper.selectCount(param);
    }
}