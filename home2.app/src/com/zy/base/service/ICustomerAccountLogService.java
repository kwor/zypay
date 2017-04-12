package com.zy.base.service;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;

import com.zy.base.pojo.CustomerAccountLog;
import com.zy.base.pojo.CustomerAccountLogExample;


public interface ICustomerAccountLogService {

	CustomerAccountLog findOne(int customerAccountLogId);
	
	int create(@RequestBody CustomerAccountLog resource);

	int update(@RequestBody CustomerAccountLog resource);

	List<CustomerAccountLog> findAll(CustomerAccountLogExample example);

}
