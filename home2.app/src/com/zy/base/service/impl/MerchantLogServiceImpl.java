package com.zy.base.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.zy.base.dao.MerchantLogMapper;
import com.zy.base.pojo.MerchantLog;
import com.zy.base.pojo.MerchantLogExample;
import com.zy.base.service.MerchantLogService;

@Service("merchantLogService")
public class MerchantLogServiceImpl implements MerchantLogService{

	@Resource
	MerchantLogMapper merchantLogDao;
	
	@Override
	public MerchantLog findOne(int merchantLogId) {
		// TODO Auto-generated method stub
		return merchantLogDao.selectByPrimaryKey(merchantLogId);
	}

	@Override
	public int create(MerchantLog resource) {
		// TODO Auto-generated method stub
		return merchantLogDao.insert(resource);
	}

	@Override
	public int update(MerchantLog resource) {
		// TODO Auto-generated method stub
		return merchantLogDao.updateByPrimaryKeySelective(resource);
	}

	@Override
	public List<MerchantLog> findAll(MerchantLogExample example) {
		// TODO Auto-generated method stub
		return merchantLogDao.selectByExample(example);
	}
	
	
}