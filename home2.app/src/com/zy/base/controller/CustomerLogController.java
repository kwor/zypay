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
import com.zy.base.pojo.CustomerLog;
import com.zy.base.pojo.CustomerLogExample;
import com.zy.base.service.ICustomerLogService;

@Controller
@RequestMapping("/customerLog")
public class CustomerLogController {
	@Resource
	private ICustomerLogService customerLogService;

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	@ResponseBody
	public String findOne(@PathVariable("id") int id) {
		Preconditions.checkArgument(id>0,"id必须大于0");
		CustomerLog customerLog = this.customerLogService.findOne(id);
		return JSON.toJSONString(customerLog);
	}

	@RequestMapping(method = RequestMethod.GET)
	@ResponseBody
	public List<CustomerLog> findAll() {
		return customerLogService.findAll(null);
	}

	@RequestMapping(value = "/customerId/{customerid}", method = RequestMethod.GET)
	@ResponseBody
	public List<CustomerLog> findAllById(@PathVariable("customerid") int customerid) {
		Preconditions.checkArgument(customerid>0,"customerid必须大于0");
		CustomerLogExample example = new CustomerLogExample();
		example.createCriteria().andCustomerIdEqualTo(customerid);
		return customerLogService.findAll(example);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	@ResponseBody
	public int create(@RequestBody CustomerLog resource) {
		Preconditions.checkNotNull(resource);
		//
		return customerLogService.create(resource);
	}
}
