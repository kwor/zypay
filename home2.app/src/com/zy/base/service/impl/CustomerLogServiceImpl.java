package com.zy.base.service.impl;


import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.zy.base.dao.CustomerLogMapper;
import com.zy.base.pojo.CustomerLog;
import com.zy.base.pojo.CustomerLogExample;
import com.zy.base.service.ICustomerLogService;

@Service("customerLogService")
public class CustomerLogServiceImpl implements ICustomerLogService{

	@Resource
	CustomerLogMapper customerLogDao;
	@Override
	public CustomerLog findOne(int customerLogId) {
		// TODO Auto-generated method stub
		return customerLogDao.selectByPrimaryKey(customerLogId);
	}

	@Override
	public int create(CustomerLog resource) {
		// TODO Auto-generated method stub
		return customerLogDao.insert(resource);
	}

	@Override
	public int update(CustomerLog resource) {
		// TODO Auto-generated method stub
		return customerLogDao.updateByPrimaryKeySelective(resource);
	}

	@Override
	public List<CustomerLog> findAll(CustomerLogExample example) {
		// TODO Auto-generated method stub
		return customerLogDao.selectByExample(example);
	}
	
}