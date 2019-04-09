package com.zh.program.Dao;

import com.zh.program.Entrty.ActivityRecord;
import java.util.List;
import java.util.Map;

public interface ActivityRecordMapper {
    int insert(ActivityRecord record);

    int insertSelective(ActivityRecord record);

    int updateByPrimaryKey(ActivityRecord record);

    int updateByPrimaryKeySelective(ActivityRecord record);

    int deleteByPrimaryKey(Integer id);

    ActivityRecord selectByPrimaryKey(Integer id);

    List<ActivityRecord> selectAll(Map<Object, Object> param);

    List<ActivityRecord> selectPaging(Map<Object, Object> param);

    int selectCount(Map<Object, Object> param);
}