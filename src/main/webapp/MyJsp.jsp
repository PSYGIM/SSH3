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
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<link rel="stylesheet" href="dist/modules/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="dist/modules/ionicons/css/ionicons.min.css">
    <link rel="stylesheet" href="dist/css/demo.css">
    <link rel="stylesheet" href="dist/css/style.css">
</head>
<body>
	<div class="col-lg-7 col-md-12 col-12 col-sm-12">
    <div class="card">
        <div class="card-header">
            <div class="float-right">
                <a href="#" class="btn btn-primary">用户管理</a>
            </div>
            <h4>Latest Posts</h4>
        </div>
        <div class="card-body">
            <div class="table-responsive">
                <table class="table table-striped">
                    <thead>
                    <tr>
                        <th>用户信息</th>
                        <th>用户名</th>
                        <th>修改删除</th>
                    </tr>
                    </thead>

                    <s:iterator value="#session.jokeSession">
                        <tbody>

                    <tr>
                        <td>
                                <s:property value="jokename"/>
                        </td>
                        <td>
                            <a href="#"><img src="<s:property value="image"/>" alt="avatar" width="30" class="rounded-circle mr-1"><s:property value="username"/></a>
                        </td>
                        <td>
                            <a class="btn btn-primary btn-action mr-1" data-toggle="tooltip" title="Edit"><i class="ion ion-edit"></i></a>
                            <a class="btn btn-danger btn-action" data-toggle="tooltip" title="Delete"><i class="ion ion-trash-b"></i></a>
                        </td>
                    </tr>

                    </tbody>
                    </s:iterator>
                </table>
            </div>
        </div>
    </div>
</div>

  </body>
</html>
