package com.zy.base.dao;

import com.zy.base.pojo.CustomerAccountWithdraw;
import com.zy.base.pojo.CustomerAccountWithdrawExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CustomerAccountWithdrawMapper {
    long countByExample(CustomerAccountWithdrawExample example);

    int deleteByExample(CustomerAccountWithdrawExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CustomerAccountWithdraw record);

    int insertSelective(CustomerAccountWithdraw record);

    List<CustomerAccountWithdraw> selectByExample(CustomerAccountWithdrawExample example);

    CustomerAccountWithdraw selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CustomerAccountWithdraw record, @Param("example") CustomerAccountWithdrawExample example);

    int updateByExample(@Param("record") CustomerAccountWithdraw record, @Param("example") CustomerAccountWithdrawExample example);

    int updateByPrimaryKeySelective(CustomerAccountWithdraw record);

    int updateByPrimaryKey(CustomerAccountWithdraw record);
}