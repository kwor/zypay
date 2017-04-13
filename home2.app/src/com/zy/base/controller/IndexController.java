package com.zy.base.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zy.base.utils.RSAEncrypt;
import com.zy.base.utils.RSASignature;

@Controller
public class IndexController {

    @RequestMapping("/")  
    public String Index(){ 
        return "index";
    }  
    
    @RequestMapping("/checksign")  
    public String checksign(){  
        return "checksign";
    }  

    @RequestMapping("/getsign")  
    public String getsign(){  
        return "getsign";
    }  

    @RequestMapping("/createkey")  
    public String createkey(){  
        return "createkey";
    }  

    
    /*
     * ����key�ļ�
     */
	@RequestMapping(value = "/genKey", method = RequestMethod.POST)
	@ResponseBody
    public String genKeyPair( String keypath){
		RSAEncrypt.genKeyPair(keypath);
        return keypath;
    }
	
    /*
     * ���ݱ��ش��̵�˽Կǩ������(test)
     */
	@RequestMapping(value = "/sign", method = RequestMethod.POST)
	@ResponseBody
    public String sign(String keypath, String content) throws Exception{
		//String content="test_��������ǩ����ԭʼ����";  
		String signstr=RSASignature.sign(content,RSAEncrypt.loadPrivateKeyByFile(keypath));
		return signstr;
    }
	
	
    /*
     * ���ݱ��ش��̵Ĺ�ԿУ��ǩ������(test)
     */
	@RequestMapping(value = "/doCheck", method = RequestMethod.POST)
	@ResponseBody
    public boolean doCheck(String keypath,String content,String signstr) throws Exception{
		
		boolean res=RSASignature.doCheck(content, signstr, RSAEncrypt.loadPublicKeyByFile(keypath));
		return res;
    }
}
