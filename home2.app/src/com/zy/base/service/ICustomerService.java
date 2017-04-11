package com.zy.base.service;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;

import com.zy.base.pojo.Customer;
import com.zy.base.pojo.CustomerExample;

public interface ICustomerService {

	Customer findOne(int customerId);
	
	List<Customer> findAll(CustomerExample example);
	
	int create( @RequestBody Customer resource );
	
	int update( @RequestBody Customer resource );
	
	int delete( int customerId);

	int getById(int customerId);
}