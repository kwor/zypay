package com.zy.base.dao;

import com.zy.base.pojo.CustomerLog;
import com.zy.base.pojo.CustomerLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CustomerLogMapper {
    long countByExample(CustomerLogExample example);

    int deleteByExample(CustomerLogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CustomerLog record);

    int insertSelective(CustomerLog record);

    List<CustomerLog> selectByExample(CustomerLogExample example);

    CustomerLog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CustomerLog record, @Param("example") CustomerLogExample example);

    int updateByExample(@Param("record") CustomerLog record, @Param("example") CustomerLogExample example);

    int updateByPrimaryKeySelective(CustomerLog record);

    int updateByPrimaryKey(CustomerLog record);
}