package com.zy.test;
import com.zy.base.utils.*;
import org.apache.commons.codec.binary.Base64;

public class TestRSA {

	    public static void main(String[] args) throws Exception {  
	        String filepath="D:/key/";  
	  
	        //RSAEncrypt.genKeyPair(filepath);  
	          
	      
	        System.out.println("--------------公钥加密私钥解密过程-------------------");  
	        String plainText="test_公钥加密私钥解密";  
	       // long timenow = System.currentTimeMillis();
			//String content1 = "{merchantId:1,name: \"henry\",password: \"12121221\",phone:\"13221952583\",remark:\"beij\",addTime:"
			//		+ timenow + ",mail:\"kwor@163.com\"}";
	        //公钥加密过程  
	        byte[] cipherData=RSAEncrypt.encrypt(RSAEncrypt.loadPublicKeyByStr(RSAEncrypt.loadPublicKeyByFile(filepath)),plainText.getBytes());  
	        String cipher=Base64.encodeBase64String(cipherData);  
	        //私钥解密过程  
	        byte[] res=RSAEncrypt.decrypt(RSAEncrypt.loadPrivateKeyByStr(RSAEncrypt.loadPrivateKeyByFile(filepath)), Base64.decodeBase64(cipher));  
	        String restr=new String(res);
	        System.out.println("原文："+plainText);  
	        System.out.println("加密："+cipher);  
	        System.out.println("解密："+restr);  
	        System.out.println();  
	          
	        System.out.println("--------------私钥加密公钥解密过程-------------------");  
	        plainText="test_私钥加密公钥解密";  
	        //私钥加密过程  
	        cipherData=RSAEncrypt.encrypt(RSAEncrypt.loadPrivateKeyByStr(RSAEncrypt.loadPrivateKeyByFile(filepath)),plainText.getBytes());  
	        cipher=Base64.encodeBase64String(cipherData);  
	        //公钥解密过程  
	        res=RSAEncrypt.decrypt(RSAEncrypt.loadPublicKeyByStr(RSAEncrypt.loadPublicKeyByFile(filepath)), Base64.decodeBase64(cipher));  
	        restr=new String(res);  
	        System.out.println("原文："+plainText);  
	        System.out.println("加密："+cipher);  
	        System.out.println("解密："+restr);  
	        System.out.println();  
	        //*/
	        System.out.println("---------------私钥签名过程------------------");  
	        String content="test_这是用于签名的原始数据";  
	        String signstr=RSASignature.sign(content,RSAEncrypt.loadPrivateKeyByFile(filepath));  
	        System.out.println("签名原串："+content);  
	        System.out.println("签名串："+signstr);  
	        System.out.println();  
	          
	        System.out.println("---------------公钥校验签名------------------");  
	        System.out.println("签名原串："+content);  
	        System.out.println("签名串："+signstr);  
	          
	        System.out.println("验签结果："+RSASignature.doCheck(content, signstr, RSAEncrypt.loadPublicKeyByFile(filepath)));  
	        System.out.println();  
	          
	    }  
	}  