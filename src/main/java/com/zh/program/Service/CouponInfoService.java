package com.zh.program.Service;

import com.zh.program.Entrty.CouponInfo;
import java.util.List;
import java.util.Map;

/**
 * 
 * @author: autogeneration
 * @date: 2019-04-09 10:12:10
 **/ 
public interface CouponInfoService {
    /**
     * 添加
     * 
     * @author: autogeneration
     * @date: 2019-04-09 10:12:10
     **/ 
    int insert(CouponInfo record);

    /**
     * 添加
     * 
     * @author: autogeneration
     * @date: 2019-04-09 10:12:10
     **/ 
    int insertSelective(CouponInfo record);

    /**
     * 更新
     * 
     * @author: autogeneration
     * @date: 2019-04-09 10:12:10
     **/ 
    int updateByPrimaryKey(CouponInfo record);

    /**
     * 更新
     * 
     * @author: autogeneration
     * @date: 2019-04-09 10:12:10
     **/ 
    int updateByPrimaryKeySelective(CouponInfo record);

    /**
     * 删除
     * 
     * @author: autogeneration
     * @date: 2019-04-09 10:12:10
     **/ 
    int deleteByPrimaryKey(Integer id);

    /**
     * 按主键查询
     * 
     * @author: autogeneration
     * @date: 2019-04-09 10:12:10
     **/ 
    CouponInfo selectByPrimaryKey(Integer id);

    /**
     * 条件查询
     * 
     * @author: autogeneration
     * @date: 2019-04-09 10:12:10
     **/ 
    List<CouponInfo> selectAll(Map<Object, Object> param);

    /**
     * 分页查询
     * 
     * @author: autogeneration
     * @date: 2019-04-09 10:12:10
     **/ 
    List<CouponInfo> selectPaging(Map<Object, Object> param);

    /**
     * 统计查询
     * 
     * @author: autogeneration
     * @date: 2019-04-09 10:12:10
     **/ 
    int selectCount(Map<Object, Object> param);
}