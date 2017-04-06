package com.zy.base.dao;

import com.zy.base.pojo.CustomerAccountBlock;

public interface CustomerAccountBlockMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CustomerAccountBlock record);

    int insertSelective(CustomerAccountBlock record);

    CustomerAccountBlock selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CustomerAccountBlock record);

    int updateByPrimaryKeyWithBLOBs(CustomerAccountBlock record);

    int updateByPrimaryKey(CustomerAccountBlock record);
}