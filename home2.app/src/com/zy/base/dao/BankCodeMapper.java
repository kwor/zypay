package com.zy.base.dao;

import com.zy.base.pojo.BankCode;
import com.zy.base.pojo.BankCodeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BankCodeMapper {
    long countByExample(BankCodeExample example);

    int deleteByExample(BankCodeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BankCode record);

    int insertSelective(BankCode record);

    List<BankCode> selectByExample(BankCodeExample example);

    BankCode selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BankCode record, @Param("example") BankCodeExample example);

    int updateByExample(@Param("record") BankCode record, @Param("example") BankCodeExample example);

    int updateByPrimaryKeySelective(BankCode record);

    int updateByPrimaryKey(BankCode record);
}