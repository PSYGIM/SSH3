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
    
    <title>My JSP 'm_user_update.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<style type="text/css"> 
	   input{
                border: 1px solid #ccc;
                padding: 7px 0px;
                border-radius: 3px;
                padding-left:5px;
                -webkit-box-shadow: inset 0 1px 1px rgba(0,0,0,.075);
                box-shadow: inset 0 1px 1px rgba(0,0,0,.075);
                -webkit-transition: border-color ease-in-out .15s,-webkit-box-shadow ease-in-out .15s;
                -o-transition: border-color ease-in-out .15s,box-shadow ease-in-out .15s;
                transition: border-color ease-in-out .15s,box-shadow ease-in-out .15s
            }
            input:focus{
                    border-color: #66afe9;
                    outline: 0;
                    -webkit-box-shadow: inset 0 1px 1px rgba(0,0,0,.075),0 0 8px rgba(102,175,233,.6);
                    box-shadow: inset 0 1px 1px rgba(0,0,0,.075),0 0 8px rgba(102,175,233,.6)
            }
   </style>
  </head>
  
  <body>
  <% request.setCharacterEncoding("utf-8");
  	 String username=new String(request.getParameter("name"));

  %>
   <s:form action="user_update" method="get">
   	    <table align="center">
   	    	<input type="hidden" name="ordinaryUser.id" value="<%=request.getParameter("id") %>"/>
   	    	<tr>
   	    	<td>用户名</td>
   	    	<td><input type="text" name="ordinaryUser.username" readonly="readonly"  value="<%=username%>"/></td>
   	    	</tr>
   			<tr>
   			<td>手机号</td>
   			 <td><input type="text" name="ordinaryUser.phone"value="<%=request.getParameter("phone") %>"/></td>
   			</tr>
   			<tr>
   			<td>密码</td>
   			 <td><input type="text"name="ordinaryUser.password"value="<%=request.getParameter("password") %>"/></td>
   			</tr>
   			<tr>
   				<td>权限</td>
   				<td>
   					<input  name="ordinaryUser.role" type="radio" value="mgr" >管理员
   					<input  name="ordinaryUser.role" type="radio" value="users" checked="checked">普通用户
   				</td>
   			</tr>
   			<tr>
   			 <td><s:submit value="保存"/></td>
   			</tr>
   			
   		</table>
   </s:form>
  </body>
</html>
