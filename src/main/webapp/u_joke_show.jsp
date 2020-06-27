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
	<link href="css/bootstrap.min.css" rel="stylesheet" type="text/css">
	<link rel="stylesheet" href="css/styles.css">
</head>
<body id="wrapper">
	<header id="masthead" class="site-header" role="banner" style="background-position: 50% -50px;background-image: url(img/header.jpg)" >
		<div class="overlay"></div>
		<div class="container">
			<div class="site-branding">
				<img class="site-logo" src="img/logo.png" alt="">
			</div>
		</div>
	</header>
	
	<div id="page-content" class="index-page">
		<s:iterator value="#session.jokeSession">
		<section class="box-content box-5 box-style-3" id="nav-blog">
			<div class="container" >
				<div class="row" >
					<div class="col-md-4" >
						<div class="box-item">
							<div class="svg-container post-svg svg-block">
								<svg xmlns="http://www.w3.org/2000/svg" version="1.1" viewBox="0 0 1950 150">
								  <g transform="translate(0,-902.36218)"></g>
								  <path d="m 898.41609,-33.21176 0.01,0 -0.005,-0.009 -0.005,0.009 z"></path>
								  <path d="m 898.41609,-33.21176 0.01,0 -0.005,-0.009 -0.005,0.009 z"></path>
								  <path d="M 0,150 0,0 1925,0"></path>
								</svg>
							</div>
							<div class="entry-thumb">
								<img class="img-responsive" src="img/1.jpg">
							</div>
							<div class="content">
								<h3 class="entry-title">
									<s:property value="jokename"/>
								</h3>
								<p><s:property value="context"/></p>
							</div>
							<div class="read-more">
								<a href="single.html"><s:property value="username"/></a>
							</div>
							<div class="svg-container post-bottom-svg svg-block">
								<svg xmlns="http://www.w3.org/2000/svg" version="1.1" viewBox="0 0 1890 150">
									<g transform="translate(0,-902.36218)"></g>
									  <path d="m 898.41609,-33.21176 0.01,0 -0.005,-0.009 -0.005,0.009 z"></path>
									  <path d="m 898.41609,-33.21176 0.01,0 -0.005,-0.009 -0.005,0.009 z"></path>
									  <path d="m 1925,0 0,150 -1925,0"></path>
								</svg>
							</div>	
						</div>
					</div>
				</div>
			</div>
		</section>
	</div>
	</s:iterator>
  </body>
</html>
