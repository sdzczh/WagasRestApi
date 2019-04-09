package com.zh.program.Service.impl;

import com.zh.program.Dao.ActivityRecordMapper;
import com.zh.program.Entrty.ActivityRecord;
import com.zh.program.Service.ActivityRecordService;
import java.util.List;
import java.util.Map;
import javax.annotation.Resource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * 
 * @author: autogeneration
 * @date: 2019-04-09 10:09:52
 **/ 
@Service("activityRecordService")
public class ActivityRecordServiceImpl implements ActivityRecordService {
    @Resource
    private ActivityRecordMapper activityRecordMapper;

    private static final Logger logger = LoggerFactory.getLogger(ActivityRecordServiceImpl.class);

    @Override
    public int insert(ActivityRecord record) {
        return this.activityRecordMapper.insert(record);
    }

    @Override
    public int insertSelective(ActivityRecord record) {
        return this.activityRecordMapper.insertSelective(record);
    }

    @Override
    public int updateByPrimaryKey(ActivityRecord record) {
        return this.activityRecordMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateByPrimaryKeySelective(ActivityRecord record) {
        return this.activityRecordMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return this.activityRecordMapper.deleteByPrimaryKey(id);
    }

    @Override
    public ActivityRecord selectByPrimaryKey(Integer id) {
        return this.activityRecordMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<ActivityRecord> selectAll(Map<Object, Object> param) {
        return this.activityRecordMapper.selectAll(param);
    }

    @Override
    public List<ActivityRecord> selectPaging(Map<Object, Object> param) {
        return this.activityRecordMapper.selectPaging(param);
    }

    @Override
    public int selectCount(Map<Object, Object> param) {
        return this.activityRecordMapper.selectCount(param);
    }
}