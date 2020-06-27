<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">

	<link rel="stylesheet" media="screen" href="css/style.css">
    <link rel="stylesheet" type="text/css" href="css/reset.css"/>
  </head>
  
  <body>
  <div id="particles-js">
		<div class="login">
			<div class="login-top">
				PYfun娱乐系统
			</div>
			<form action="muser_login" method="post">
			<div class="login-center clearfix">
				<div class="login-center-img"><img src="img/name.png"/></div>
				<div class="login-center-input">
					<input type="text" name="username"  placeholder="请输入您的用户名" onfocus="this.placeholder=''" onblur="this.placeholder='请输入您的用户名'"/>
					<h3 style="color: red"><s:fielderror fieldName="username"/></h3>
					<div class="login-center-input-text">用户名</div>
				</div>
			</div>
			<div class="login-center clearfix">
				<div class="login-center-img"><img src="img/password.png"/></div>
				<div class="login-center-input">
					<input type="password" name="password"placeholder="请输入您的密码" onfocus="this.placeholder=''" onblur="this.placeholder='请输入您的密码'"/>
					<h3 style="color: red"><s:fielderror fieldName="password"/></h3>
					<div class="login-center-input-text">密码</div>
				</div>
			</div>
			<div class="login-center clearfix">
					权限
					<input type="radio" name="role" value="mgr"/>管理员
					<input type="radio" name="role" value="users" />普通用户
			</div>
			<div class="login-submit">
				<input type="submit" value="登陆" class="login-button"/><br><br>
				<a href="regist.jsp">没有账号,立即注册</a>
				
			</div>
   			</form>
		</div>
</div>
<script src="js/particles.min.js"></script>
<script src="js/app.js"></script>
   
  </body>
</html>
