package com.zy.base.utils.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.zy.base.utils.RSAEncrypt;
import com.zy.base.utils.RSASignature;
/*
 * sign校验的拦截器
 */
public class checkSign implements HandlerInterceptor{

	@Override
	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean preHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2) throws Exception {
		// TODO Auto-generated method stub
		//定义本地key存放目录
		String keypath="D:";
		//获取签名字符串
		String signstr= arg0.getParameter("signstr");
		//获取未加密内容
		String content=arg0.getParameter("content");
		//System.out.println(arg0);
		boolean res=RSASignature.doCheck(content, signstr, RSAEncrypt.loadPublicKeyByFile(keypath));
		System.out.println(res);
		System.out.println(signstr);
		return res;
		
	}

}
