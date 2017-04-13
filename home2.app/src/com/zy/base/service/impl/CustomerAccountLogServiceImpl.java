package com.zy.base.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.zy.base.dao.CustomerAccountLogMapper;
import com.zy.base.pojo.CustomerAccountLog;
import com.zy.base.pojo.CustomerAccountLogExample;
import com.zy.base.service.CustomerAccountLogService;

@Service("customerAccountLogService")
public class CustomerAccountLogServiceImpl implements CustomerAccountLogService{

	@Resource
	CustomerAccountLogMapper customerAccountLogDao;
	@Override
	public CustomerAccountLog findOne(int customerAccountLogId) {
		// TODO Auto-generated method stub
		return customerAccountLogDao.selectByPrimaryKey(customerAccountLogId);
	}

	@Override
	public int create(CustomerAccountLog resource) {
		// TODO Auto-generated method stub
		return customerAccountLogDao.insert(resource);
	}

	@Override
	public int update(CustomerAccountLog resource) {
		// TODO Auto-generated method stub
		return customerAccountLogDao.updateByPrimaryKey(resource);
	}

	@Override
	public List<CustomerAccountLog> findAll(CustomerAccountLogExample example) {
		// TODO Auto-generated method stub
		return customerAccountLogDao.selectByExample(example);
	}
	
	
}