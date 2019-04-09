package com.zh.program.Dao;

import com.zh.program.Entrty.UserInfo;
import java.util.List;
import java.util.Map;

public interface UserInfoMapper {
    int insert(UserInfo record);

    int insertSelective(UserInfo record);

    int updateByPrimaryKey(UserInfo record);

    int updateByPrimaryKeySelective(UserInfo record);

    int deleteByPrimaryKey(Integer id);

    UserInfo selectByPrimaryKey(Integer id);

    List<UserInfo> selectAll(Map<Object, Object> param);

    List<UserInfo> selectPaging(Map<Object, Object> param);

    int selectCount(Map<Object, Object> param);
}