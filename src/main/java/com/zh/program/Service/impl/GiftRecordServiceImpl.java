package com.zh.program.Service.impl;

import com.zh.program.Dao.GiftRecordMapper;
import com.zh.program.Entrty.GiftRecord;
import com.zh.program.Service.GiftRecordService;
import java.util.List;
import java.util.Map;
import javax.annotation.Resource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * 
 * @author: autogeneration
 * @date: 2019-04-09 10:13:58
 **/ 
@Service("giftRecordService")
public class GiftRecordServiceImpl implements GiftRecordService {
    @Resource
    private GiftRecordMapper giftRecordMapper;

    private static final Logger logger = LoggerFactory.getLogger(GiftRecordServiceImpl.class);

    @Override
    public int insert(GiftRecord record) {
        return this.giftRecordMapper.insert(record);
    }

    @Override
    public int insertSelective(GiftRecord record) {
        return this.giftRecordMapper.insertSelective(record);
    }

    @Override
    public int updateByPrimaryKey(GiftRecord record) {
        return this.giftRecordMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateByPrimaryKeySelective(GiftRecord record) {
        return this.giftRecordMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return this.giftRecordMapper.deleteByPrimaryKey(id);
    }

    @Override
    public GiftRecord selectByPrimaryKey(Integer id) {
        return this.giftRecordMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<GiftRecord> selectAll(Map<Object, Object> param) {
        return this.giftRecordMapper.selectAll(param);
    }

    @Override
    public List<GiftRecord> selectPaging(Map<Object, Object> param) {
        return this.giftRecordMapper.selectPaging(param);
    }

    @Override
    public int selectCount(Map<Object, Object> param) {
        return this.giftRecordMapper.selectCount(param);
    }
}