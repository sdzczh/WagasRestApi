package com.zh.program.Service;

import com.zh.program.Entrty.UserLevel;
import java.util.List;
import java.util.Map;

/**
 * 
 * @author: autogeneration
 * @date: 2019-04-09 10:17:23
 **/ 
public interface UserLevelService {
    /**
     * 添加
     * 
     * @author: autogeneration
     * @date: 2019-04-09 10:17:23
     **/ 
    int insert(UserLevel record);

    /**
     * 添加
     * 
     * @author: autogeneration
     * @date: 2019-04-09 10:17:23
     **/ 
    int insertSelective(UserLevel record);

    /**
     * 更新
     * 
     * @author: autogeneration
     * @date: 2019-04-09 10:17:23
     **/ 
    int updateByPrimaryKey(UserLevel record);

    /**
     * 更新
     * 
     * @author: autogeneration
     * @date: 2019-04-09 10:17:23
     **/ 
    int updateByPrimaryKeySelective(UserLevel record);

    /**
     * 删除
     * 
     * @author: autogeneration
     * @date: 2019-04-09 10:17:23
     **/ 
    int deleteByPrimaryKey(Integer id);

    /**
     * 按主键查询
     * 
     * @author: autogeneration
     * @date: 2019-04-09 10:17:23
     **/ 
    UserLevel selectByPrimaryKey(Integer id);

    /**
     * 条件查询
     * 
     * @author: autogeneration
     * @date: 2019-04-09 10:17:23
     **/ 
    List<UserLevel> selectAll(Map<Object, Object> param);

    /**
     * 分页查询
     * 
     * @author: autogeneration
     * @date: 2019-04-09 10:17:23
     **/ 
    List<UserLevel> selectPaging(Map<Object, Object> param);

    /**
     * 统计查询
     * 
     * @author: autogeneration
     * @date: 2019-04-09 10:17:23
     **/ 
    int selectCount(Map<Object, Object> param);
}