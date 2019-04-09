package com.zh.program.Dao;

import com.zh.program.Entrty.CouponInfo;
import java.util.List;
import java.util.Map;

public interface CouponInfoMapper {
    int insert(CouponInfo record);

    int insertSelective(CouponInfo record);

    int updateByPrimaryKey(CouponInfo record);

    int updateByPrimaryKeySelective(CouponInfo record);

    int deleteByPrimaryKey(Integer id);

    CouponInfo selectByPrimaryKey(Integer id);

    List<CouponInfo> selectAll(Map<Object, Object> param);

    List<CouponInfo> selectPaging(Map<Object, Object> param);

    int selectCount(Map<Object, Object> param);
}