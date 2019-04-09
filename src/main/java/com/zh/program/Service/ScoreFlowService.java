package com.zh.program.Service;

import com.zh.program.Entrty.ScoreFlow;
import java.util.List;
import java.util.Map;

/**
 * 
 * @author: autogeneration
 * @date: 2019-04-09 10:15:19
 **/ 
public interface ScoreFlowService {
    /**
     * 添加
     * 
     * @author: autogeneration
     * @date: 2019-04-09 10:15:19
     **/ 
    int insert(ScoreFlow record);

    /**
     * 添加
     * 
     * @author: autogeneration
     * @date: 2019-04-09 10:15:19
     **/ 
    int insertSelective(ScoreFlow record);

    /**
     * 更新
     * 
     * @author: autogeneration
     * @date: 2019-04-09 10:15:19
     **/ 
    int updateByPrimaryKey(ScoreFlow record);

    /**
     * 更新
     * 
     * @author: autogeneration
     * @date: 2019-04-09 10:15:19
     **/ 
    int updateByPrimaryKeySelective(ScoreFlow record);

    /**
     * 删除
     * 
     * @author: autogeneration
     * @date: 2019-04-09 10:15:19
     **/ 
    int deleteByPrimaryKey(Integer id);

    /**
     * 按主键查询
     * 
     * @author: autogeneration
     * @date: 2019-04-09 10:15:19
     **/ 
    ScoreFlow selectByPrimaryKey(Integer id);

    /**
     * 条件查询
     * 
     * @author: autogeneration
     * @date: 2019-04-09 10:15:19
     **/ 
    List<ScoreFlow> selectAll(Map<Object, Object> param);

    /**
     * 分页查询
     * 
     * @author: autogeneration
     * @date: 2019-04-09 10:15:19
     **/ 
    List<ScoreFlow> selectPaging(Map<Object, Object> param);

    /**
     * 统计查询
     * 
     * @author: autogeneration
     * @date: 2019-04-09 10:15:19
     **/ 
    int selectCount(Map<Object, Object> param);
}