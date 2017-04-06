package com.zy.base.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.zy.base.pojo.Customer;
import com.zy.base.service.ICustomerService;
 
@Controller
@RequestMapping("/customer")
public class CustomerController {
	@Resource
	private ICustomerService customerService;
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	@ResponseBody
	public String toIndex(@PathVariable( "id" ) int id){
		Customer customer = this.customerService.getCustomerById(id);

		return JSON.toJSONString(customer);
	}
}
