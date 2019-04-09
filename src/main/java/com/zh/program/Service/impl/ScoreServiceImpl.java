package com.zh.program.Service.impl;

import com.zh.program.Dao.ScoreMapper;
import com.zh.program.Entrty.Score;
import com.zh.program.Service.ScoreService;
import java.util.List;
import java.util.Map;
import javax.annotation.Resource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * 
 * @author: autogeneration
 * @date: 2019-04-09 10:14:31
 **/ 
@Service("scoreService")
public class ScoreServiceImpl implements ScoreService {
    @Resource
    private ScoreMapper scoreMapper;

    private static final Logger logger = LoggerFactory.getLogger(ScoreServiceImpl.class);

    @Override
    public int insert(Score record) {
        return this.scoreMapper.insert(record);
    }

    @Override
    public int insertSelective(Score record) {
        return this.scoreMapper.insertSelective(record);
    }

    @Override
    public int updateByPrimaryKey(Score record) {
        return this.scoreMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateByPrimaryKeySelective(Score record) {
        return this.scoreMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return this.scoreMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Score selectByPrimaryKey(Integer id) {
        return this.scoreMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Score> selectAll(Map<Object, Object> param) {
        return this.scoreMapper.selectAll(param);
    }

    @Override
    public List<Score> selectPaging(Map<Object, Object> param) {
        return this.scoreMapper.selectPaging(param);
    }

    @Override
    public int selectCount(Map<Object, Object> param) {
        return this.scoreMapper.selectCount(param);
    }
}