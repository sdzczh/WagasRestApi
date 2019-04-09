package com.zh.program.Dao;

import com.zh.program.Entrty.Score;
import java.util.List;
import java.util.Map;

public interface ScoreMapper {
    int insert(Score record);

    int insertSelective(Score record);

    int updateByPrimaryKey(Score record);

    int updateByPrimaryKeySelective(Score record);

    int deleteByPrimaryKey(Integer id);

    Score selectByPrimaryKey(Integer id);

    List<Score> selectAll(Map<Object, Object> param);

    List<Score> selectPaging(Map<Object, Object> param);

    int selectCount(Map<Object, Object> param);
}