package com.zy.base.dao;

import com.zy.base.pojo.CustomerAccountRecharge;

public interface CustomerAccountRechargeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CustomerAccountRecharge record);

    int insertSelective(CustomerAccountRecharge record);

    CustomerAccountRecharge selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CustomerAccountRecharge record);

    int updateByPrimaryKeyWithBLOBs(CustomerAccountRecharge record);

    int updateByPrimaryKey(CustomerAccountRecharge record);
}