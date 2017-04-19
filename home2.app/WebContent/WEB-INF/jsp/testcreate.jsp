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

<!-- <input id="postJsonBtn" type="button" value="post json"> -->
<form action="/home2.app/customer" method="post">
签名：<textarea rows="10" cols="50" name="signstr" >${signstr}</textarea><br/><br/>
明文：<textarea rows="10" cols="50" name="content" >${content}</textarea><br/><br/>
<!-- 加密后的密文 -->
<!-- 加密后的密文：<textarea rows="10" cols="50" name="content" >${signcontent}</textarea><br/><br/>-->
<input type="submit" name="测试" />
</form>

<div id="content"></div>
 
</body>
</html>