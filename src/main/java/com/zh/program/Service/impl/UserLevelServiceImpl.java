package com.zh.program.Service.impl;

import com.zh.program.Dao.UserLevelMapper;
import com.zh.program.Entrty.UserLevel;
import com.zh.program.Service.UserLevelService;
import java.util.List;
import java.util.Map;
import javax.annotation.Resource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * 
 * @author: autogeneration
 * @date: 2019-04-09 10:17:23
 **/ 
@Service("userLevelService")
public class UserLevelServiceImpl implements UserLevelService {
    @Resource
    private UserLevelMapper userLevelMapper;

    private static final Logger logger = LoggerFactory.getLogger(UserLevelServiceImpl.class);

    @Override
    public int insert(UserLevel record) {
        return this.userLevelMapper.insert(record);
    }

    @Override
    public int insertSelective(UserLevel record) {
        return this.userLevelMapper.insertSelective(record);
    }

    @Override
    public int updateByPrimaryKey(UserLevel record) {
        return this.userLevelMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateByPrimaryKeySelective(UserLevel record) {
        return this.userLevelMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return this.userLevelMapper.deleteByPrimaryKey(id);
    }

    @Override
    public UserLevel selectByPrimaryKey(Integer id) {
        return this.userLevelMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<UserLevel> selectAll(Map<Object, Object> param) {
        return this.userLevelMapper.selectAll(param);
    }

    @Override
    public List<UserLevel> selectPaging(Map<Object, Object> param) {
        return this.userLevelMapper.selectPaging(param);
    }

    @Override
    public int selectCount(Map<Object, Object> param) {
        return this.userLevelMapper.selectCount(param);
    }
}