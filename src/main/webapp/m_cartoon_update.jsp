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
    
    <title>My JSP 'm_cartoon_update.jsp' starting page</title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
  <% request.setCharacterEncoding("utf-8");
  	 String cartoonname=new String(request.getParameter("cartoon.cartoonname"));
  	 String context=new String(request.getParameter("cartoon.context"));
  %>
    <form action="m_cartoon_update" method="post" name = "myform">
    <input type="hidden" name="cartoon.id" value="<%=request.getParameter("cartoon.id")%>">
    <input type="hidden" name="cartoon.username" value="<s:property value="#session.username"/>">
        <input type="hidden" name="cartoon.context" value="<%=context%>">
    <input type="text" name="cartoon.cartoonname" value="<%=cartoonname%>">
    <input type="submit"  value = "修改漫画名">
</form>
  </body>
</html>
