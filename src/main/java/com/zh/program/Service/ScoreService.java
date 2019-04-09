package com.zh.program.Service;

import com.zh.program.Entrty.Score;
import java.util.List;
import java.util.Map;

/**
 * 
 * @author: autogeneration
 * @date: 2019-04-09 10:14:31
 **/ 
public interface ScoreService {
    /**
     * 添加
     * 
     * @author: autogeneration
     * @date: 2019-04-09 10:14:31
     **/ 
    int insert(Score record);

    /**
     * 添加
     * 
     * @author: autogeneration
     * @date: 2019-04-09 10:14:31
     **/ 
    int insertSelective(Score record);

    /**
     * 更新
     * 
     * @author: autogeneration
     * @date: 2019-04-09 10:14:31
     **/ 
    int updateByPrimaryKey(Score record);

    /**
     * 更新
     * 
     * @author: autogeneration
     * @date: 2019-04-09 10:14:31
     **/ 
    int updateByPrimaryKeySelective(Score record);

    /**
     * 删除
     * 
     * @author: autogeneration
     * @date: 2019-04-09 10:14:31
     **/ 
    int deleteByPrimaryKey(Integer id);

    /**
     * 按主键查询
     * 
     * @author: autogeneration
     * @date: 2019-04-09 10:14:31
     **/ 
    Score selectByPrimaryKey(Integer id);

    /**
     * 条件查询
     * 
     * @author: autogeneration
     * @date: 2019-04-09 10:14:31
     **/ 
    List<Score> selectAll(Map<Object, Object> param);

    /**
     * 分页查询
     * 
     * @author: autogeneration
     * @date: 2019-04-09 10:14:31
     **/ 
    List<Score> selectPaging(Map<Object, Object> param);

    /**
     * 统计查询
     * 
     * @author: autogeneration
     * @date: 2019-04-09 10:14:31
     **/ 
    int selectCount(Map<Object, Object> param);
}