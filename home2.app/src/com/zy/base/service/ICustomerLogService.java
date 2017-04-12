package com.zy.base.service;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;

import com.zy.base.pojo.CustomerLog;
import com.zy.base.pojo.CustomerLogExample;

public interface ICustomerLogService {

	CustomerLog findOne(int customerAccoutRechargeId);
	
	int create(@RequestBody CustomerLog resource);

	int update(@RequestBody CustomerLog resource);

	List<CustomerLog> findAll(CustomerLogExample example);

}