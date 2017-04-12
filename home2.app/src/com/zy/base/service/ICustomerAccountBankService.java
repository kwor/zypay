package com.zy.base.service;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;

import com.zy.base.pojo.CustomerAccountBank;
import com.zy.base.pojo.CustomerAccountBankExample;


public interface ICustomerAccountBankService {

	CustomerAccountBank findOne(int customerAccoutBankId);
	
	int create(@RequestBody CustomerAccountBank resource);

	int update(@RequestBody CustomerAccountBank resource);

	List<CustomerAccountBank> findAll(CustomerAccountBankExample example);

}
