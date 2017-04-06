package com.zy.base.dao;

import com.zy.base.pojo.Customer;
import com.zy.base.pojo.CustomerWithBLOBs;

public interface CustomerMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CustomerWithBLOBs record);

    int insertSelective(CustomerWithBLOBs record);

    CustomerWithBLOBs selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CustomerWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(CustomerWithBLOBs record);

    int updateByPrimaryKey(Customer record);
}