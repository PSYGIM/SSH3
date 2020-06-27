<%--
  Created by IntelliJ IDEA.
  User: PSYGEIM
  Date: 2019/12/20
  Time: 15:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<link href='http://fonts.useso.com/css?family=Open+Sans:400,600,700' rel='stylesheet' type='text/css'>
<link href="css/bootstrap.min.css" rel="stylesheet" type="text/css">
<link href="css/templatemo_style.css" rel="stylesheet" type="text/css">

<head>
    <title>添加音乐</title>
</head>
<body>
<section id="contact" class="templatemo-section">
    <div class="container" align="center">
        <div class="row">
            <div class="col-lg-6 col-md-6">
                <div class="templatemo-flex-center templatemo-black-bg">
                    <form action="music_add" method="post" enctype="multipart/form-data">
                        <div class="tm-contact-form">
                            <div class="form-group">
                                <input type="text"  class="form-control" placeholder="音乐，人类的灵魂，只有懂得音乐的人才懂得生活" readonly/>
                            </div>
                            <div class="form-group">
                                <input type="hidden" name="username" value="<s:property value="#session.username"/>">
                            </div>
                            <br><br><br>
                            <div class="form-group">
                                <input type="text" name="musicname" >
                            </div>
                            <br><br><br>
                            <div class="form-group">
                                <input type="text" name="context" >
                            </div>

                        </div>
                        <input type="submit" class="btn text-uppercase templatemo-btn templatemo-send-btn" value="分享音乐"/>

                    </form>
                </div>
            </div>

        </div>
    </div>
</section>

</body>
</html>
