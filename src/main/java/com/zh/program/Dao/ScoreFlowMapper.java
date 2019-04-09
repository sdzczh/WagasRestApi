package com.zh.program.Dao;

import com.zh.program.Entrty.ScoreFlow;
import java.util.List;
import java.util.Map;

public interface ScoreFlowMapper {
    int insert(ScoreFlow record);

    int insertSelective(ScoreFlow record);

    int updateByPrimaryKey(ScoreFlow record);

    int updateByPrimaryKeySelective(ScoreFlow record);

    int deleteByPrimaryKey(Integer id);

    ScoreFlow selectByPrimaryKey(Integer id);

    List<ScoreFlow> selectAll(Map<Object, Object> param);

    List<ScoreFlow> selectPaging(Map<Object, Object> param);

    int selectCount(Map<Object, Object> param);
}