package com.zy.test;
import com.zy.base.utils.*;
import org.apache.commons.codec.binary.Base64;

public class TestRSA {

	    public static void main(String[] args) throws Exception {  
	        String filepath="D:/key/";  
	  
	        //RSAEncrypt.genKeyPair(filepath);  
	          
	          /*
	        System.out.println("--------------��Կ����˽Կ���ܹ���-------------------");  
	        String plainText="test_��Կ����˽Կ����";  
	        //��Կ���ܹ���  
	        byte[] cipherData=RSAEncrypt.encrypt(RSAEncrypt.loadPublicKeyByStr(RSAEncrypt.loadPublicKeyByFile(filepath)),plainText.getBytes());  
	        String cipher=Base64.encodeBase64String(cipherData);  
	        //˽Կ���ܹ���  
	        byte[] res=RSAEncrypt.decrypt(RSAEncrypt.loadPrivateKeyByStr(RSAEncrypt.loadPrivateKeyByFile(filepath)), Base64.decodeBase64(cipher));  
	        String restr=new String(res);  
	        System.out.println("ԭ�ģ�"+plainText);  
	        System.out.println("���ܣ�"+cipher);  
	        System.out.println("���ܣ�"+restr);  
	        System.out.println();  
	          
	        System.out.println("--------------˽Կ���ܹ�Կ���ܹ���-------------------");  
	        plainText="test_˽Կ���ܹ�Կ����";  
	        //˽Կ���ܹ���  
	        cipherData=RSAEncrypt.encrypt(RSAEncrypt.loadPrivateKeyByStr(RSAEncrypt.loadPrivateKeyByFile(filepath)),plainText.getBytes());  
	        cipher=Base64.encodeBase64String(cipherData);  
	        //��Կ���ܹ���  
	        res=RSAEncrypt.decrypt(RSAEncrypt.loadPublicKeyByStr(RSAEncrypt.loadPublicKeyByFile(filepath)), Base64.decodeBase64(cipher));  
	        restr=new String(res);  
	        System.out.println("ԭ�ģ�"+plainText);  
	        System.out.println("���ܣ�"+cipher);  
	        System.out.println("���ܣ�"+restr);  
	        System.out.println();  
	          */
	        System.out.println("---------------˽Կǩ������------------------");  
	        String content="test_��������ǩ����ԭʼ����";  
	        String signstr=RSASignature.sign(content,RSAEncrypt.loadPrivateKeyByFile(filepath));  
	        System.out.println("ǩ��ԭ����"+content);  
	        System.out.println("ǩ������"+signstr);  
	        System.out.println();  
	          
	        System.out.println("---------------��ԿУ��ǩ��------------------");  
	        System.out.println("ǩ��ԭ����"+content);  
	        System.out.println("ǩ������"+signstr);  
	          
	        System.out.println("��ǩ�����"+RSASignature.doCheck(content, signstr, RSAEncrypt.loadPublicKeyByFile(filepath)));  
	        System.out.println();  
	          
	    }  
	}  