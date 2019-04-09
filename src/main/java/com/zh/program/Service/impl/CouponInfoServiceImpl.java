package com.zh.program.Service.impl;

import com.zh.program.Dao.CouponInfoMapper;
import com.zh.program.Entrty.CouponInfo;
import com.zh.program.Service.CouponInfoService;
import java.util.List;
import java.util.Map;
import javax.annotation.Resource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * 
 * @author: autogeneration
 * @date: 2019-04-09 10:12:10
 **/ 
@Service("couponInfoService")
public class CouponInfoServiceImpl implements CouponInfoService {
    @Resource
    private CouponInfoMapper couponInfoMapper;

    private static final Logger logger = LoggerFactory.getLogger(CouponInfoServiceImpl.class);

    @Override
    public int insert(CouponInfo record) {
        return this.couponInfoMapper.insert(record);
    }

    @Override
    public int insertSelective(CouponInfo record) {
        return this.couponInfoMapper.insertSelective(record);
    }

    @Override
    public int updateByPrimaryKey(CouponInfo record) {
        return this.couponInfoMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateByPrimaryKeySelective(CouponInfo record) {
        return this.couponInfoMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return this.couponInfoMapper.deleteByPrimaryKey(id);
    }

    @Override
    public CouponInfo selectByPrimaryKey(Integer id) {
        return this.couponInfoMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<CouponInfo> selectAll(Map<Object, Object> param) {
        return this.couponInfoMapper.selectAll(param);
    }

    @Override
    public List<CouponInfo> selectPaging(Map<Object, Object> param) {
        return this.couponInfoMapper.selectPaging(param);
    }

    @Override
    public int selectCount(Map<Object, Object> param) {
        return this.couponInfoMapper.selectCount(param);
    }
}