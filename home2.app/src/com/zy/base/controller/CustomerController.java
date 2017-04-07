package com.zy.base.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
 
import javax.annotation.Resource;
 
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
	
	@RequestMapping(value="/test", method = {RequestMethod.GET})
	public ModelAndView CustomerTest(){
		ModelAndView m=new ModelAndView();
        m.setViewName("test");  

		return m;
	}
	@RequestMapping("CustomerPostJson")
	@ResponseBody
	public String CustomerPostJson(){
		String url="http://localhost:7688/home2.app/customer";
		//String Params="{'name':'hello','password':'111111'}";
		
		JSONObject obj = new JSONObject();  
	      
		obj.put("name", "test");       
		obj.put("password", "111111");  
		   
		   
		   
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
	           // conn.setRequestProperty("dataType", "json");
	            conn.setRequestProperty("Content-Type", "application/json");
	           // conn.setRequestProperty("connection", "keep-alive");
	            conn.setUseCaches(false);//���ò�Ҫ����
	            conn.setInstanceFollowRedirects(true);
	            conn.setDoOutput(true);
	            conn.setDoInput(true);
	            conn.connect();
	            //POST����
	            out = new OutputStreamWriter(
	                    conn.getOutputStream());
	            out.write(obj.toString());
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
	        System.out.println(obj.toString());
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
 
	@RequestMapping( method = RequestMethod.POST,consumes = "application/json" )
	@ResponseStatus( HttpStatus.CREATED )
	@ResponseBody
	public int create(@RequestBody Customer resource ){
		//Preconditions.checkNotNull( resource );
		System.out.println("��������"+resource.getName());
		//System.out.println(resource.getPassword());
	    return customerService.create(resource);
		//return "��������"+resource;
	}
	
	
	
	
}
