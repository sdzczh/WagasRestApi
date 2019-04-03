package com.zh.program.Dao;

import com.zh.program.Entrty.Users;
import java.util.List;
import java.util.Map;

public interface UsersMapper {
    int insert(Users record);

    int insertSelective(Users record);

    int updateByPrimaryKey(Users record);

    int updateByPrimaryKeySelective(Users record);

    int deleteByPrimaryKey(Integer id);

    Users selectByPrimaryKey(Integer id);

    List<Users> selectAll(Map<Object, Object> param);

    List<Users> selectPaging(Map<Object, Object> param);

    int selectCount(Map<Object, Object> param);
}