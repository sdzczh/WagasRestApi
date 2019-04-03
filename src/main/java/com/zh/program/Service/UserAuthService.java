package com.zh.program.Service;

import com.zh.program.Entrty.UserAuth;
import java.util.List;
import java.util.Map;

/**
 * 
 * @author: autogeneration
 * @date: 2019-04-03 16:38:59
 **/ 
public interface UserAuthService {
    /**
     * 添加
     * 
     * @author: autogeneration
     * @date: 2019-04-03 16:38:59
     **/ 
    int insert(UserAuth record);

    /**
     * 添加
     * 
     * @author: autogeneration
     * @date: 2019-04-03 16:38:59
     **/ 
    int insertSelective(UserAuth record);

    /**
     * 更新
     * 
     * @author: autogeneration
     * @date: 2019-04-03 16:38:59
     **/ 
    int updateByPrimaryKey(UserAuth record);

    /**
     * 更新
     * 
     * @author: autogeneration
     * @date: 2019-04-03 16:38:59
     **/ 
    int updateByPrimaryKeySelective(UserAuth record);

    /**
     * 删除
     * 
     * @author: autogeneration
     * @date: 2019-04-03 16:38:59
     **/ 
    int deleteByPrimaryKey(Integer id);

    /**
     * 按主键查询
     * 
     * @author: autogeneration
     * @date: 2019-04-03 16:38:59
     **/ 
    UserAuth selectByPrimaryKey(Integer id);

    /**
     * 条件查询
     * 
     * @author: autogeneration
     * @date: 2019-04-03 16:38:59
     **/ 
    List<UserAuth> selectAll(Map<Object, Object> param);

    /**
     * 分页查询
     * 
     * @author: autogeneration
     * @date: 2019-04-03 16:38:59
     **/ 
    List<UserAuth> selectPaging(Map<Object, Object> param);

    /**
     * 统计查询
     * 
     * @author: autogeneration
     * @date: 2019-04-03 16:38:59
     **/ 
    int selectCount(Map<Object, Object> param);
}