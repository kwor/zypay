package com.zy.base.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import com.zy.base.dao.CustomerAccountRechargeMapper;
import com.zy.base.pojo.CustomerAccountRecharge;
import com.zy.base.pojo.CustomerAccountRechargeExample;
 import com.zy.base.service.*;
 @Service("customerAccountRechargeService")
 public class CustomerAccountRechargeServiceImpl implements ICustomerAccountRechargeService{
	@Resource
	private CustomerAccountRechargeMapper customerAccoutRechargeDao;
	 
	@Override
	public int create( @RequestBody CustomerAccountRecharge resource ){
		//
	    return  customerAccoutRechargeDao.insert(resource);
	}
 
	@Override
	public int update( @RequestBody  CustomerAccountRecharge resource ){
		//更具id只更新状态，非全部（不提供全部更新）
	    return  customerAccoutRechargeDao.updateByPrimaryKeySelective(resource);
	}
	 
	@Override
	public List<CustomerAccountRecharge> findAll(CustomerAccountRechargeExample example){
		//
		return customerAccoutRechargeDao.selectByExample(example);
	}
 
	@Override
	public CustomerAccountRecharge findOne(int customerAccoutRechargeId) {
		// TODO Auto-generated method stub
		return this.customerAccoutRechargeDao.selectByPrimaryKey(customerAccoutRechargeId);
	}

}
