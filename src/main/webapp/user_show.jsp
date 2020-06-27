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
    
    <title>My JSP 'user_show.jsp' starting page</title>
    
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
	   table
	   {
	      border-collapse: collapse;    
	      margin: 0 auto;            
	      text-align: center;
	     }
	    table td, table th        
	    {            
	    border: 1px solid #cad9ea;            
	    color: #666;            
	    height: 30px;
	    width: 250px;        
	    }        
	    table thead th        
	    {            
	    background-color: #CCE8EB;            
	    width: 100px;        }
	    table tr:nth-child(odd)        
	    {            
	    background: #fff;        
	    }        
	    table tr:nth-child(even)        
	    {            
	    background: #F5FAFA;        
	    }    
	    </style>

  </head>
  
  <body>
    <s:form action="query" method="post" theme="simple">
  		 <tr>
			<td>姓名：</td>
			<td><s:textfield name="ordinaryUser.username"/></td>
			<td><s:submit value="查询"/></td>
		</tr>
		
		
</s:form>
  <hr>
  <form action="user_show" >
    	<table border="1" style="border-collapse:collapse" align="center">
    		<caption>
            <h2>用户信息一览表</h2>
        </caption>
   			<tr>
   				<th>姓名</th>
   				<th>电话</th>
   				<th>密码</th>
   				<th>操作</th>
   			</tr>
   		<s:iterator value="#session.usersession">
   		 
   		<tr>
   			<td><s:property value="username"/></td>
   			<td><s:property value="phone"/></td>
   			<td><s:property value="password"/></td>
   			<td><a href="m_user_update.jsp?id=<s:property value="id"/>&name=<s:property value="username"/>&password=<s:property value="password"/>&phone=<s:property value="phone"/>">修改</a>
   			<a href="user_del?ordinaryUser.id=<s:property value="id"/>">删除</a></td>
   		</tr>
   		</s:iterator>
   	</table>
    </form>
 
    
  </body>
</html>
