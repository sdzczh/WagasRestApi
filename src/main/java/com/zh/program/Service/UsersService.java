package com.zh.program.Service;

import com.zh.program.Entrty.Users;
import java.util.List;
import java.util.Map;

/**
 * 
 * @author: autogeneration
 * @date: 2019-04-03 16:33:25
 **/ 
public interface UsersService {
    /**
     * 添加
     * 
     * @author: autogeneration
     * @date: 2019-04-03 16:33:25
     **/ 
    int insert(Users record);

    /**
     * 添加
     * 
     * @author: autogeneration
     * @date: 2019-04-03 16:33:25
     **/ 
    int insertSelective(Users record);

    /**
     * 更新
     * 
     * @author: autogeneration
     * @date: 2019-04-03 16:33:25
     **/ 
    int updateByPrimaryKey(Users record);

    /**
     * 更新
     * 
     * @author: autogeneration
     * @date: 2019-04-03 16:33:25
     **/ 
    int updateByPrimaryKeySelective(Users record);

    /**
     * 删除
     * 
     * @author: autogeneration
     * @date: 2019-04-03 16:33:25
     **/ 
    int deleteByPrimaryKey(Integer id);

    /**
     * 按主键查询
     * 
     * @author: autogeneration
     * @date: 2019-04-03 16:33:25
     **/ 
    Users selectByPrimaryKey(Integer id);

    /**
     * 条件查询
     * 
     * @author: autogeneration
     * @date: 2019-04-03 16:33:25
     **/ 
    List<Users> selectAll(Map<Object, Object> param);

    /**
     * 分页查询
     * 
     * @author: autogeneration
     * @date: 2019-04-03 16:33:25
     **/ 
    List<Users> selectPaging(Map<Object, Object> param);

    /**
     * 统计查询
     * 
     * @author: autogeneration
     * @date: 2019-04-03 16:33:25
     **/ 
    int selectCount(Map<Object, Object> param);
}