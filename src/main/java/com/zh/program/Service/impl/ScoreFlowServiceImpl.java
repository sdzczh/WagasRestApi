package com.zh.program.Service.impl;

import com.zh.program.Dao.ScoreFlowMapper;
import com.zh.program.Entrty.ScoreFlow;
import com.zh.program.Service.ScoreFlowService;
import java.util.List;
import java.util.Map;
import javax.annotation.Resource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * 
 * @author: autogeneration
 * @date: 2019-04-09 10:15:19
 **/ 
@Service("scoreFlowService")
public class ScoreFlowServiceImpl implements ScoreFlowService {
    @Resource
    private ScoreFlowMapper scoreFlowMapper;

    private static final Logger logger = LoggerFactory.getLogger(ScoreFlowServiceImpl.class);

    @Override
    public int insert(ScoreFlow record) {
        return this.scoreFlowMapper.insert(record);
    }

    @Override
    public int insertSelective(ScoreFlow record) {
        return this.scoreFlowMapper.insertSelective(record);
    }

    @Override
    public int updateByPrimaryKey(ScoreFlow record) {
        return this.scoreFlowMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateByPrimaryKeySelective(ScoreFlow record) {
        return this.scoreFlowMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return this.scoreFlowMapper.deleteByPrimaryKey(id);
    }

    @Override
    public ScoreFlow selectByPrimaryKey(Integer id) {
        return this.scoreFlowMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<ScoreFlow> selectAll(Map<Object, Object> param) {
        return this.scoreFlowMapper.selectAll(param);
    }

    @Override
    public List<ScoreFlow> selectPaging(Map<Object, Object> param) {
        return this.scoreFlowMapper.selectPaging(param);
    }

    @Override
    public int selectCount(Map<Object, Object> param) {
        return this.scoreFlowMapper.selectCount(param);
    }
}