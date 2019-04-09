package com.zh.program.Service.impl;

import com.zh.program.Dao.CouponUserMapper;
import com.zh.program.Entrty.CouponUser;
import com.zh.program.Service.CouponUserService;
import java.util.List;
import java.util.Map;
import javax.annotation.Resource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * 
 * @author: autogeneration
 * @date: 2019-04-09 10:12:47
 **/ 
@Service("couponUserService")
public class CouponUserServiceImpl implements CouponUserService {
    @Resource
    private CouponUserMapper couponUserMapper;

    private static final Logger logger = LoggerFactory.getLogger(CouponUserServiceImpl.class);

    @Override
    public int insert(CouponUser record) {
        return this.couponUserMapper.insert(record);
    }

    @Override
    public int insertSelective(CouponUser record) {
        return this.couponUserMapper.insertSelective(record);
    }

    @Override
    public int updateByPrimaryKey(CouponUser record) {
        return this.couponUserMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateByPrimaryKeySelective(CouponUser record) {
        return this.couponUserMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return this.couponUserMapper.deleteByPrimaryKey(id);
    }

    @Override
    public CouponUser selectByPrimaryKey(Integer id) {
        return this.couponUserMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<CouponUser> selectAll(Map<Object, Object> param) {
        return this.couponUserMapper.selectAll(param);
    }

    @Override
    public List<CouponUser> selectPaging(Map<Object, Object> param) {
        return this.couponUserMapper.selectPaging(param);
    }

    @Override
    public int selectCount(Map<Object, Object> param) {
        return this.couponUserMapper.selectCount(param);
    }
}