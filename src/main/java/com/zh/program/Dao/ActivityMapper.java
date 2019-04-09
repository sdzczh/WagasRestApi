package com.zh.program.Dao;

import com.zh.program.Entrty.Activity;
import java.util.List;
import java.util.Map;

public interface ActivityMapper {
    int insert(Activity record);

    int insertSelective(Activity record);

    int updateByPrimaryKey(Activity record);

    int updateByPrimaryKeySelective(Activity record);

    int deleteByPrimaryKey(Integer id);

    Activity selectByPrimaryKey(Integer id);

    List<Activity> selectAll(Map<Object, Object> param);

    List<Activity> selectPaging(Map<Object, Object> param);

    int selectCount(Map<Object, Object> param);
}