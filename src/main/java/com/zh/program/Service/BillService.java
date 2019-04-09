package com.zh.program.Service;

import com.zh.program.Entrty.Bill;
import java.util.List;
import java.util.Map;

/**
 * 
 * @author: autogeneration
 * @date: 2019-04-09 10:10:54
 **/ 
public interface BillService {
    /**
     * 添加
     * 
     * @author: autogeneration
     * @date: 2019-04-09 10:10:54
     **/ 
    int insert(Bill record);

    /**
     * 添加
     * 
     * @author: autogeneration
     * @date: 2019-04-09 10:10:54
     **/ 
    int insertSelective(Bill record);

    /**
     * 更新
     * 
     * @author: autogeneration
     * @date: 2019-04-09 10:10:54
     **/ 
    int updateByPrimaryKey(Bill record);

    /**
     * 更新
     * 
     * @author: autogeneration
     * @date: 2019-04-09 10:10:54
     **/ 
    int updateByPrimaryKeySelective(Bill record);

    /**
     * 删除
     * 
     * @author: autogeneration
     * @date: 2019-04-09 10:10:54
     **/ 
    int deleteByPrimaryKey(Integer id);

    /**
     * 按主键查询
     * 
     * @author: autogeneration
     * @date: 2019-04-09 10:10:54
     **/ 
    Bill selectByPrimaryKey(Integer id);

    /**
     * 条件查询
     * 
     * @author: autogeneration
     * @date: 2019-04-09 10:10:54
     **/ 
    List<Bill> selectAll(Map<Object, Object> param);

    /**
     * 分页查询
     * 
     * @author: autogeneration
     * @date: 2019-04-09 10:10:54
     **/ 
    List<Bill> selectPaging(Map<Object, Object> param);

    /**
     * 统计查询
     * 
     * @author: autogeneration
     * @date: 2019-04-09 10:10:54
     **/ 
    int selectCount(Map<Object, Object> param);
}