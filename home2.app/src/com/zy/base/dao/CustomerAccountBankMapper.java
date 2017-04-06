package com.zy.base.dao;

import com.zy.base.pojo.CustomerAccountBank;

public interface CustomerAccountBankMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CustomerAccountBank record);

    int insertSelective(CustomerAccountBank record);

    CustomerAccountBank selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CustomerAccountBank record);

    int updateByPrimaryKeyWithBLOBs(CustomerAccountBank record);

    int updateByPrimaryKey(CustomerAccountBank record);
}