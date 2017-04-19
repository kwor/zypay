package com.zy.base.controller;

import java.util.UUID;

import javax.annotation.Resource;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.google.common.base.Preconditions;
import com.zy.base.pojo.Merchant;
import com.zy.base.service.MerchantService;
import com.zy.base.utils.annotation.AnnotationLog;

@Controller
@RequestMapping("/merchant")
public class MerchantController {
	@Resource
	private MerchantService merchantService;
	
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	@ResponseBody
	public String findOne(@PathVariable("id") int id) {
		Preconditions.checkArgument(id > 0, "id必须大于0");
		Merchant merchant = this.merchantService.findOne(id);
		return JSON.toJSONString(merchant);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	@ResponseBody
	@AnnotationLog(operationSignstr = "{signstr}", operationContent = "{content}")
	public String create(@RequestParam String signstr, @RequestParam String content) {
		Preconditions.checkNotNull(content);

		JSONObject contentStr = JSONObject.parseObject(content); // 将字符串{“id”：1}
		Merchant merchantObj = (Merchant) JSONObject.toJavaObject(contentStr, Merchant.class);
		//生成UUID
		String payKey = UUID.randomUUID().toString();
		//merchantObj.se;
		//设置注册状态
		//Byte status=1;
		//merchantObj.setCustomerStatus(status);
		//
		int res=merchantService.create(merchantObj);
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
		Merchant merchantObj = (Merchant) JSONObject.toJavaObject(contentStr, Merchant.class);
		
		//生成UUID
		//String payKey = UUID.randomUUID().toString();
		//merchantObj.setPayKey(payKey);
		//设置注册状态
		//Byte status=1;
		//merchantObj.setCustomerStatus(status);
		merchantService.update(merchantObj);
	}

}
