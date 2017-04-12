package com.zy.base.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.alibaba.fastjson.JSON;
import com.google.common.base.Preconditions;

import com.zy.base.pojo.CustomerAccountRecharge;
import com.zy.base.service.ICustomerAccountRechargeService;

@Controller
@RequestMapping("/customerAccountRecharge")
public class CustomerAccountRechargeController {
	
	//����id��ѯ��¼
	@Resource
	private ICustomerAccountRechargeService customerAccountRechargeService;
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	@ResponseBody
	public String findOne(@PathVariable("id") int id) {
		CustomerAccountRecharge customerAccountRecharge = this.customerAccountRechargeService.findOne(id);
		return JSON.toJSONString(customerAccountRecharge);
	}
	
	//����customerId��ѯ��¼�б�
	
	
	
	/*
	//��ѯȫ����¼�б�
	 @RequestMapping( method = RequestMethod.GET )
	 @ResponseBody
	 public List< CustomerAccountRecharge > findAll(){
	     return customerAccountRechargeService.findAll(null);
	 }
	
	
	//���������ݿ��߼�����������ʵ�ʽӿڣ������ţ�����˱���
	//������¼
	@RequestMapping(method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	@ResponseBody
	public int create(@RequestBody CustomerAccountRecharge resource) {
		Preconditions.checkNotNull(resource);
		//
		return customerAccountRechargeService.create(resource);
	}
	
	//�޸ļ�¼
	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	@ResponseStatus(HttpStatus.OK)
	public void update(@PathVariable("id") int id,@RequestBody CustomerAccountRecharge resource) {
		Preconditions.checkNotNull(resource);
		customerAccountRechargeService.update(resource);
	}
	*/
}
