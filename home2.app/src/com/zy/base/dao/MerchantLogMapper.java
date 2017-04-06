package com.zy.base.dao;

import com.zy.base.pojo.MerchantLog;

public interface MerchantLogMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MerchantLog record);

    int insertSelective(MerchantLog record);

    MerchantLog selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MerchantLog record);

    int updateByPrimaryKeyWithBLOBs(MerchantLog record);

    int updateByPrimaryKey(MerchantLog record);
}