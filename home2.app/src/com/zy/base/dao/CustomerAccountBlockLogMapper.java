package com.zy.base.dao;

import com.zy.base.pojo.CustomerAccountBlockLog;

public interface CustomerAccountBlockLogMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CustomerAccountBlockLog record);

    int insertSelective(CustomerAccountBlockLog record);

    CustomerAccountBlockLog selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CustomerAccountBlockLog record);

    int updateByPrimaryKey(CustomerAccountBlockLog record);
}