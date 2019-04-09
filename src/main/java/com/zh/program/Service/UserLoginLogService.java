package com.zh.program.Service;

import com.zh.program.Entrty.UserLoginLog;
import java.util.List;
import java.util.Map;

/**
 * 
 * @author: autogeneration
 * @date: 2019-04-09 10:17:55
 **/ 
public interface UserLoginLogService {
    /**
     * 添加
     * 
     * @author: autogeneration
     * @date: 2019-04-09 10:17:55
     **/ 
    int insert(UserLoginLog record);

    /**
     * 添加
     * 
     * @author: autogeneration
     * @date: 2019-04-09 10:17:55
     **/ 
    int insertSelective(UserLoginLog record);

    /**
     * 更新
     * 
     * @author: autogeneration
     * @date: 2019-04-09 10:17:55
     **/ 
    int updateByPrimaryKey(UserLoginLog record);

    /**
     * 更新
     * 
     * @author: autogeneration
     * @date: 2019-04-09 10:17:55
     **/ 
    int updateByPrimaryKeySelective(UserLoginLog record);

    /**
     * 删除
     * 
     * @author: autogeneration
     * @date: 2019-04-09 10:17:55
     **/ 
    int deleteByPrimaryKey(Integer id);

    /**
     * 按主键查询
     * 
     * @author: autogeneration
     * @date: 2019-04-09 10:17:55
     **/ 
    UserLoginLog selectByPrimaryKey(Integer id);

    /**
     * 条件查询
     * 
     * @author: autogeneration
     * @date: 2019-04-09 10:17:55
     **/ 
    List<UserLoginLog> selectAll(Map<Object, Object> param);

    /**
     * 分页查询
     * 
     * @author: autogeneration
     * @date: 2019-04-09 10:17:55
     **/ 
    List<UserLoginLog> selectPaging(Map<Object, Object> param);

    /**
     * 统计查询
     * 
     * @author: autogeneration
     * @date: 2019-04-09 10:17:55
     **/ 
    int selectCount(Map<Object, Object> param);
}