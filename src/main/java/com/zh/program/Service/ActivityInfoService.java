package com.zh.program.Service;

import com.zh.program.Entrty.ActivityInfo;
import java.util.List;
import java.util.Map;

/**
 * 
 * @author: autogeneration
 * @date: 2019-04-09 10:09:10
 **/ 
public interface ActivityInfoService {
    /**
     * 添加
     * 
     * @author: autogeneration
     * @date: 2019-04-09 10:09:10
     **/ 
    int insert(ActivityInfo record);

    /**
     * 添加
     * 
     * @author: autogeneration
     * @date: 2019-04-09 10:09:10
     **/ 
    int insertSelective(ActivityInfo record);

    /**
     * 更新
     * 
     * @author: autogeneration
     * @date: 2019-04-09 10:09:10
     **/ 
    int updateByPrimaryKey(ActivityInfo record);

    /**
     * 更新
     * 
     * @author: autogeneration
     * @date: 2019-04-09 10:09:10
     **/ 
    int updateByPrimaryKeySelective(ActivityInfo record);

    /**
     * 删除
     * 
     * @author: autogeneration
     * @date: 2019-04-09 10:09:10
     **/ 
    int deleteByPrimaryKey(Integer id);

    /**
     * 按主键查询
     * 
     * @author: autogeneration
     * @date: 2019-04-09 10:09:10
     **/ 
    ActivityInfo selectByPrimaryKey(Integer id);

    /**
     * 条件查询
     * 
     * @author: autogeneration
     * @date: 2019-04-09 10:09:10
     **/ 
    List<ActivityInfo> selectAll(Map<Object, Object> param);

    /**
     * 分页查询
     * 
     * @author: autogeneration
     * @date: 2019-04-09 10:09:10
     **/ 
    List<ActivityInfo> selectPaging(Map<Object, Object> param);

    /**
     * 统计查询
     * 
     * @author: autogeneration
     * @date: 2019-04-09 10:09:10
     **/ 
    int selectCount(Map<Object, Object> param);
}