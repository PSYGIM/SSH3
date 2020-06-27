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
	  <link rel="shortcut icon" href="/img/favicon.png">
        <link href="https://fonts.googleapis.com/css?family=Playfair+Display:400,700,900&amp;subset=latin-ext" rel="stylesheet">

        <link rel="stylesheet" type="text/css" href="css/main.css">
    </head>
    
    <body class="contains-hero main-page">
        <!-- PRELOADER -->
       
        
        <div class="preloader">
            <!-- SPINNER -->
            <div class="spinner">
              <div class="bounce-1"></div>
              <div class="bounce-2"></div>
              <div class="bounce-3"></div>
            </div>
        </div>
        <!-- HERO -->
        
        <div class="hero">
            <!-- FRONT CONTENT -->
            <div class="front-content">
                <!-- CONTAINER MID -->
                <s:iterator value="#session.cartoonSession">
                <div class="container-mid">
                    <!-- ANIMATION CONTAINER -->
                    <div class="animation-container animation-fade-right" data-animation-delay="0">
                        
                        <h1 align="center"><s:property value="cartoonname"/></h1>
                        
                    </div>
                    <!-- /ANIMATION CONTAINER -->
                    
                    
                    <!-- ANIMATION CONTAINER -->
                    <div class="animation-container animation-fade-left" data-animation-delay="200"> 
                       
                        <p class="subline" align="center">作者：<s:property value="username"/></p>
                        
                    </div>
                    <!-- /ANIMATION CONTAINER -->
                </div>
                <!-- /CONTAINER MID -->
            </div>
            <!-- /FRONT CONTENT -->


            <!-- BACKGROUND CONTENT -->
            <div class="background-content parallax-on">
                
                
                <!-- BACKGROUND CONTENT INNER -->
                <div class="background-content-inner">

                    <div class="background-overlay"></div>
                    <div class="background-img layer" data-depth="0.05"></div>
                
                </div>
                <!-- /BACKGROUND CONTENT INNER -->
            </div>
            <!-- /BACKGROUND CONTENT -->
        </div>
        
        <!-- PORTFOLIO -->
        <div class="portfolio">
            <!-- ITEM -->
            
               
                <i class="fa fa-eye" aria-hidden="true"></i>
                <div class="item-cover" >
                	<img src="<s:property value="context"/>" >
                </div>
             
            </a>
            <!-- /ITEM -->
        </div>
        </s:iterator>
        <!-- JAVASCRIPTS -->
        <script type="text/javascript" src="js/plugins.js"></script>
        <script type="text/javascript" src="js/main.js"></script>

  </body>
</html>
