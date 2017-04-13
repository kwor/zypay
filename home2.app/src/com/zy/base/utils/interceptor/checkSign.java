package com.zy.base.utils.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.zy.base.utils.RSAEncrypt;
import com.zy.base.utils.RSASignature;
/*
 * signУ���������
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
		//���屾��key���Ŀ¼
		String keypath="D:";
		//��ȡǩ���ַ���
		String signstr= arg0.getParameter("signstr");
		//��ȡδ��������
		String content=arg0.getParameter("content");
		//System.out.println(arg0);
		boolean res=RSASignature.doCheck(content, signstr, RSAEncrypt.loadPublicKeyByFile(keypath));
		System.out.println(res);
		System.out.println(signstr);
		return res;
		
	}

}
