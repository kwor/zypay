package com.zy.base.dao;

import com.zy.base.pojo.BankCode;

public interface BankCodeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(BankCode record);

    int insertSelective(BankCode record);

    BankCode selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BankCode record);

    int updateByPrimaryKey(BankCode record);
}