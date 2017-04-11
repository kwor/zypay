package com.zy.base.service;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;

import com.zy.base.pojo.CustomerAccountRecharge;
import com.zy.base.pojo.CustomerAccountRechargeExample;

public interface ICustomerAccountRechargeService {

	int create(CustomerAccountRecharge resource);

	int update(CustomerAccountRecharge resource);

	List<CustomerAccountRecharge> findAll(CustomerAccountRechargeExample example);

	CustomerAccountRecharge findOne(int customerAccoutRechargeId);

}