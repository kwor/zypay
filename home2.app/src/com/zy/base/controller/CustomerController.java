package com.zy.base.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.http.HttpStatus;

import com.alibaba.fastjson.JSON;
import com.google.common.base.Preconditions;
import com.zy.base.pojo.Customer;
import com.zy.base.service.ICustomerService;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	@Resource
	private ICustomerService customerService;

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	@ResponseBody
	public String findOne(@PathVariable("id") int id) {
		Customer customer = this.customerService.findOne(id);

		return JSON.toJSONString(customer);
	}

	/*
	 * 测试post提交页面
	 */
	@RequestMapping(value = "/test", method = { RequestMethod.GET })
	public ModelAndView CustomerTest() {
		ModelAndView m = new ModelAndView();
		m.setViewName("test");
		return m;
	}

	@RequestMapping(method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	@ResponseBody
	public int create(Customer resource) {
		Preconditions.checkNotNull(resource);
		//System.out.println("测试数据" + resource.getName());
		// System.out.println(resource.getPassword());
		return customerService.create(resource);
		// return "测试数据"+resource;
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	@ResponseStatus(HttpStatus.OK)
	public void update(@PathVariable("id") int id, @RequestBody Customer resource) {
		Preconditions.checkNotNull(resource);
		Preconditions.checkNotNull(customerService.getById(resource.getId()));
		customerService.update(resource);
	}
	// */

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	@ResponseStatus(HttpStatus.OK)
	public void delete(@PathVariable("id") int id) {
		customerService.delete(id);
	}

}
