package com.zh.program.Dao;

import com.zh.program.Entrty.CouponUser;
import java.util.List;
import java.util.Map;

public interface CouponUserMapper {
    int insert(CouponUser record);

    int insertSelective(CouponUser record);

    int updateByPrimaryKey(CouponUser record);

    int updateByPrimaryKeySelective(CouponUser record);

    int deleteByPrimaryKey(Integer id);

    CouponUser selectByPrimaryKey(Integer id);

    List<CouponUser> selectAll(Map<Object, Object> param);

    List<CouponUser> selectPaging(Map<Object, Object> param);

    int selectCount(Map<Object, Object> param);
}