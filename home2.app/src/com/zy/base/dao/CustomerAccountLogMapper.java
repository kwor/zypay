package com.zy.base.dao;

import com.zy.base.pojo.CustomerAccountLog;

public interface CustomerAccountLogMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CustomerAccountLog record);

    int insertSelective(CustomerAccountLog record);

    CustomerAccountLog selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CustomerAccountLog record);

    int updateByPrimaryKey(CustomerAccountLog record);
}