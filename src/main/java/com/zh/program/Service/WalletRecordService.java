package com.zh.program.Service;

import com.zh.program.Entrty.WalletRecord;
import java.util.List;
import java.util.Map;

/**
 * 
 * @author: autogeneration
 * @date: 2019-04-09 10:19:20
 **/ 
public interface WalletRecordService {
    /**
     * 添加
     * 
     * @author: autogeneration
     * @date: 2019-04-09 10:19:20
     **/ 
    int insert(WalletRecord record);

    /**
     * 添加
     * 
     * @author: autogeneration
     * @date: 2019-04-09 10:19:20
     **/ 
    int insertSelective(WalletRecord record);

    /**
     * 更新
     * 
     * @author: autogeneration
     * @date: 2019-04-09 10:19:20
     **/ 
    int updateByPrimaryKey(WalletRecord record);

    /**
     * 更新
     * 
     * @author: autogeneration
     * @date: 2019-04-09 10:19:20
     **/ 
    int updateByPrimaryKeySelective(WalletRecord record);

    /**
     * 删除
     * 
     * @author: autogeneration
     * @date: 2019-04-09 10:19:20
     **/ 
    int deleteByPrimaryKey(Integer id);

    /**
     * 按主键查询
     * 
     * @author: autogeneration
     * @date: 2019-04-09 10:19:20
     **/ 
    WalletRecord selectByPrimaryKey(Integer id);

    /**
     * 条件查询
     * 
     * @author: autogeneration
     * @date: 2019-04-09 10:19:20
     **/ 
    List<WalletRecord> selectAll(Map<Object, Object> param);

    /**
     * 分页查询
     * 
     * @author: autogeneration
     * @date: 2019-04-09 10:19:20
     **/ 
    List<WalletRecord> selectPaging(Map<Object, Object> param);

    /**
     * 统计查询
     * 
     * @author: autogeneration
     * @date: 2019-04-09 10:19:20
     **/ 
    int selectCount(Map<Object, Object> param);
}