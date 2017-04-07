package com.zy.base.dao;

import com.zy.base.pojo.CustomerAccountTransfer;
import com.zy.base.pojo.CustomerAccountTransferExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CustomerAccountTransferMapper {
    long countByExample(CustomerAccountTransferExample example);

    int deleteByExample(CustomerAccountTransferExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CustomerAccountTransfer record);

    int insertSelective(CustomerAccountTransfer record);

    List<CustomerAccountTransfer> selectByExampleWithBLOBs(CustomerAccountTransferExample example);

    List<CustomerAccountTransfer> selectByExample(CustomerAccountTransferExample example);

    CustomerAccountTransfer selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CustomerAccountTransfer record, @Param("example") CustomerAccountTransferExample example);

    int updateByExampleWithBLOBs(@Param("record") CustomerAccountTransfer record, @Param("example") CustomerAccountTransferExample example);

    int updateByExample(@Param("record") CustomerAccountTransfer record, @Param("example") CustomerAccountTransferExample example);

    int updateByPrimaryKeySelective(CustomerAccountTransfer record);

    int updateByPrimaryKeyWithBLOBs(CustomerAccountTransfer record);

    int updateByPrimaryKey(CustomerAccountTransfer record);
}