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
    
    <title>My JSP 'main.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<link rel="stylesheet" href="layui/css/layui.css">
</head>
<body class="layui-layout-body">
<div class="layui-layout layui-layout-admin">
  <div class="layui-header">
    <div class="layui-logo">PYfun娱乐</div>
    <!-- 头部区域（可配合layui已有的水平导航） -->
    <ul class="layui-nav layui-layout-right">
      <li class="layui-nav-item">
        <a href="javascript:;">
          <img src="http://t.cn/RCzsdCq" class="layui-nav-img">
          <s:property value="#session.username"/>
        </a>
        <dl class="layui-nav-child">
          <dd><a onClick="parent.displayinhere.location.href='u_self_update.jsp'">基本资料</a></dd>
        </dl>
      </li>
      <li class="layui-nav-item"><a href="index.jsp">退出</a></li>
    </ul>
  </div>
  
  <div class="layui-side layui-bg-black">
    <div class="layui-side-scroll">
      <!-- 左侧导航区域（可配合layui已有的垂直导航） -->
      <ul class="layui-nav layui-nav-tree"  lay-filter="test">
        <li class="layui-nav-item layui-nav-itemed">
          <a class="" href="javascript:;">社区论坛</a>
          <dl class="layui-nav-child">
            <dd><a onClick="parent.displayinhere.location.href='u_music_show.jsp'">天籁之音</a></dd>
            <dd><a onClick="parent.displayinhere.location.href='u_cartoon_show.jsp'">每日追番</a></dd>
            <dd><a onClick="parent.displayinhere.location.href='u_joke_show.jsp'">鬼畜笑话</a></dd>
          </dl>
        </li>
        
        <li class="layui-nav-item">
          <a href="javascript:;">上传发布</a>
          <dl class="layui-nav-child">
            <dd><a onClick="parent.displayinhere.location.href='u_music_add.jsp'">分享音乐</a></dd>
            <dd><a onClick="parent.displayinhere.location.href='u_cartoon_add.jsp'">更新漫画</a></dd>
             <dd><a onClick="parent.displayinhere.location.href='u_joke_add.jsp'">编写段子</a></dd>
          </dl>
        </li>
        
        <li class="layui-nav-item">
          <a href="javascript:;">作品管理</a>
          <dl class="layui-nav-child">
            <dd><a onClick="parent.displayinhere.location.href='u_content_show.jsp'">全部作品</a></dd>
         
          </dl>
        </li>
        
        <li class="layui-nav-item">
          <a href="javascript:;">个人管理</a>
          <dl class="layui-nav-child">
            <dd><a onClick="parent.displayinhere.location.href='u_self_update.jsp'" >查看个人信息</a></dd>
          </dl>
        </li>
      </ul>
    </div>
  </div>
  
  <div class="layui-body">
    <!-- 内容主体区域 -->
   <iframe src="u_music_show.jsp" style="position:absolute;height:100%;width: 100%" name="displayinhere"></iframe>
  </div>
  
  <div class="layui-footer">
    <!-- 底部固定区域 -->
    PYfun娱乐
  </div>
</div>
<script src="layui/layui.js"></script>
<script>
//JavaScript代码区域
layui.use('element', function(){
  var element = layui.element;
  
});
</script>
  </body>
</html>
