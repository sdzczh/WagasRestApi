package com.zh.program.Dao;

import com.zh.program.Entrty.WalletRecord;
import java.util.List;
import java.util.Map;

public interface WalletRecordMapper {
    int insert(WalletRecord record);

    int insertSelective(WalletRecord record);

    int updateByPrimaryKey(WalletRecord record);

    int updateByPrimaryKeySelective(WalletRecord record);

    int deleteByPrimaryKey(Integer id);

    WalletRecord selectByPrimaryKey(Integer id);

    List<WalletRecord> selectAll(Map<Object, Object> param);

    List<WalletRecord> selectPaging(Map<Object, Object> param);

    int selectCount(Map<Object, Object> param);
}