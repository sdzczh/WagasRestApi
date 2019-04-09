package com.zh.program.Service;

import com.zh.program.Entrty.GiftRecord;
import java.util.List;
import java.util.Map;

/**
 * 
 * @author: autogeneration
 * @date: 2019-04-09 10:13:58
 **/ 
public interface GiftRecordService {
    /**
     * 添加
     * 
     * @author: autogeneration
     * @date: 2019-04-09 10:13:58
     **/ 
    int insert(GiftRecord record);

    /**
     * 添加
     * 
     * @author: autogeneration
     * @date: 2019-04-09 10:13:58
     **/ 
    int insertSelective(GiftRecord record);

    /**
     * 更新
     * 
     * @author: autogeneration
     * @date: 2019-04-09 10:13:58
     **/ 
    int updateByPrimaryKey(GiftRecord record);

    /**
     * 更新
     * 
     * @author: autogeneration
     * @date: 2019-04-09 10:13:58
     **/ 
    int updateByPrimaryKeySelective(GiftRecord record);

    /**
     * 删除
     * 
     * @author: autogeneration
     * @date: 2019-04-09 10:13:58
     **/ 
    int deleteByPrimaryKey(Integer id);

    /**
     * 按主键查询
     * 
     * @author: autogeneration
     * @date: 2019-04-09 10:13:58
     **/ 
    GiftRecord selectByPrimaryKey(Integer id);

    /**
     * 条件查询
     * 
     * @author: autogeneration
     * @date: 2019-04-09 10:13:58
     **/ 
    List<GiftRecord> selectAll(Map<Object, Object> param);

    /**
     * 分页查询
     * 
     * @author: autogeneration
     * @date: 2019-04-09 10:13:58
     **/ 
    List<GiftRecord> selectPaging(Map<Object, Object> param);

    /**
     * 统计查询
     * 
     * @author: autogeneration
     * @date: 2019-04-09 10:13:58
     **/ 
    int selectCount(Map<Object, Object> param);
}