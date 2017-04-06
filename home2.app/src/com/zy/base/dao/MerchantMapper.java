package com.zy.base.dao;

import com.zy.base.pojo.Merchant;
import com.zy.base.pojo.MerchantWithBLOBs;

public interface MerchantMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MerchantWithBLOBs record);

    int insertSelective(MerchantWithBLOBs record);

    MerchantWithBLOBs selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MerchantWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(MerchantWithBLOBs record);

    int updateByPrimaryKey(Merchant record);
}