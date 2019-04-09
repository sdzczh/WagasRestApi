package com.zh.program.Service.impl;

import com.zh.program.Dao.CouponMapper;
import com.zh.program.Entrty.Coupon;
import com.zh.program.Service.CouponService;
import java.util.List;
import java.util.Map;
import javax.annotation.Resource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * 
 * @author: autogeneration
 * @date: 2019-04-09 10:11:30
 **/ 
@Service("couponService")
public class CouponServiceImpl implements CouponService {
    @Resource
    private CouponMapper couponMapper;

    private static final Logger logger = LoggerFactory.getLogger(CouponServiceImpl.class);

    @Override
    public int insert(Coupon record) {
        return this.couponMapper.insert(record);
    }

    @Override
    public int insertSelective(Coupon record) {
        return this.couponMapper.insertSelective(record);
    }

    @Override
    public int updateByPrimaryKey(Coupon record) {
        return this.couponMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateByPrimaryKeySelective(Coupon record) {
        return this.couponMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return this.couponMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Coupon selectByPrimaryKey(Integer id) {
        return this.couponMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Coupon> selectAll(Map<Object, Object> param) {
        return this.couponMapper.selectAll(param);
    }

    @Override
    public List<Coupon> selectPaging(Map<Object, Object> param) {
        return this.couponMapper.selectPaging(param);
    }

    @Override
    public int selectCount(Map<Object, Object> param) {
        return this.couponMapper.selectCount(param);
    }
}