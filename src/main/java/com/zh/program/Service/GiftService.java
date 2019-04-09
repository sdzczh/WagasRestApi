package com.zh.program.Service;

import com.zh.program.Entrty.Gift;
import java.util.List;
import java.util.Map;

/**
 * 
 * @author: autogeneration
 * @date: 2019-04-09 10:13:26
 **/ 
public interface GiftService {
    /**
     * 添加
     * 
     * @author: autogeneration
     * @date: 2019-04-09 10:13:26
     **/ 
    int insert(Gift record);

    /**
     * 添加
     * 
     * @author: autogeneration
     * @date: 2019-04-09 10:13:26
     **/ 
    int insertSelective(Gift record);

    /**
     * 更新
     * 
     * @author: autogeneration
     * @date: 2019-04-09 10:13:26
     **/ 
    int updateByPrimaryKey(Gift record);

    /**
     * 更新
     * 
     * @author: autogeneration
     * @date: 2019-04-09 10:13:26
     **/ 
    int updateByPrimaryKeySelective(Gift record);

    /**
     * 删除
     * 
     * @author: autogeneration
     * @date: 2019-04-09 10:13:26
     **/ 
    int deleteByPrimaryKey(Integer id);

    /**
     * 按主键查询
     * 
     * @author: autogeneration
     * @date: 2019-04-09 10:13:26
     **/ 
    Gift selectByPrimaryKey(Integer id);

    /**
     * 条件查询
     * 
     * @author: autogeneration
     * @date: 2019-04-09 10:13:26
     **/ 
    List<Gift> selectAll(Map<Object, Object> param);

    /**
     * 分页查询
     * 
     * @author: autogeneration
     * @date: 2019-04-09 10:13:26
     **/ 
    List<Gift> selectPaging(Map<Object, Object> param);

    /**
     * 统计查询
     * 
     * @author: autogeneration
     * @date: 2019-04-09 10:13:26
     **/ 
    int selectCount(Map<Object, Object> param);
}