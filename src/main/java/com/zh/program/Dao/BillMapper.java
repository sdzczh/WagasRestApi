package com.zh.program.Dao;

import com.zh.program.Entrty.Bill;
import java.util.List;
import java.util.Map;

public interface BillMapper {
    int insert(Bill record);

    int insertSelective(Bill record);

    int updateByPrimaryKey(Bill record);

    int updateByPrimaryKeySelective(Bill record);

    int deleteByPrimaryKey(Integer id);

    Bill selectByPrimaryKey(Integer id);

    List<Bill> selectAll(Map<Object, Object> param);

    List<Bill> selectPaging(Map<Object, Object> param);

    int selectCount(Map<Object, Object> param);
}