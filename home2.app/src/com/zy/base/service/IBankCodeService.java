package com.zy.base.service;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;

import com.zy.base.pojo.BankCode;
import com.zy.base.pojo.BankCodeExample;

public interface IBankCodeService {

	BankCode findOne(int bankCodeId);
	
	int create(@RequestBody BankCode resource);

	int update(@RequestBody BankCode resource);

	List<BankCode> findAll(BankCodeExample example);

}
