<%--
  Created by IntelliJ IDEA.
  User: PSYGEIM
  Date: 2019/12/20
  Time: 15:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<link href='http://fonts.useso.com/css?family=Open+Sans:400,600,700' rel='stylesheet' type='text/css'>
<link href="css/bootstrap.min.css" rel="stylesheet" type="text/css">
<link href="css/templatemo_style.css" rel="stylesheet" type="text/css">
<head>
    <title>个人发布文件查看</title>
</head>
<body>
<section id="home" class="templatemo-section">
<s:iterator value="#session.ucartoonSession">
    <div class="container">
        <div class="row">
            <div class="col-lg-6 col-md-6 templatemo-position-relative">
                <div class="templatemo-flex-center templatemo-black-bg text-center">
                    <div class="templatemo-home-image-container">
                        <img src="<s:property value="context"/>"alt="Home" class="templatemo-home-image">
                        <div class="templatemo-image-overlay">
                            <p class="text-uppercase templatemo-gold"><s:property value="cartoonname"/></p>
                            <p class="text-uppercase"><a href="u_cartoon_update.jsp?name=<s:property value="cartoonname"/>&id=<s:property value="id"/>&context=<s:property value="context"/>">修改</a></p>
                            <p class="text-uppercase"><a href="u_cartoon_delete?id=<s:property value="id"/>&uuser.username=<s:property value="username"/>">删除</a></p>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <br><br>
</s:iterator>
</section>


<section id="services" class="templatemo-section">
<s:iterator value="#session.ujokeSession">
    <div class="container">
        <div class="row">
            <div class="col-lg-6 col-md-6 templatemo-position-relative">
                <div class="templatemo-flex-center templatemo-black-bg text-center">
                    <div class="templatemo-flex-center templatemo-brown-rectangle-bg">
                            <div class="templatemo-home-image-container">
                            <h2 class="templatemo-gold"><s:property value="jokename"/></h2>
                            <div class="templatemo-service-container margin-top-15">
                                <img src="images/plan-1.png" alt="Plan 1" class="templatemo-service-image">
                                <div class="templatemo-service-content text-left">
                                    <p class="templatemo-service-description"><s:property value="context"/></p>
                                </div>
                                <div class="templatemo-image-overlay">

                                    <p class="text-uppercase"><a href="u_joke_update.jsp?name=<s:property value="jokename"/>&context=<s:property value="context"/>&id=<s:property value="id"/>">修改</a></p>
                                    <p class="text-uppercase"><a href="u_joke_delete?id=<s:property value="id"/>&uuser.username=<s:property value="username"/>">删除</a></p>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <br><br>
</s:iterator>
</section>

<section id="about" class="templatemo-section" >
<s:iterator value="#session.umusicSession">
    <div class="container">
        <div class="row">
            <div class="col-lg-6 col-md-6 templatemo-position-relative">
                <div class="templatemo-flex-center templatemo-black-bg text-center">
                    <div class="templatemo-flex-center templatemo-brown-rectangle-bg">
                        <ul>
                            <li>
                                <div class="text-center templatemo-team-member-container">
                                    <div class="templatemo-member-img-container">
                                        <img src="images/team-img-frame.png" alt="Team img frame" class="templatemo-img-frame">
                                        <img src="images/music.jpg" alt="Team Member 1" class="tm-team-member-img">
                                    </div>
                                    <h3 class="tm-team-member-title templatemo-gold text-uppercase margin-top-15"><s:property value="musicname"/></h3>
                                    <img src="images/underline.png" alt="Underline" class="margin-top-15 img-responsive center-block">
                                    <p class="margin-top-15"><audio src="<s:property value="context"/>" controls="controls" width="30px"/></p>
                                    <div class="templatemo-image-overlay">
                                      
                                        <p class="text-uppercase"><a href="u_music_delete?id=<s:property value="id"/>&uuser.username=<s:property value="username"/>">删除</a></p>
                                    </div>
                                </div>
                            </li>
                        </ul>
                    </div>
                </div>
            </div>
        </div>
    </div>
</s:iterator>
</section>


</body>
</html>
