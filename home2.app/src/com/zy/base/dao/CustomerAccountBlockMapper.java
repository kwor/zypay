package com.zy.base.dao;

import com.zy.base.pojo.CustomerAccountBlock;
import com.zy.base.pojo.CustomerAccountBlockExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CustomerAccountBlockMapper {
    long countByExample(CustomerAccountBlockExample example);

    int deleteByExample(CustomerAccountBlockExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CustomerAccountBlock record);

    int insertSelective(CustomerAccountBlock record);

    List<CustomerAccountBlock> selectByExample(CustomerAccountBlockExample example);

    CustomerAccountBlock selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CustomerAccountBlock record, @Param("example") CustomerAccountBlockExample example);

    int updateByExample(@Param("record") CustomerAccountBlock record, @Param("example") CustomerAccountBlockExample example);

    int updateByPrimaryKeySelective(CustomerAccountBlock record);

    int updateByPrimaryKey(CustomerAccountBlock record);
}