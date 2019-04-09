package com.zh.program.Dao;

import com.zh.program.Entrty.UserLoginLog;
import java.util.List;
import java.util.Map;

public interface UserLoginLogMapper {
    int insert(UserLoginLog record);

    int insertSelective(UserLoginLog record);

    int updateByPrimaryKey(UserLoginLog record);

    int updateByPrimaryKeySelective(UserLoginLog record);

    int deleteByPrimaryKey(Integer id);

    UserLoginLog selectByPrimaryKey(Integer id);

    List<UserLoginLog> selectAll(Map<Object, Object> param);

    List<UserLoginLog> selectPaging(Map<Object, Object> param);

    int selectCount(Map<Object, Object> param);
}