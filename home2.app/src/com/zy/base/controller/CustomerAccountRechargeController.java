package com.zy.base.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.google.common.base.Preconditions;
import com.zy.base.pojo.CustomerAccountRecharge;
import com.zy.base.pojo.CustomerAccountRechargeExample;
import com.zy.base.service.CustomerAccountRechargeService;

@Controller
@RequestMapping("/customerAccountRecharge")
public class CustomerAccountRechargeController {
	
	//根据id查询记录
	@Resource
	private CustomerAccountRechargeService customerAccountRechargeService;
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	@ResponseBody
	public String findOne(@PathVariable("id") int id) {
		Preconditions.checkArgument(id>0,"id 必须大于0");
		CustomerAccountRecharge customerAccountRecharge = this.customerAccountRechargeService.findOne(id);
		return JSON.toJSONString(customerAccountRecharge);
	}
	
	//根据customerId查询该用户的所有记录列表
	@RequestMapping(value = "/customerid/{customerid}", method = RequestMethod.GET)
	@ResponseBody
	public List< CustomerAccountRecharge > findOneById(@PathVariable("customerid") int customerid) {
		Preconditions.checkArgument(customerid>0,"customerid 必须大于0");
		CustomerAccountRechargeExample example=new CustomerAccountRechargeExample();
		example.createCriteria().andCustomerIdEqualTo(customerid);
		return customerAccountRechargeService.findAll(example);
	}
	
	/*
	//查询全部记录列表
	 @RequestMapping( method = RequestMethod.GET )
	 @ResponseBody
	 public List< CustomerAccountRecharge > findAll(){
	     return customerAccountRechargeService.findAll(null);
	 }
	
	
	//下面是数据库逻辑操作，不是实际接口，不开放，管理端备用
	//创建记录
	@RequestMapping(method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	@ResponseBody
	public int create(@RequestBody CustomerAccountRecharge resource) {
		Preconditions.checkNotNull(resource);
		//
		return customerAccountRechargeService.create(resource);
	}
	
	//修改记录
	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	@ResponseStatus(HttpStatus.OK)
	public void update(@PathVariable("id") int id,@RequestBody CustomerAccountRecharge resource) {
		Preconditions.checkNotNull(resource);
		customerAccountRechargeService.update(resource);
	}
	*/
}
