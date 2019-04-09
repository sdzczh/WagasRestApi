package com.zh.program.Service;

import com.zh.program.Entrty.UserInfo;
import java.util.List;
import java.util.Map;

/**
 * 
 * @author: autogeneration
 * @date: 2019-04-09 10:16:43
 **/ 
public interface UserInfoService {
    /**
     * 添加
     * 
     * @author: autogeneration
     * @date: 2019-04-09 10:16:43
     **/ 
    int insert(UserInfo record);

    /**
     * 添加
     * 
     * @author: autogeneration
     * @date: 2019-04-09 10:16:43
     **/ 
    int insertSelective(UserInfo record);

    /**
     * 更新
     * 
     * @author: autogeneration
     * @date: 2019-04-09 10:16:43
     **/ 
    int updateByPrimaryKey(UserInfo record);

    /**
     * 更新
     * 
     * @author: autogeneration
     * @date: 2019-04-09 10:16:43
     **/ 
    int updateByPrimaryKeySelective(UserInfo record);

    /**
     * 删除
     * 
     * @author: autogeneration
     * @date: 2019-04-09 10:16:43
     **/ 
    int deleteByPrimaryKey(Integer id);

    /**
     * 按主键查询
     * 
     * @author: autogeneration
     * @date: 2019-04-09 10:16:43
     **/ 
    UserInfo selectByPrimaryKey(Integer id);

    /**
     * 条件查询
     * 
     * @author: autogeneration
     * @date: 2019-04-09 10:16:43
     **/ 
    List<UserInfo> selectAll(Map<Object, Object> param);

    /**
     * 分页查询
     * 
     * @author: autogeneration
     * @date: 2019-04-09 10:16:43
     **/ 
    List<UserInfo> selectPaging(Map<Object, Object> param);

    /**
     * 统计查询
     * 
     * @author: autogeneration
     * @date: 2019-04-09 10:16:43
     **/ 
    int selectCount(Map<Object, Object> param);
}