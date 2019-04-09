package com.zh.program.Service;

import com.zh.program.Entrty.Activity;
import java.util.List;
import java.util.Map;

/**
 * 
 * @author: autogeneration
 * @date: 2019-04-09 10:07:53
 **/ 
public interface ActivityService {
    /**
     * 添加
     * 
     * @author: autogeneration
     * @date: 2019-04-09 10:07:53
     **/ 
    int insert(Activity record);

    /**
     * 添加
     * 
     * @author: autogeneration
     * @date: 2019-04-09 10:07:53
     **/ 
    int insertSelective(Activity record);

    /**
     * 更新
     * 
     * @author: autogeneration
     * @date: 2019-04-09 10:07:53
     **/ 
    int updateByPrimaryKey(Activity record);

    /**
     * 更新
     * 
     * @author: autogeneration
     * @date: 2019-04-09 10:07:53
     **/ 
    int updateByPrimaryKeySelective(Activity record);

    /**
     * 删除
     * 
     * @author: autogeneration
     * @date: 2019-04-09 10:07:53
     **/ 
    int deleteByPrimaryKey(Integer id);

    /**
     * 按主键查询
     * 
     * @author: autogeneration
     * @date: 2019-04-09 10:07:53
     **/ 
    Activity selectByPrimaryKey(Integer id);

    /**
     * 条件查询
     * 
     * @author: autogeneration
     * @date: 2019-04-09 10:07:53
     **/ 
    List<Activity> selectAll(Map<Object, Object> param);

    /**
     * 分页查询
     * 
     * @author: autogeneration
     * @date: 2019-04-09 10:07:53
     **/ 
    List<Activity> selectPaging(Map<Object, Object> param);

    /**
     * 统计查询
     * 
     * @author: autogeneration
     * @date: 2019-04-09 10:07:53
     **/ 
    int selectCount(Map<Object, Object> param);
}