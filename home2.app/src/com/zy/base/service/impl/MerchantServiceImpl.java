package com.zy.base.service.impl;


import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.zy.base.dao.MerchantMapper;
import com.zy.base.pojo.Merchant;
import com.zy.base.pojo.MerchantExample;
import com.zy.base.service.MerchantService;

@Service("merchantService")
public class MerchantServiceImpl implements MerchantService{

	@Resource
	private MerchantMapper merchantDao;
	@Override
	public Merchant findOne(int merchantId) {
		// TODO Auto-generated method stub
		return merchantDao.selectByPrimaryKey(merchantId);
	}

	@Override
	public List<Merchant> findAll(MerchantExample example) {
		// TODO Auto-generated method stub
		return merchantDao.selectByExample(example);
	}

	@Override
	public int create(Merchant resource) {
		// TODO Auto-generated method stub
		return merchantDao.insert(resource);
	}

	@Override
	public int update(Merchant resource) {
		// TODO Auto-generated method stub
		return merchantDao.updateByPrimaryKey(resource);
	}

	@Override
	public int delete(int merchantId) {
		// TODO Auto-generated method stub
		return merchantDao.deleteByPrimaryKey(merchantId);
	}

	 
}