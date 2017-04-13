package com.zy.base.service.impl;

import com.zy.base.pojo.Customer;
import com.zy.base.pojo.CustomerExample;
import com.zy.base.service.CustomerService;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.zy.base.dao.CustomerMapper;
@Service("customerService")
public class CustomerServiceImpl implements CustomerService {
	@Resource
	private CustomerMapper customerDao;
 
	@Override
	public Customer findOne(int customerId) {
		// TODO Auto-generated method stub
		return this.customerDao.selectByPrimaryKey(customerId);
	}
	@Override
	public  int create( @RequestBody Customer resource ){
		//
		
	    return  customerDao.insert(resource);
	}
	@Override
	public  int update( @RequestBody Customer resource ){
		//
	    return  customerDao.updateByPrimaryKey(resource);
	}
 
	@Override
	public  int delete( int customerId){
		//
	    return  customerDao.deleteByPrimaryKey(customerId);
	}
	@Override
	public int getById(int customerId){
		//´ýÓÅ»¯
		 Customer cu=customerDao.selectByPrimaryKey(customerId);
		 return cu.getId();
	}
	
	@Override
	public List<Customer> findAll(CustomerExample example){
		
		
		return customerDao.selectByExample(example);
	}
	 
}
