package com.zy.base.dao;

import com.zy.base.pojo.MerchantLog;
import com.zy.base.pojo.MerchantLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MerchantLogMapper {
    long countByExample(MerchantLogExample example);

    int deleteByExample(MerchantLogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MerchantLog record);

    int insertSelective(MerchantLog record);

    List<MerchantLog> selectByExample(MerchantLogExample example);

    MerchantLog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MerchantLog record, @Param("example") MerchantLogExample example);

    int updateByExample(@Param("record") MerchantLog record, @Param("example") MerchantLogExample example);

    int updateByPrimaryKeySelective(MerchantLog record);

    int updateByPrimaryKey(MerchantLog record);
}