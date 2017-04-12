package com.zy.base.service;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;

import com.zy.base.pojo.MerchantLog;
import com.zy.base.pojo.MerchantLogExample;

public interface IMerchantLogService {

	MerchantLog findOne(int merchantLogId);
	
	int create(@RequestBody MerchantLog resource);

	int update(@RequestBody MerchantLog resource);

	List<MerchantLog> findAll(MerchantLogExample example);

}
