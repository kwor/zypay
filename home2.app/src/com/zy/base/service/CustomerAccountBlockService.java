package com.zy.base.service;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;

import com.zy.base.pojo.CustomerAccountBlock;
import com.zy.base.pojo.CustomerAccountBlockExample;


public interface CustomerAccountBlockService {

	CustomerAccountBlock findOne(int customerAccountBlockId);
	
	int create(@RequestBody CustomerAccountBlock resource);

	int update(@RequestBody CustomerAccountBlock resource);

	List<CustomerAccountBlock> findAll(CustomerAccountBlockExample example);

}
