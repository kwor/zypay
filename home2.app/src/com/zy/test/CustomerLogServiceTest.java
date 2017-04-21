package com.zy.test;


import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.zy.base.pojo.MerchantLog;
import com.zy.base.service.MerchantLogService;

import junit.framework.TestCase;
@RunWith(SpringJUnit4ClassRunner.class)		//表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})
public class CustomerLogServiceTest extends TestCase {
	private MerchantLogService merchantLogService;
	private static Logger logger = Logger.getLogger(CustomerLogServiceTest.class);
	
	@Test
	public void testFindOne() {
		//fail("Not yet implemented");
		  System.out.println("查询单个日志的测试");  
		  MerchantLog merchantLog = this.merchantLogService.findOne(1);
		  logger.info(JSON.toJSONString(merchantLog)) ;

	}

	public void testCreate() {
		fail("Not yet implemented");
	}

	public void testUpdate() {
		fail("Not yet implemented");
	}

	public void testFindAll() {
		fail("Not yet implemented");
	}

}
