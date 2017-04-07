package com.zy.base.service.impl;

import com.zy.base.pojo.Customer;
import com.zy.base.service.ICustomerService;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.zy.base.dao.CustomerMapper;
@Service("customerService")
public class CustomerServiceImpl implements ICustomerService {
	@Resource
	private CustomerMapper customerDao;
 
	@Override
	public Customer findOne(int customerId) {
		// TODO Auto-generated method stub
		return this.customerDao.selectByPrimaryKey(customerId);
	}

	public  int create( @RequestBody Customer resource ){
		//
	    return  customerDao.insert(resource);
	}
 
}
