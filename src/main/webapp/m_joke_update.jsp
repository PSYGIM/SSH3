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
    
    <title>My JSP 'm_joke_update.jsp' starting page</title>
    
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
      <% request.setCharacterEncoding("utf-8");
  	 String jokename=new String(request.getParameter("joke.jokename"));
  	 String context=new String(request.getParameter("joke.context"));
  %>
    <form action="m_joke_update" method="post" >
    <input type="hidden" name="joke.id" value="<%=request.getParameter("joke.id")%>">
    <input type="hidden" name="joke.username" value="<s:property value="#session.username"/>">
    <input type="text" name="joke.jokename" value="<%=jokename%>">34
    <br><br>
    <textarea rows="10" name="joke.context" cols="23"><%=context%></textarea>
   	<br><br>
    <input type="submit"  value = "修改笑话">
</form>
  </body>
</html>
