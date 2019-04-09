package com.zh.program.Dao;

import com.zh.program.Entrty.GiftRecord;
import java.util.List;
import java.util.Map;

public interface GiftRecordMapper {
    int insert(GiftRecord record);

    int insertSelective(GiftRecord record);

    int updateByPrimaryKey(GiftRecord record);

    int updateByPrimaryKeySelective(GiftRecord record);

    int deleteByPrimaryKey(Integer id);

    GiftRecord selectByPrimaryKey(Integer id);

    List<GiftRecord> selectAll(Map<Object, Object> param);

    List<GiftRecord> selectPaging(Map<Object, Object> param);

    int selectCount(Map<Object, Object> param);
}