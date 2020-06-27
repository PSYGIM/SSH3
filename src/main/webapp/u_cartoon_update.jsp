<%--
  Created by IntelliJ IDEA.
  User: PSYGEIM
  Date: 2019/12/22
  Time: 14:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>漫画更新页面</title>
<link href='http://fonts.useso.com/css?family=Open+Sans:400,600,700' rel='stylesheet' type='text/css'>
<link href="css/bootstrap.min.css" rel="stylesheet" type="text/css">
<link href="css/templatemo_style.css" rel="stylesheet" type="text/css">

</head>
<body>
<% request.setCharacterEncoding("utf-8");
  	 String cartoonname=new String(request.getParameter("name"));
  %>
<br><br><br><br>
<section id="contact" class="templatemo-section">
    <div class="container" align="center">
        <div class="row">
            <div class="col-lg-6 col-md-6">
                <div class="templatemo-flex-center templatemo-black-bg">
                    <form action="u_cartoon_update" method="post" enctype="multipart/form-data">
                        <div class="tm-contact-form">
                            <div class="form-group">
                                <input type="hidden" name="cartoon.username" value="<s:property value="#session.username"/>">
                                <input type="hidden" name="cartoon.id" value="<%=request.getParameter("id")%>">
                                <input type="hidden" name="cartoon.context" value="<%=request.getParameter("context")%>">
                            </div>
                            <div class="form-group">
                                <input type="text" name="cartoon.cartoonname" id="contact_name" class="form-control" value="<%=cartoonname%>"/>
                            </div>
                           
                        </div>
                        <input type="submit" class="btn text-uppercase templatemo-btn templatemo-send-btn" value="修改漫画"/>

                    </form>
                </div>
            </div>

        </div>
    </div>
</section>

</body>
</html>
