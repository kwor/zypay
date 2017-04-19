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
import com.zy.base.pojo.MerchantLog;
import com.zy.base.pojo.MerchantLogExample;
import com.zy.base.service.MerchantLogService;

@Controller
@RequestMapping("/merchantLog")
public class MerchantLogController {

	@Resource
	private MerchantLogService merchantLogService;

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	@ResponseBody
	public String findOne(@PathVariable("id") int id) {
		Preconditions.checkArgument(id > 0, "id必须大于0");
		MerchantLog merchantLog = this.merchantLogService.findOne(id);
		return JSON.toJSONString(merchantLog);
	}

	@RequestMapping(method = RequestMethod.GET)
	@ResponseBody
	public List<MerchantLog> findAll() {
		return merchantLogService.findAll(null);
	}

	@RequestMapping(value = "/merchantId/{merchantid}", method = RequestMethod.GET)
	@ResponseBody
	public List<MerchantLog> findAllById(@PathVariable("merchantid") int merchantid) {
		Preconditions.checkArgument(merchantid > 0, "merchantid必须大于0");
		MerchantLogExample example = new MerchantLogExample();
		example.createCriteria().andMerchantIdEqualTo(merchantid);
		return merchantLogService.findAll(example);
	}

}
