package com.zy.base.dao;

import com.zy.base.pojo.CustomerAccountTransfer;

public interface CustomerAccountTransferMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CustomerAccountTransfer record);

    int insertSelective(CustomerAccountTransfer record);

    CustomerAccountTransfer selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CustomerAccountTransfer record);

    int updateByPrimaryKeyWithBLOBs(CustomerAccountTransfer record);

    int updateByPrimaryKey(CustomerAccountTransfer record);
}