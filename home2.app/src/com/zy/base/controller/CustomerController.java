package com.zy.base.controller;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;

import javax.annotation.Resource;
import javax.security.auth.message.callback.PrivateKeyCallback.Request;

import org.apache.http.HttpHost;
import org.apache.http.entity.StringEntity;
 

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.http.HttpStatus;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.google.common.base.Preconditions;
import com.zy.base.pojo.Customer; 
import com.zy.base.service.ICustomerService;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	@Resource
	private ICustomerService customerService;
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	@ResponseBody
	public String findOne(@PathVariable( "id" ) int id){
		Customer customer = this.customerService.findOne(id);

		return JSON.toJSONString(customer);
	}
	
 
	@RequestMapping("CustomerPostJson")
	@ResponseBody
	public String CustomerPostJson(){
		
		String url="http://localhost:7688/home2.app/customer";
		String Params="{\"addTime\":\"\",\"mail\":\"kwor@163.com\",\"merchantId\":1,\"name\":\"test\",\"password\":\"111\",\"payKey\":\"1\",\"phone\":\"1700093933\",\"remark\":\"12\"}";
		    OutputStreamWriter out = null;
	        BufferedReader reader = null;
	        String response="";
	        try {
	            URL httpUrl = null; //HTTP URL�� �����������������
	            //����URL
	            httpUrl = new URL(url);
	            //��������
	            HttpURLConnection conn = (HttpURLConnection) httpUrl.openConnection();
	            conn.setRequestMethod("POST");
	            conn.setRequestProperty("Content-Type", "application/json");
	            conn.setRequestProperty("connection", "keep-alive");
	            conn.setUseCaches(false);//���ò�Ҫ����
	            conn.setInstanceFollowRedirects(true);
	            conn.setDoOutput(true);
	            conn.setDoInput(true);
	            conn.connect();
	            //POST����
	            out = new OutputStreamWriter(
	                    conn.getOutputStream());
	            out.write(Params);
	            out.flush();
	            //��ȡ��Ӧ
	            reader = new BufferedReader(new InputStreamReader(
	                    conn.getInputStream()));
	            String lines;
	            while ((lines = reader.readLine()) != null) {
	                lines = new String(lines.getBytes(), "utf-8");
	                response+=lines;
	            }
	            reader.close();
	            // �Ͽ�����
	            conn.disconnect();
	            //������
	            System.out.println(response);
	            
	        } catch (Exception e) {
	        System.out.println("���� POST ��������쳣��"+e);
	        e.printStackTrace();
	        }
	        //ʹ��finally�����ر��������������
	        finally{
	        try{
	            if(out!=null){
	                out.close();
	            }
	            if(reader!=null){
	                reader.close();
	            }
	        }
	        catch(IOException ex){
	            ex.printStackTrace();
	        }
	    }

	       return response;
	 }
    
	 
	
	
	
	@RequestMapping( method = RequestMethod.POST )
	@ResponseStatus( HttpStatus.CREATED )
	@ResponseBody
	public int create( @RequestBody Customer resource ){
		Preconditions.checkNotNull( resource );
	    return customerService.create(resource);
	}
	
	
	
	
}
