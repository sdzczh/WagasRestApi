package com.zh.program.Dao;

import com.zh.program.Entrty.ActivityInfo;
import java.util.List;
import java.util.Map;

public interface ActivityInfoMapper {
    int insert(ActivityInfo record);

    int insertSelective(ActivityInfo record);

    int updateByPrimaryKey(ActivityInfo record);

    int updateByPrimaryKeySelective(ActivityInfo record);

    int deleteByPrimaryKey(Integer id);

    ActivityInfo selectByPrimaryKey(Integer id);

    List<ActivityInfo> selectAll(Map<Object, Object> param);

    List<ActivityInfo> selectPaging(Map<Object, Object> param);

    int selectCount(Map<Object, Object> param);
}