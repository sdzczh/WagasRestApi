package com.zh.program.Dao;

import com.zh.program.Entrty.UserLevel;
import java.util.List;
import java.util.Map;

public interface UserLevelMapper {
    int insert(UserLevel record);

    int insertSelective(UserLevel record);

    int updateByPrimaryKey(UserLevel record);

    int updateByPrimaryKeySelective(UserLevel record);

    int deleteByPrimaryKey(Integer id);

    UserLevel selectByPrimaryKey(Integer id);

    List<UserLevel> selectAll(Map<Object, Object> param);

    List<UserLevel> selectPaging(Map<Object, Object> param);

    int selectCount(Map<Object, Object> param);
}