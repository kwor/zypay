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
	            URL httpUrl = null; //HTTP URL类 用这个类来创建连接
	            //创建URL
	            httpUrl = new URL(url);
	            //建立连接
	            HttpURLConnection conn = (HttpURLConnection) httpUrl.openConnection();
	            conn.setRequestMethod("POST");
	            conn.setRequestProperty("Content-Type", "application/json");
	            conn.setRequestProperty("connection", "keep-alive");
	            conn.setUseCaches(false);//设置不要缓存
	            conn.setInstanceFollowRedirects(true);
	            conn.setDoOutput(true);
	            conn.setDoInput(true);
	            conn.connect();
	            //POST请求
	            out = new OutputStreamWriter(
	                    conn.getOutputStream());
	            out.write(Params);
	            out.flush();
	            //读取响应
	            reader = new BufferedReader(new InputStreamReader(
	                    conn.getInputStream()));
	            String lines;
	            while ((lines = reader.readLine()) != null) {
	                lines = new String(lines.getBytes(), "utf-8");
	                response+=lines;
	            }
	            reader.close();
	            // 断开连接
	            conn.disconnect();
	            //输出结果
	            System.out.println(response);
	            
	        } catch (Exception e) {
	        System.out.println("发送 POST 请求出现异常！"+e);
	        e.printStackTrace();
	        }
	        //使用finally块来关闭输出流、输入流
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
