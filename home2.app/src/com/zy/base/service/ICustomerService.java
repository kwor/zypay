package com.zy.base.service;

import org.springframework.web.bind.annotation.RequestBody;

import com.zy.base.pojo.Customer;

public interface ICustomerService {

	Customer findOne(int customerId);
	
	int create( @RequestBody Customer resource );
	
	int update( @RequestBody Customer resource );
	
	int delete( int customerId);

	int getById(int customerId);
}