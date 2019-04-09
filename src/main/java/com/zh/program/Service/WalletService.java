package com.zh.program.Service;

import com.zh.program.Entrty.Wallet;
import java.util.List;
import java.util.Map;

/**
 * 
 * @author: autogeneration
 * @date: 2019-04-09 10:18:39
 **/ 
public interface WalletService {
    /**
     * 添加
     * 
     * @author: autogeneration
     * @date: 2019-04-09 10:18:39
     **/ 
    int insert(Wallet record);

    /**
     * 添加
     * 
     * @author: autogeneration
     * @date: 2019-04-09 10:18:39
     **/ 
    int insertSelective(Wallet record);

    /**
     * 更新
     * 
     * @author: autogeneration
     * @date: 2019-04-09 10:18:39
     **/ 
    int updateByPrimaryKey(Wallet record);

    /**
     * 更新
     * 
     * @author: autogeneration
     * @date: 2019-04-09 10:18:39
     **/ 
    int updateByPrimaryKeySelective(Wallet record);

    /**
     * 删除
     * 
     * @author: autogeneration
     * @date: 2019-04-09 10:18:39
     **/ 
    int deleteByPrimaryKey(Integer id);

    /**
     * 按主键查询
     * 
     * @author: autogeneration
     * @date: 2019-04-09 10:18:39
     **/ 
    Wallet selectByPrimaryKey(Integer id);

    /**
     * 条件查询
     * 
     * @author: autogeneration
     * @date: 2019-04-09 10:18:39
     **/ 
    List<Wallet> selectAll(Map<Object, Object> param);

    /**
     * 分页查询
     * 
     * @author: autogeneration
     * @date: 2019-04-09 10:18:39
     **/ 
    List<Wallet> selectPaging(Map<Object, Object> param);

    /**
     * 统计查询
     * 
     * @author: autogeneration
     * @date: 2019-04-09 10:18:39
     **/ 
    int selectCount(Map<Object, Object> param);
}