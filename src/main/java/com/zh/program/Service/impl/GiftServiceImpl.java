package com.zh.program.Service.impl;

import com.zh.program.Dao.GiftMapper;
import com.zh.program.Entrty.Gift;
import com.zh.program.Service.GiftService;
import java.util.List;
import java.util.Map;
import javax.annotation.Resource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * 
 * @author: autogeneration
 * @date: 2019-04-09 10:13:26
 **/ 
@Service("giftService")
public class GiftServiceImpl implements GiftService {
    @Resource
    private GiftMapper giftMapper;

    private static final Logger logger = LoggerFactory.getLogger(GiftServiceImpl.class);

    @Override
    public int insert(Gift record) {
        return this.giftMapper.insert(record);
    }

    @Override
    public int insertSelective(Gift record) {
        return this.giftMapper.insertSelective(record);
    }

    @Override
    public int updateByPrimaryKey(Gift record) {
        return this.giftMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateByPrimaryKeySelective(Gift record) {
        return this.giftMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return this.giftMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Gift selectByPrimaryKey(Integer id) {
        return this.giftMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Gift> selectAll(Map<Object, Object> param) {
        return this.giftMapper.selectAll(param);
    }

    @Override
    public List<Gift> selectPaging(Map<Object, Object> param) {
        return this.giftMapper.selectPaging(param);
    }

    @Override
    public int selectCount(Map<Object, Object> param) {
        return this.giftMapper.selectCount(param);
    }
}