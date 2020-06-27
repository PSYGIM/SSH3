<%--
  Created by IntelliJ IDEA.
  User: PSYGEIM
  Date: 2019/12/20
  Time: 15:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<link href='http://fonts.useso.com/css?family=Open+Sans:400,600,700' rel='stylesheet' type='text/css'>
<link href="css/bootstrap.min.css" rel="stylesheet" type="text/css">
<link href="css/templatemo_style.css" rel="stylesheet" type="text/css">
<head>
    <title>添加笑话</title>
</head>
<body>
<br><br><br><br>
<section id="contact" class="templatemo-section">
    <div class="container" align="center">
        <div class="row">
            <div class="col-lg-6 col-md-6">
                <div class="templatemo-flex-center templatemo-black-bg">
                    <form action="cartoon_add" method="post" enctype="multipart/form-data">
                        <div class="tm-contact-form">
                            <div class="form-group">
                                <input type="hidden" name="username" value="<s:property value="#session.username"/>">
                            </div>
                            <div class="form-group">
                                <input type="text" name="cartoonname" id="contact_name" class="form-control" placeholder="请输入你的漫画名字"/>
                            </div>
                            <br><br>
                            <div class="form-group">
                                <input type = "text" name="context" placeholder="请输入漫画内容">
                            </div>
                            <br><br>
                        </div>
                        <input type="submit" class="btn text-uppercase templatemo-btn templatemo-send-btn" value="上传漫画"/>

                    </form>
                </div>
            </div>

        </div>
    </div>
</section>

</body>
</html>
