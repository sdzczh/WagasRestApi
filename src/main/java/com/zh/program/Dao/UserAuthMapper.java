package com.zh.program.Dao;

import com.zh.program.Entrty.UserAuth;
import java.util.List;
import java.util.Map;

public interface UserAuthMapper {
    int insert(UserAuth record);

    int insertSelective(UserAuth record);

    int updateByPrimaryKey(UserAuth record);

    int updateByPrimaryKeySelective(UserAuth record);

    int deleteByPrimaryKey(Integer id);

    UserAuth selectByPrimaryKey(Integer id);

    List<UserAuth> selectAll(Map<Object, Object> param);

    List<UserAuth> selectPaging(Map<Object, Object> param);

    int selectCount(Map<Object, Object> param);
}