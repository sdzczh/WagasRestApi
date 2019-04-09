package com.zh.program.Dao;

import com.zh.program.Entrty.Coupon;
import java.util.List;
import java.util.Map;

public interface CouponMapper {
    int insert(Coupon record);

    int insertSelective(Coupon record);

    int updateByPrimaryKey(Coupon record);

    int updateByPrimaryKeySelective(Coupon record);

    int deleteByPrimaryKey(Integer id);

    Coupon selectByPrimaryKey(Integer id);

    List<Coupon> selectAll(Map<Object, Object> param);

    List<Coupon> selectPaging(Map<Object, Object> param);

    int selectCount(Map<Object, Object> param);
}