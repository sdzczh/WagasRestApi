package com.zh.program.Service.impl;

import com.zh.program.Dao.UserInfoMapper;
import com.zh.program.Entrty.UserInfo;
import com.zh.program.Service.UserInfoService;
import java.util.List;
import java.util.Map;
import javax.annotation.Resource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * 
 * @author: autogeneration
 * @date: 2019-04-09 10:16:43
 **/ 
@Service("userInfoService")
public class UserInfoServiceImpl implements UserInfoService {
    @Resource
    private UserInfoMapper userInfoMapper;

    private static final Logger logger = LoggerFactory.getLogger(UserInfoServiceImpl.class);

    @Override
    public int insert(UserInfo record) {
        return this.userInfoMapper.insert(record);
    }

    @Override
    public int insertSelective(UserInfo record) {
        return this.userInfoMapper.insertSelective(record);
    }

    @Override
    public int updateByPrimaryKey(UserInfo record) {
        return this.userInfoMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateByPrimaryKeySelective(UserInfo record) {
        return this.userInfoMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return this.userInfoMapper.deleteByPrimaryKey(id);
    }

    @Override
    public UserInfo selectByPrimaryKey(Integer id) {
        return this.userInfoMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<UserInfo> selectAll(Map<Object, Object> param) {
        return this.userInfoMapper.selectAll(param);
    }

    @Override
    public List<UserInfo> selectPaging(Map<Object, Object> param) {
        return this.userInfoMapper.selectPaging(param);
    }

    @Override
    public int selectCount(Map<Object, Object> param) {
        return this.userInfoMapper.selectCount(param);
    }
}