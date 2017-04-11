package com.zy.base.service.impl;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;

import com.zy.base.dao.CustomerAccountRechargeMapper;
import com.zy.base.pojo.CustomerAccountRecharge;
import com.zy.base.pojo.CustomerAccountRechargeExample;
 
public class CustomerAccountRechargeServiceImpl implements ICustomerAccountRechargeService {
	private CustomerAccountRechargeMapper customerAccoutRechargeDao;
	/* (non-Javadoc)
	 * @see com.zy.base.service.impl.ICustomerAccountRechargeService#create(com.zy.base.pojo.CustomerAccountRecharge)
	 */
	@Override
	public int create( @RequestBody CustomerAccountRecharge resource ){
		//
	    return  customerAccoutRechargeDao.insert(resource);
	}
	/* (non-Javadoc)
	 * @see com.zy.base.service.impl.ICustomerAccountRechargeService#update(com.zy.base.pojo.CustomerAccountRecharge)
	 */
	@Override
	public int update( @RequestBody  CustomerAccountRecharge resource ){
		//
	    return  customerAccoutRechargeDao.updateByPrimaryKey(resource);
	}
	/* (non-Javadoc)
	 * @see com.zy.base.service.impl.ICustomerAccountRechargeService#findAll(com.zy.base.pojo.CustomerAccountRechargeExample)
	 */
	@Override
	public List<CustomerAccountRecharge> findAll(CustomerAccountRechargeExample example){
		//
		return customerAccoutRechargeDao.selectByExample(example);
	}
	/* (non-Javadoc)
	 * @see com.zy.base.service.impl.ICustomerAccountRechargeService#findOne(int)
	 */
	@Override
	public CustomerAccountRecharge findOne(int customerAccoutRechargeId) {
		// TODO Auto-generated method stub
		return this.customerAccoutRechargeDao.selectByPrimaryKey(customerAccoutRechargeId);
	}

}
