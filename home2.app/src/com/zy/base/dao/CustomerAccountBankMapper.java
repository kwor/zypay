package com.zy.base.dao;

import com.zy.base.pojo.CustomerAccountBank;
import com.zy.base.pojo.CustomerAccountBankExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CustomerAccountBankMapper {
    long countByExample(CustomerAccountBankExample example);

    int deleteByExample(CustomerAccountBankExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CustomerAccountBank record);

    int insertSelective(CustomerAccountBank record);

    List<CustomerAccountBank> selectByExample(CustomerAccountBankExample example);

    CustomerAccountBank selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CustomerAccountBank record, @Param("example") CustomerAccountBankExample example);

    int updateByExample(@Param("record") CustomerAccountBank record, @Param("example") CustomerAccountBankExample example);

    int updateByPrimaryKeySelective(CustomerAccountBank record);

    int updateByPrimaryKey(CustomerAccountBank record);
}