package com.zh.program.Dao;

import com.zh.program.Entrty.Gift;
import java.util.List;
import java.util.Map;

public interface GiftMapper {
    int insert(Gift record);

    int insertSelective(Gift record);

    int updateByPrimaryKey(Gift record);

    int updateByPrimaryKeySelective(Gift record);

    int deleteByPrimaryKey(Integer id);

    Gift selectByPrimaryKey(Integer id);

    List<Gift> selectAll(Map<Object, Object> param);

    List<Gift> selectPaging(Map<Object, Object> param);

    int selectCount(Map<Object, Object> param);
}