package com.zy.base.service;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;

import com.zy.base.pojo.CustomerAccountTransfer;
import com.zy.base.pojo.CustomerAccountTransferExample;


public interface CustomerAccountTransferService {

	CustomerAccountTransfer findOne(int customerAccountTransferId);
	
	int create(@RequestBody CustomerAccountTransfer resource);

	int update(@RequestBody CustomerAccountTransfer resource);

	List<CustomerAccountTransfer> findAll(CustomerAccountTransferExample example);

}
