package com.zh.program.Service.impl;

import com.zh.program.Dao.BillMapper;
import com.zh.program.Entrty.Bill;
import com.zh.program.Service.BillService;
import java.util.List;
import java.util.Map;
import javax.annotation.Resource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * 
 * @author: autogeneration
 * @date: 2019-04-09 10:10:54
 **/ 
@Service("billService")
public class BillServiceImpl implements BillService {
    @Resource
    private BillMapper billMapper;

    private static final Logger logger = LoggerFactory.getLogger(BillServiceImpl.class);

    @Override
    public int insert(Bill record) {
        return this.billMapper.insert(record);
    }

    @Override
    public int insertSelective(Bill record) {
        return this.billMapper.insertSelective(record);
    }

    @Override
    public int updateByPrimaryKey(Bill record) {
        return this.billMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateByPrimaryKeySelective(Bill record) {
        return this.billMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return this.billMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Bill selectByPrimaryKey(Integer id) {
        return this.billMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Bill> selectAll(Map<Object, Object> param) {
        return this.billMapper.selectAll(param);
    }

    @Override
    public List<Bill> selectPaging(Map<Object, Object> param) {
        return this.billMapper.selectPaging(param);
    }

    @Override
    public int selectCount(Map<Object, Object> param) {
        return this.billMapper.selectCount(param);
    }
}