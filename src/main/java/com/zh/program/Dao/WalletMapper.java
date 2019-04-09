package com.zh.program.Dao;

import com.zh.program.Entrty.Wallet;
import java.util.List;
import java.util.Map;

public interface WalletMapper {
    int insert(Wallet record);

    int insertSelective(Wallet record);

    int updateByPrimaryKey(Wallet record);

    int updateByPrimaryKeySelective(Wallet record);

    int deleteByPrimaryKey(Integer id);

    Wallet selectByPrimaryKey(Integer id);

    List<Wallet> selectAll(Map<Object, Object> param);

    List<Wallet> selectPaging(Map<Object, Object> param);

    int selectCount(Map<Object, Object> param);
}