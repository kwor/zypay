package com.zy.base.service;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;

import com.zy.base.pojo.CustomerAccountBlockLog;
import com.zy.base.pojo.CustomerAccountBlockLogExample;


public interface CustomerAccountBlockLogService {

	CustomerAccountBlockLog findOne(int customerAccountBlockLogId);
	
	int create(@RequestBody CustomerAccountBlockLog resource);

	int update(@RequestBody CustomerAccountBlockLog resource);

	List<CustomerAccountBlockLog> findAll(CustomerAccountBlockLogExample example);

}
