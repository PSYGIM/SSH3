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
    
    <title>My JSP 'm_user_add.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<style type="text/css"> 
html, body, h1, form, fieldset, legend, ol, li {
    margin: 0;
    padding: 0;
}
/*定义<body>标记样式*/
body {
    background: #ffffff;
    color: #111111;
    font-family: Georgia, "Times New Roman", Times, serif;
    padding-left: 20px;
    
}
/*定义付费内容的样式*/
form#payment {
    background: #9cbc2c;
    -webkit-border-radius: 5px;
    border-radius: 5px;
    padding: 20px;
    width: 400px;
    margin:auto;
}
form#payment fieldset {
    border: none;
    margin-bottom: 10px;
}
form#payment fieldset:last-of-type { margin-bottom: 0; }
form#payment legend {
    color: #384313;
    font-size: 16px;
    font-weight: bold;
    padding-bottom: 10px;
    text-shadow: 0 1px 1px #c0d576;
}
form#payment fieldset fieldset legend {
    color: #111111;
    font-size: 13px;
    font-weight: normal;
    padding-bottom: 0;
}
form#payment ol li {
    background: #b3ffb3;
    background: rgba(255, 255, 255, .3);
    border-color: #c2f0f0;
    border-color: rgba(255, 255, 255, .6);
    border-style: solid;
    border-width: 2px;
    -webkit-border-radius: 5px;
    line-height: 30px;
    list-style: none;
    padding: 5px 10px;
    margin-bottom: 2px;
}
form#payment ol ol li {
    background: none;
    border: none;
    float: left;
}
form#payment label {
    float: left;
    font-size: 13px;
    width: 110px;
}
form#payment fieldset fieldset label {
    background: none no-repeat left 50%;
    line-height: 20px;
    padding: 0 0 0 30px;
    width: auto;
}
form#payment fieldset fieldset label:hover { cursor: pointer; }
form#payment input:not([type=radio]), form#payment textarea {
    background: #ffffff;
    border: #FC3 solid 1px;
    -webkit-border-radius: 3px;
    font: italic 13px Georgia, "Times New Roman", Times, serif;
    outline: none;
    padding: 5px;
    width: 200px;
}
form#payment input:not([type=submit]):focus, form#payment textarea:focus {
    background: #eaeaea;
    border: #F00 solid 1px;
}
form#payment input[type=radio] {
    float: left;
    margin-right: 5px;
    } 
   </style>
  </head>
  
  <body>
  <br><br><br><br>
   <form id="payment" action="user_add" method="post">
    <fieldset>
        <legend>添加用户</legend>
        <ol>
            <li>
                <label for="name">用户名：</label>
                <input id="name" name="ordinaryUser.username" type="text" required autofocus>
            </li>
            <li>
                <label for="phone">联系电话：</label>
                <input id="phone" name="ordinaryUser.phone" type="tel" required>
            </li>
            <li>
                <label for="password">密码：</label>
                <input type="text" id="password" name="ordinaryUser.password" required />
            </li>
        </ol>
    </fieldset>
    <fieldset>
        <legend>权限</legend>
        <ol>
            <li>
                <fieldset>
                    <legend>普通用户权限</legend>
                    <ol>

                        <li>
                            <input id="amex" name="ordinaryUser.role" type="radio" value="users" checked="checked">
                            <label for="amex">普通用户</label>
                        </li>
                        <li>
                            <label for="amex">(只允许添加普通用户)</label>
                        </li>
                        
                    </ol>
                </fieldset>
            </li>
           
        </ol>
    </fieldset>
    <fieldset>
    <input type="submit" value="确认添加"/>
    </fieldset>
</form>
  </body>
</html>
