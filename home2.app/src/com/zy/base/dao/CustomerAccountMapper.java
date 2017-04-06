package com.zy.base.dao;

import com.zy.base.pojo.CustomerAccount;

public interface CustomerAccountMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CustomerAccount record);

    int insertSelective(CustomerAccount record);

    CustomerAccount selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CustomerAccount record);

    int updateByPrimaryKey(CustomerAccount record);
}