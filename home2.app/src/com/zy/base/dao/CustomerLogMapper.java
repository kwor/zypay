package com.zy.base.dao;

import com.zy.base.pojo.CustomerLog;
import com.zy.base.pojo.CustomerLogWithBLOBs;

public interface CustomerLogMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CustomerLogWithBLOBs record);

    int insertSelective(CustomerLogWithBLOBs record);

    CustomerLogWithBLOBs selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CustomerLogWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(CustomerLogWithBLOBs record);

    int updateByPrimaryKey(CustomerLog record);
}