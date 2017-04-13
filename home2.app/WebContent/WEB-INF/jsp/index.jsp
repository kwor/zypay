<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>测试接口列表</title>
</head>
<body>
<a href="/home2.app/customer/1" >用户信息GET</a><br/>
<a href="/home2.app/customer">用户信息列表获取GET</a><br/>
<a href="/home2.app/test/" >测试post到接口</a><br/>
<a href="/home2.app/customerAccountRecharge/customerid/1" >获取用户充值记录列表GET</a><br/>
<a href="/home2.app/customerAccountRecharge/1" >获取单条充值记录列表GET</a><br/>

<a href="/home2.app/createkey/" >本地密钥文件生成</a><br/>
<a href="/home2.app/getsign/" >私钥签名</a><br/>
<a href="/home2.app/checksign/" >公钥校验</a>
</body>
</html>