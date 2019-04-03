package com.zh.program.Service.impl;

import com.zh.program.Dao.UsersMapper;
import com.zh.program.Entrty.Users;
import com.zh.program.Service.UsersService;
import java.util.List;
import java.util.Map;
import javax.annotation.Resource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * 
 * @author: autogeneration
 * @date: 2019-04-03 16:33:25
 **/ 
@Service("usersService")
public class UsersServiceImpl implements UsersService {
    @Resource
    private UsersMapper usersMapper;

    private static final Logger logger = LoggerFactory.getLogger(UsersServiceImpl.class);

    @Override
    public int insert(Users record) {
        return this.usersMapper.insert(record);
    }

    @Override
    public int insertSelective(Users record) {
        return this.usersMapper.insertSelective(record);
    }

    @Override
    public int updateByPrimaryKey(Users record) {
        return this.usersMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateByPrimaryKeySelective(Users record) {
        return this.usersMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return this.usersMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Users selectByPrimaryKey(Integer id) {
        return this.usersMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Users> selectAll(Map<Object, Object> param) {
        return this.usersMapper.selectAll(param);
    }

    @Override
    public List<Users> selectPaging(Map<Object, Object> param) {
        return this.usersMapper.selectPaging(param);
    }

    @Override
    public int selectCount(Map<Object, Object> param) {
        return this.usersMapper.selectCount(param);
    }
}