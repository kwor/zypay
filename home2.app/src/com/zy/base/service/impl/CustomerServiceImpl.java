package com.zy.base.service.impl;

import com.zy.base.pojo.Customer;
import com.zy.base.service.ICustomerService;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.zy.base.dao.CustomerMapper;
@Service("customerService")
public class CustomerServiceImpl implements ICustomerService {
	@Resource
	private CustomerMapper customerDao;

	/* (non-Javadoc)
	 * @see com.zy.base.service.impl.ICustomerService#getCustomerById(int)
	 */
	@Override
	public Customer getCustomerById(int customerId) {
		// TODO Auto-generated method stub
		return this.customerDao.selectByPrimaryKey(customerId);
	}
}
