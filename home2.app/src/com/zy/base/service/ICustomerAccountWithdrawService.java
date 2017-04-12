package com.zy.base.service;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;

import com.zy.base.pojo.CustomerAccountWithdraw;
import com.zy.base.pojo.CustomerAccountWithdrawExample;


public interface ICustomerAccountWithdrawService {

	CustomerAccountWithdraw findOne(int customerAccountWithdrawId);
	
	int create(@RequestBody CustomerAccountWithdraw resource);

	int update(@RequestBody CustomerAccountWithdraw resource);

	List<CustomerAccountWithdraw> findAll(CustomerAccountWithdrawExample example);

}
