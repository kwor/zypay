package com.zy.base.dao;

import com.zy.base.pojo.CustomerAccountLog;
import com.zy.base.pojo.CustomerAccountLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CustomerAccountLogMapper {
    long countByExample(CustomerAccountLogExample example);

    int deleteByExample(CustomerAccountLogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CustomerAccountLog record);

    int insertSelective(CustomerAccountLog record);

    List<CustomerAccountLog> selectByExample(CustomerAccountLogExample example);

    CustomerAccountLog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CustomerAccountLog record, @Param("example") CustomerAccountLogExample example);

    int updateByExample(@Param("record") CustomerAccountLog record, @Param("example") CustomerAccountLogExample example);

    int updateByPrimaryKeySelective(CustomerAccountLog record);

    int updateByPrimaryKey(CustomerAccountLog record);
}