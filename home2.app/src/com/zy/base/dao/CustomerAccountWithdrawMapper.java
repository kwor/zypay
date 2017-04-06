package com.zy.base.dao;

import com.zy.base.pojo.CustomerAccountWithdraw;
import com.zy.base.pojo.CustomerAccountWithdrawWithBLOBs;

public interface CustomerAccountWithdrawMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CustomerAccountWithdrawWithBLOBs record);

    int insertSelective(CustomerAccountWithdrawWithBLOBs record);

    CustomerAccountWithdrawWithBLOBs selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CustomerAccountWithdrawWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(CustomerAccountWithdrawWithBLOBs record);

    int updateByPrimaryKey(CustomerAccountWithdraw record);
}