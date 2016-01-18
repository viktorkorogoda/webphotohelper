<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
        "http://www.w3.org/TR/html4/loose.dtd">
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>Web Photo Helper</title>
<link href="css/styles.css" rel="stylesheet" type="text/css">
<link href="css/bootstrap.css" rel="stylesheet">
<script src="//use.edgefonts.net/nobile:n4,i4,n5,i5,n7,i7:all;open-sans-condensed:n3,i3,n7:all;poiret-one:n4:all;lobster:n4:all;jura:n3,n4,n5,n6:all.js"></script> 
</head>
<body>

	<div class="mainArea">
		<div class="menu-container">
			<div class="menu" id="menu">
				<ul class="menu-tabs">
					<li id="main-page" class="menu-list"><a href="index">Главная</a></li>
					<li id="services" class="menu-list"><a href="services.jsp">Услуги</a></li>
					<li id="contacts" class="menu-list"><a href="contacts">Контакты</a></li>
					<li id="about" class="menu-list"><a href="about">О нас</a></li>
					<li id="login" class="menu-list"><a href="login">Вход</a></li>
					<li id="new-client" class="menu-list"><a href="register">Регистрация</a></li>
					<c:if test="${(name != 'anonymousUser') && (name != null)}">
								<li id="logout" class="menu-list">
									<a href="<c:url value="/logout" />" > Выход</a>
								</li>
					</c:if>
					<c:if test="${(name != 'anonymousUser') && (name != null)}">
								<li id="profile" class="menu-list">
									<a href="<c:url value="/profile" />" > Здравствуйте, ${name}</a>
								</li>
					</c:if>
				</ul>
			</div>
		</div>
		<div class="content-area">
			<div class="content-area-block">
			
					
			</div>
				
		</div>
	</div>
	<div id="footer">  
		<div id="footer-info">"ФОТО-МГНОВЕНИЕ"</div>  
			<div id="social"> 
				<div id="social-icon">
					<img src="img/vk.gif">
					<img src="img/fb.gif">
					<img src="img/tw.gif">
				</div>
			</div>
	</div>
</body>
</html>