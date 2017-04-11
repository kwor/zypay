package com.zy.base.dao;

import com.zy.base.pojo.CustomerAccountRecharge;
import com.zy.base.pojo.CustomerAccountRechargeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CustomerAccountRechargeMapper {
    long countByExample(CustomerAccountRechargeExample example);

    int deleteByExample(CustomerAccountRechargeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CustomerAccountRecharge record);

    int insertSelective(CustomerAccountRecharge record);

    List<CustomerAccountRecharge> selectByExample(CustomerAccountRechargeExample example);

    CustomerAccountRecharge selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CustomerAccountRecharge record, @Param("example") CustomerAccountRechargeExample example);

    int updateByExample(@Param("record") CustomerAccountRecharge record, @Param("example") CustomerAccountRechargeExample example);

    int updateByPrimaryKeySelective(CustomerAccountRecharge record);

    int updateByPrimaryKey(CustomerAccountRecharge record);
}