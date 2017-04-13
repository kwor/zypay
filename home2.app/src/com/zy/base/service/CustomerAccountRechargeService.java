package com.zy.base.service;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;

import com.zy.base.pojo.CustomerAccountRecharge;
import com.zy.base.pojo.CustomerAccountRechargeExample;

public interface CustomerAccountRechargeService {

	CustomerAccountRecharge findOne(int customerAccoutRechargeId);
	
	int create(@RequestBody CustomerAccountRecharge resource);

	int update(@RequestBody CustomerAccountRecharge resource);

	List<CustomerAccountRecharge> findAll(CustomerAccountRechargeExample example);

	

}