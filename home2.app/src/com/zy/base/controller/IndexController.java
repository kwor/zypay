package com.zy.base.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.zy.base.utils.RSAEncrypt;
import com.zy.base.utils.RSASignature;

@Controller
public class IndexController {

	@RequestMapping("/")
	public String Index() {
		return "index";
	}

	@RequestMapping("/checksign")
	public String checksign() {
		return "checksign";
	}

	@RequestMapping("/getsign")
	public String getsign() {
		return "getsign";
	}

	@RequestMapping("/createkey")
	public String createkey() {
		return "createkey";
	}

	/*
	 * 验签失败的提示
	 */
	@RequestMapping("/error")
	@ResponseBody
	public String checkerror() {
		return "{\"Message\":\"check faild\"}";
	}

	/*
	 * 测试post create提交页面
	 */
	@RequestMapping(value = "/testcreate", method = { RequestMethod.GET })
	public ModelAndView CustomerTestPost() throws Exception {
		ModelAndView m = new ModelAndView();
		String keypath = "D:";
		long timenow = System.currentTimeMillis();
		String content = "{\"merchantId\":1,\"name\": \"henry\", \"password\": \"12121221\",\"payKey\":\"111122121\",\"phone\":\"13221952583\",\"remark\":\"beij\",\"addTime\":"
				+ timenow + ",\"customerStatus\":1}";
		String signstr = RSASignature.sign(content, RSAEncrypt.loadPrivateKeyByFile(keypath));

		m.addObject("content", content);
		m.addObject("signstr", signstr);
		m.setViewName("testcreate");
		return m;
	}

	/*
	 * 测试post update提交页面
	 */
	@RequestMapping(value = "/testupdate", method = { RequestMethod.GET })
	public ModelAndView CustomerTestUpdate() throws Exception {
		ModelAndView m = new ModelAndView();
		String keypath = "D:";
		long timenow = System.currentTimeMillis();
		String content = "{\"id\":1,\"merchantId\":1,\"name\": \"hup\", \"password\": \"12121221\",\"payKey\":\"111122121\",\"phone\":\"13221952583\",\"remark\":\"beij\",\"addTime\":"
				+ timenow + ",\"customerStatus\":1}";
		String signstr = RSASignature.sign(content, RSAEncrypt.loadPrivateKeyByFile(keypath));

		m.addObject("content", content);
		m.addObject("signstr", signstr);
		m.setViewName("testupdate");
		return m;
	}

	/*
	 * 生成key文件
	 */
	@RequestMapping(value = "/genKey", method = RequestMethod.POST)
	@ResponseBody
	public String genKeyPair(String keypath) {
		RSAEncrypt.genKeyPair(keypath);
		return keypath;
	}

	/*
	 * 根据本地磁盘的私钥签名过程(test)
	 */
	@RequestMapping(value = "/sign", method = RequestMethod.POST)
	@ResponseBody
	public String sign(String keypath, String content) throws Exception {
		// String content="test_这是用于签名的原始数据";
		String signstr = RSASignature.sign(content, RSAEncrypt.loadPrivateKeyByFile(keypath));
		return signstr;
	}

	/*
	 * 根据本地磁盘的公钥校验签名过程(test)
	 */
	@RequestMapping(value = "/doCheck", method = RequestMethod.POST)
	@ResponseBody
	public boolean doCheck(String keypath, String content, String signstr) throws Exception {

		boolean res = RSASignature.doCheck(content, signstr, RSAEncrypt.loadPublicKeyByFile(keypath));
		return res;
	}
}
