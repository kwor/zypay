package com.zy.base.service;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;

import com.zy.base.pojo.Merchant;
import com.zy.base.pojo.MerchantExample;

public interface IMerchantService {

	Merchant findOne(int merchantId);
	
	List<Merchant> findAll(MerchantExample example);
	
	int create( @RequestBody Merchant resource );
	
	int update( @RequestBody Merchant resource );
	
	int delete( int merchantId);

	int getById(int merchantId);
}