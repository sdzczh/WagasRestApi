package com.zh.program.Service;

import com.zh.program.Entrty.Coupon;
import java.util.List;
import java.util.Map;

/**
 * 
 * @author: autogeneration
 * @date: 2019-04-09 10:11:30
 **/ 
public interface CouponService {
    /**
     * 添加
     * 
     * @author: autogeneration
     * @date: 2019-04-09 10:11:30
     **/ 
    int insert(Coupon record);

    /**
     * 添加
     * 
     * @author: autogeneration
     * @date: 2019-04-09 10:11:30
     **/ 
    int insertSelective(Coupon record);

    /**
     * 更新
     * 
     * @author: autogeneration
     * @date: 2019-04-09 10:11:30
     **/ 
    int updateByPrimaryKey(Coupon record);

    /**
     * 更新
     * 
     * @author: autogeneration
     * @date: 2019-04-09 10:11:30
     **/ 
    int updateByPrimaryKeySelective(Coupon record);

    /**
     * 删除
     * 
     * @author: autogeneration
     * @date: 2019-04-09 10:11:30
     **/ 
    int deleteByPrimaryKey(Integer id);

    /**
     * 按主键查询
     * 
     * @author: autogeneration
     * @date: 2019-04-09 10:11:30
     **/ 
    Coupon selectByPrimaryKey(Integer id);

    /**
     * 条件查询
     * 
     * @author: autogeneration
     * @date: 2019-04-09 10:11:30
     **/ 
    List<Coupon> selectAll(Map<Object, Object> param);

    /**
     * 分页查询
     * 
     * @author: autogeneration
     * @date: 2019-04-09 10:11:30
     **/ 
    List<Coupon> selectPaging(Map<Object, Object> param);

    /**
     * 统计查询
     * 
     * @author: autogeneration
     * @date: 2019-04-09 10:11:30
     **/ 
    int selectCount(Map<Object, Object> param);
}