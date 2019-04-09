package com.zh.program.Service.impl;

import com.zh.program.Dao.ActivityMapper;
import com.zh.program.Entrty.Activity;
import com.zh.program.Service.ActivityService;
import java.util.List;
import java.util.Map;
import javax.annotation.Resource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * 
 * @author: autogeneration
 * @date: 2019-04-09 10:07:53
 **/ 
@Service("activityService")
public class ActivityServiceImpl implements ActivityService {
    @Resource
    private ActivityMapper activityMapper;

    private static final Logger logger = LoggerFactory.getLogger(ActivityServiceImpl.class);

    @Override
    public int insert(Activity record) {
        return this.activityMapper.insert(record);
    }

    @Override
    public int insertSelective(Activity record) {
        return this.activityMapper.insertSelective(record);
    }

    @Override
    public int updateByPrimaryKey(Activity record) {
        return this.activityMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateByPrimaryKeySelective(Activity record) {
        return this.activityMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return this.activityMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Activity selectByPrimaryKey(Integer id) {
        return this.activityMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Activity> selectAll(Map<Object, Object> param) {
        return this.activityMapper.selectAll(param);
    }

    @Override
    public List<Activity> selectPaging(Map<Object, Object> param) {
        return this.activityMapper.selectPaging(param);
    }

    @Override
    public int selectCount(Map<Object, Object> param) {
        return this.activityMapper.selectCount(param);
    }
}