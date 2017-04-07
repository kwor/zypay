package com.zy.base.dao;

import com.zy.base.pojo.CustomerAccountBlockLog;
import com.zy.base.pojo.CustomerAccountBlockLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CustomerAccountBlockLogMapper {
    long countByExample(CustomerAccountBlockLogExample example);

    int deleteByExample(CustomerAccountBlockLogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CustomerAccountBlockLog record);

    int insertSelective(CustomerAccountBlockLog record);

    List<CustomerAccountBlockLog> selectByExample(CustomerAccountBlockLogExample example);

    CustomerAccountBlockLog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CustomerAccountBlockLog record, @Param("example") CustomerAccountBlockLogExample example);

    int updateByExample(@Param("record") CustomerAccountBlockLog record, @Param("example") CustomerAccountBlockLogExample example);

    int updateByPrimaryKeySelective(CustomerAccountBlockLog record);

    int updateByPrimaryKey(CustomerAccountBlockLog record);
}