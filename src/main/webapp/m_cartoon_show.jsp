<%--
  Created by IntelliJ IDEA.
  User: PSYGEIM
  Date: 2019/12/20
  Time: 15:31
  To change this template use File | Settings | File Templates.
--%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>漫画展示</title>
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
<center>漫画信息</center>
<table border = "1" cellspacing="0" align="center">
    <tr>
        <td>漫画名</td>
        <td>上传用户</td>
        <td>图片</td>
        <td>修改</td>
        <td>删除</td>
    </tr>
    <s:iterator value="#session.cartoonSession">
        <tr>

            <td><s:property value="cartoonname"/></td>
            <td><s:property value="username"/></td>
            <td><img src="<s:property value="context"/>" width="300" height="300" alt=""></td>
            <td><a href="m_cartoon_update.jsp?cartoon.id=<s:property value="id"/>&cartoon.cartoonname=<s:property value="cartoonname"/>&cartoon.context=<s:property value="context"/>">修改</a></td>
            <td><a href="m_cartoon_delete?id=<s:property value="id"/>">删除</a></td>
        </tr>
    </s:iterator>
</table>

</body>
</html>
