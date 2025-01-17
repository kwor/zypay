package com.zy.base.controller;

import java.util.List;
import java.util.UUID;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import com.google.common.base.Preconditions;
import com.zy.base.pojo.Customer;
import com.zy.base.service.CustomerService;
import com.zy.base.utils.annotation.AnnotationLog;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	@Resource
	private CustomerService customerService;

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	@ResponseBody
	public String findOne(@PathVariable("id") int id) {
		Preconditions.checkArgument(id > 0, "id必须大于0");
		Customer customer = this.customerService.findOne(id);
		return JSON.toJSONString(customer);
	}

	@RequestMapping(method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	@ResponseBody
	@AnnotationLog(operationSignstr = "{signstr}", operationContent = "{content}")
	public String create(@RequestParam String signstr, @RequestParam String content) {
		Preconditions.checkNotNull(content);

		JSONObject contentStr = JSONObject.parseObject(content); // 将字符串{“id”：1}
		Customer customerObj = (Customer) JSONObject.toJavaObject(contentStr, Customer.class);
		//生成UUID
		String payKey = UUID.randomUUID().toString();
		customerObj.setPayKey(payKey);
		//设置注册状态
		Byte status=1;
		customerObj.setCustomerStatus(status);
		//
		int res=customerService.create(customerObj);
		if(res==1){
			return "{payKey:"+payKey+"}";
		}
		
		return String.valueOf(res);

	}

	@RequestMapping(value = "/{id}", method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.OK)
	@AnnotationLog(operationSignstr = "{signstr}", operationContent = "{content}")
	public void update(@RequestParam String signstr, @RequestParam String content) {
		//Preconditions.checkNotNull(content);
		//Preconditions.checkArgument(id > 0, "id必须大于0");
		JSONObject contentStr = JSONObject.parseObject(content); // 将字符串{“id”：1}
		Customer customerObj = (Customer) JSONObject.toJavaObject(contentStr, Customer.class);
		
		//生成UUID
		String payKey = UUID.randomUUID().toString();
		customerObj.setPayKey(payKey);
		//设置注册状态
		Byte status=1;
		customerObj.setCustomerStatus(status);
		customerService.update(customerObj);
	}
	// */
	/*
	 * @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	 * 
	 * @ResponseStatus(HttpStatus.OK) public void update(@PathVariable("id") int
	 * id,@RequestBody Customer resource) {
	 * Preconditions.checkNotNull(resource);
	 * Preconditions.checkArgument(id>0,"id必须大于0");
	 * 
	 * //Preconditions.checkNotNull(customerService.getById(resource.getId()));
	 * customerService.update(resource); } //
	 */

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	@ResponseStatus(HttpStatus.OK)
	public void delete(@PathVariable("id") int id) {
		Preconditions.checkArgument(id > 0, "id必须大于0");
		customerService.delete(id);
	}

	@RequestMapping(method = RequestMethod.GET)
	@ResponseBody
	public List<Customer> findAll() {
		return customerService.findAll(null);
	}

}
