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
<div id="content"></div>
<script type="application/javascript">
   
    $('#postJsonBtn').click(function () {
        $.post('http://localhost:7688/home2.app/customer', {"name": "henry", "password": "12121221"}, function (data) {
            $('#content').html(data);
        })
    });
</script>
</body>
</html>