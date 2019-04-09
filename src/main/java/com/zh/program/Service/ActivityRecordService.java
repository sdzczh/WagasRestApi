package com.zh.program.Service;

import com.zh.program.Entrty.ActivityRecord;
import java.util.List;
import java.util.Map;

/**
 * 
 * @author: autogeneration
 * @date: 2019-04-09 10:09:52
 **/ 
public interface ActivityRecordService {
    /**
     * 添加
     * 
     * @author: autogeneration
     * @date: 2019-04-09 10:09:52
     **/ 
    int insert(ActivityRecord record);

    /**
     * 添加
     * 
     * @author: autogeneration
     * @date: 2019-04-09 10:09:52
     **/ 
    int insertSelective(ActivityRecord record);

    /**
     * 更新
     * 
     * @author: autogeneration
     * @date: 2019-04-09 10:09:52
     **/ 
    int updateByPrimaryKey(ActivityRecord record);

    /**
     * 更新
     * 
     * @author: autogeneration
     * @date: 2019-04-09 10:09:52
     **/ 
    int updateByPrimaryKeySelective(ActivityRecord record);

    /**
     * 删除
     * 
     * @author: autogeneration
     * @date: 2019-04-09 10:09:52
     **/ 
    int deleteByPrimaryKey(Integer id);

    /**
     * 按主键查询
     * 
     * @author: autogeneration
     * @date: 2019-04-09 10:09:52
     **/ 
    ActivityRecord selectByPrimaryKey(Integer id);

    /**
     * 条件查询
     * 
     * @author: autogeneration
     * @date: 2019-04-09 10:09:52
     **/ 
    List<ActivityRecord> selectAll(Map<Object, Object> param);

    /**
     * 分页查询
     * 
     * @author: autogeneration
     * @date: 2019-04-09 10:09:52
     **/ 
    List<ActivityRecord> selectPaging(Map<Object, Object> param);

    /**
     * 统计查询
     * 
     * @author: autogeneration
     * @date: 2019-04-09 10:09:52
     **/ 
    int selectCount(Map<Object, Object> param);
}