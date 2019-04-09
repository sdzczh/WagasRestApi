package com.zh.program.Service.impl;

import com.zh.program.Dao.WalletMapper;
import com.zh.program.Entrty.Wallet;
import com.zh.program.Service.WalletService;
import java.util.List;
import java.util.Map;
import javax.annotation.Resource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * 
 * @author: autogeneration
 * @date: 2019-04-09 10:18:39
 **/ 
@Service("walletService")
public class WalletServiceImpl implements WalletService {
    @Resource
    private WalletMapper walletMapper;

    private static final Logger logger = LoggerFactory.getLogger(WalletServiceImpl.class);

    @Override
    public int insert(Wallet record) {
        return this.walletMapper.insert(record);
    }

    @Override
    public int insertSelective(Wallet record) {
        return this.walletMapper.insertSelective(record);
    }

    @Override
    public int updateByPrimaryKey(Wallet record) {
        return this.walletMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateByPrimaryKeySelective(Wallet record) {
        return this.walletMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return this.walletMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Wallet selectByPrimaryKey(Integer id) {
        return this.walletMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Wallet> selectAll(Map<Object, Object> param) {
        return this.walletMapper.selectAll(param);
    }

    @Override
    public List<Wallet> selectPaging(Map<Object, Object> param) {
        return this.walletMapper.selectPaging(param);
    }

    @Override
    public int selectCount(Map<Object, Object> param) {
        return this.walletMapper.selectCount(param);
    }
}