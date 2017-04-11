<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
     <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>post</title>
</head>
<body>
<script type="text/javascript" src="http://apps.bdimg.com/libs/jquery/2.1.4/jquery.min.js"></script>
 
<input id="postJsonBtn" type="button" value="post json">
<input id="putJsonBtn" type="button" value="put json">
<input id="deleteJsonBtn" type="button" value="delete json">

<div id="content"></div>
<script type="application/javascript">
   
    $('#postJsonBtn').click(function () {
    	//console.log(JSON.stringify({"name": "henry", "password": "12121221"}));
    	$.ajax({
    		  url: 'http://localhost:8080/home2.app/customer',
    		  type: 'POST',
    		  contentType : "application/json; charset=utf-8",  
    		  dataType : "json" ,
    		  data:JSON.stringify({"merchantId":1,"name": "henry", "password": "12121221","payKey":"111122121","phone":"13221952583","remark":"beij","addTime":Date.parse(new Date()),"customerStatus":1}),
      	 success:function(data) {
      		 $('#content').html(data);
           },
           error:function(data) {
          	 $('#content').html(data);
           } 
    		});
    	/*
    	$.post('http://localhost:7688/home2.app/customer', {"name": "henry", "password": "12121221"}, function (data) {
            $('#content').html(data);
        })
        */
    });
    $('#putJsonBtn').click(function () {
    	$.ajax({
  		  url: 'http://localhost:8080/home2.app/customer/1',
  		  type: 'PUT',
  		  contentType : "application/json ; charset=utf-8",  
  		  dataType : "json" ,
  		  data:JSON.stringify({"id":1,"merchantId":1,"name": "henry1", "password": "12121221","payKey":"111122121","mail":"kwor@163.com","phone":"13221952583","remark":"beij","addTime":Date.parse(new Date()),"customerStatus":1}),

    	 success:function(data) {
    		 $('#content').html(data);
         },
         error:function(data) {
        	 $('#content').html(data);
         } 
  		});
    });
    $('#deleteJsonBtn').click(function () {
    	$.ajax({
    		  url: 'http://localhost:8080/home2.app/customer/7',
    		  type: 'DELETE',
    	      success:function(data) {
    	    		 $('#content').html(data);
    	      },
    		 // data: {}
    		 
    		});
    });
</script>
</body>
</html>