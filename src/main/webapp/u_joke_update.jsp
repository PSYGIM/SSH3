<%--
  Created by IntelliJ IDEA.
  User: PSYGEIM
  Date: 2019/12/22
  Time: 9:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
  <link href='http://fonts.useso.com/css?family=Open+Sans:400,600,700' rel='stylesheet' type='text/css'>
<link href="css/bootstrap.css" rel="stylesheet" type="text/css">
<link href="css/templatemo_style.css" rel="stylesheet" type="text/css">
<head>
    <title>修改笑话</title>
</head>
<body>
<% request.setCharacterEncoding("utf-8");
  	 String jokename=new String(request.getParameter("name"));
  	 String context=new String(request.getParameter("context"));
  %>
<!--<form action="u_joke_update!update" method="post" name = "myform" >
    <input type="hidden" name="joke.id" value="<%=request.getParameter("id")%>">
    <input type="hidden" name="uuser.username" value="<s:property value="#session.username"/>">
    <input type="text" name = "joke.context" value="<%=context%>">
    <input type="text" value="<%=jokename%>" name="joke.jokename">
    <input type="submit"  value = "上传">

</form>  -->

<br><br><br><br>
<section id="contact" class="templatemo-section">
    <div class="container" align="center">
        <div class="row">
            <div class="col-lg-6 col-md-6">
                <div class="templatemo-flex-center templatemo-black-bg">
                    <form action="u_joke_update" method="post">
                        <div class="tm-contact-form">
                            <div class="form-group">
                            	<input type="hidden" name="joke.id" value="<%=request.getParameter("id")%>">
                            	 <input type="hidden" name="joke.username" value="<s:property value="#session.username"/>">
                                
                            </div>
                            <div class="form-group">
                                <input type="text" id="contact_name" class="form-control"  name="joke.jokename" value="<%=jokename%>"/>
                            </div>
                            <div class="form-group">
                                <textarea id="contact_message" class="form-control" rows="8"  name = "joke.context"><%=context%></textarea>
                            </div>
                          
                        </div>
                        <input type="submit" class="btn text-uppercase templatemo-btn templatemo-send-btn" value="笑话修改"/>

                    </form>
                </div>
            </div>

        </div>
    </div>
</section>
</body>
</html>
