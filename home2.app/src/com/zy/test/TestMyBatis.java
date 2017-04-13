package com.zy.test;
import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.zy.base.pojo.Customer;
import com.zy.base.service.CustomerService;

@RunWith(SpringJUnit4ClassRunner.class)		//表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})

public class TestMyBatis {
	private static Logger logger = Logger.getLogger(TestMyBatis.class);
 	@Resource
	private CustomerService customerService = null;
 

	@Test
	public void test1() {
		Customer customer = customerService.findOne(1);
 		logger.info(JSON.toJSONString(customer));
	}
	
	
	/*
	@Test
	public void test2() {
		Customer customer = customerService.create(resource);
 		logger.info(JSON.toJSONString(customer));
	}
	*/
}