package com.zh.program.Service.impl;

import com.zh.program.Dao.WalletRecordMapper;
import com.zh.program.Entrty.WalletRecord;
import com.zh.program.Service.WalletRecordService;
import java.util.List;
import java.util.Map;
import javax.annotation.Resource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * 
 * @author: autogeneration
 * @date: 2019-04-09 10:19:20
 **/ 
@Service("walletRecordService")
public class WalletRecordServiceImpl implements WalletRecordService {
    @Resource
    private WalletRecordMapper walletRecordMapper;

    private static final Logger logger = LoggerFactory.getLogger(WalletRecordServiceImpl.class);

    @Override
    public int insert(WalletRecord record) {
        return this.walletRecordMapper.insert(record);
    }

    @Override
    public int insertSelective(WalletRecord record) {
        return this.walletRecordMapper.insertSelective(record);
    }

    @Override
    public int updateByPrimaryKey(WalletRecord record) {
        return this.walletRecordMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateByPrimaryKeySelective(WalletRecord record) {
        return this.walletRecordMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return this.walletRecordMapper.deleteByPrimaryKey(id);
    }

    @Override
    public WalletRecord selectByPrimaryKey(Integer id) {
        return this.walletRecordMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<WalletRecord> selectAll(Map<Object, Object> param) {
        return this.walletRecordMapper.selectAll(param);
    }

    @Override
    public List<WalletRecord> selectPaging(Map<Object, Object> param) {
        return this.walletRecordMapper.selectPaging(param);
    }

    @Override
    public int selectCount(Map<Object, Object> param) {
        return this.walletRecordMapper.selectCount(param);
    }
}