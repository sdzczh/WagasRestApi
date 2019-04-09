package com.zh.program.Service.impl;

import com.zh.program.Dao.ActivityInfoMapper;
import com.zh.program.Entrty.ActivityInfo;
import com.zh.program.Service.ActivityInfoService;
import java.util.List;
import java.util.Map;
import javax.annotation.Resource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * 
 * @author: autogeneration
 * @date: 2019-04-09 10:09:10
 **/ 
@Service("activityInfoService")
public class ActivityInfoServiceImpl implements ActivityInfoService {
    @Resource
    private ActivityInfoMapper activityInfoMapper;

    private static final Logger logger = LoggerFactory.getLogger(ActivityInfoServiceImpl.class);

    @Override
    public int insert(ActivityInfo record) {
        return this.activityInfoMapper.insert(record);
    }

    @Override
    public int insertSelective(ActivityInfo record) {
        return this.activityInfoMapper.insertSelective(record);
    }

    @Override
    public int updateByPrimaryKey(ActivityInfo record) {
        return this.activityInfoMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateByPrimaryKeySelective(ActivityInfo record) {
        return this.activityInfoMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return this.activityInfoMapper.deleteByPrimaryKey(id);
    }

    @Override
    public ActivityInfo selectByPrimaryKey(Integer id) {
        return this.activityInfoMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<ActivityInfo> selectAll(Map<Object, Object> param) {
        return this.activityInfoMapper.selectAll(param);
    }

    @Override
    public List<ActivityInfo> selectPaging(Map<Object, Object> param) {
        return this.activityInfoMapper.selectPaging(param);
    }

    @Override
    public int selectCount(Map<Object, Object> param) {
        return this.activityInfoMapper.selectCount(param);
    }
}