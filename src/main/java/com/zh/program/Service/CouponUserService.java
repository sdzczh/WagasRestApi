package com.zh.program.Service;

import com.zh.program.Entrty.CouponUser;
import java.util.List;
import java.util.Map;

/**
 * 
 * @author: autogeneration
 * @date: 2019-04-09 10:12:47
 **/ 
public interface CouponUserService {
    /**
     * 添加
     * 
     * @author: autogeneration
     * @date: 2019-04-09 10:12:47
     **/ 
    int insert(CouponUser record);

    /**
     * 添加
     * 
     * @author: autogeneration
     * @date: 2019-04-09 10:12:47
     **/ 
    int insertSelective(CouponUser record);

    /**
     * 更新
     * 
     * @author: autogeneration
     * @date: 2019-04-09 10:12:47
     **/ 
    int updateByPrimaryKey(CouponUser record);

    /**
     * 更新
     * 
     * @author: autogeneration
     * @date: 2019-04-09 10:12:47
     **/ 
    int updateByPrimaryKeySelective(CouponUser record);

    /**
     * 删除
     * 
     * @author: autogeneration
     * @date: 2019-04-09 10:12:47
     **/ 
    int deleteByPrimaryKey(Integer id);

    /**
     * 按主键查询
     * 
     * @author: autogeneration
     * @date: 2019-04-09 10:12:47
     **/ 
    CouponUser selectByPrimaryKey(Integer id);

    /**
     * 条件查询
     * 
     * @author: autogeneration
     * @date: 2019-04-09 10:12:47
     **/ 
    List<CouponUser> selectAll(Map<Object, Object> param);

    /**
     * 分页查询
     * 
     * @author: autogeneration
     * @date: 2019-04-09 10:12:47
     **/ 
    List<CouponUser> selectPaging(Map<Object, Object> param);

    /**
     * 统计查询
     * 
     * @author: autogeneration
     * @date: 2019-04-09 10:12:47
     **/ 
    int selectCount(Map<Object, Object> param);
}