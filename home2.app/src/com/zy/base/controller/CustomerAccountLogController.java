package com.zy.base.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.google.common.base.Preconditions;
import com.zy.base.pojo.CustomerAccountLog;
import com.zy.base.service.CustomerAccountLogService;
 
@Controller
@RequestMapping("/customerAccountLog")
public class CustomerAccountLogController {
	@Resource
	private CustomerAccountLogService customerAccountLogService;
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	@ResponseBody
	public String findOne(@PathVariable("id") int id) {
		Preconditions.checkArgument(id > 0, "id±ØÐë´óÓÚ0");
		CustomerAccountLog customerAccountLog = this.customerAccountLogService.findOne(id);
		return JSON.toJSONString(customerAccountLog);
	}

	
}
