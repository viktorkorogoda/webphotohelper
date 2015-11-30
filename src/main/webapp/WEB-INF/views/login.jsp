<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
        "http://www.w3.org/TR/html4/loose.dtd">
<%@include file="include.jsp"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
					<li id="services" class="menu-list"><a href="services">Услуги</a></li>
					<li id="contacts" class="menu-list"><a href="contacts">Контакты</a></li>
					<li id="about" class="menu-list"><a href="about">О нас</a></li>
					<li id="login" class="menu-list"><a href="login">Вход</a></li>
					<li id="new-client" class="menu-list"><a href="newuser">Регистрация</a></li>
				</ul>
			</div>
		</div>
		<div class="content-area">
			<div class="content-area-block">
				<div id="login-area">
				<font color="red" style="font-family: open-sans-condensed, sans-serif; font-size: 22px">${message}</font>
					<form:form id="login-form" action="login" modelAttribute="loginBean">
						<label for="username">  Логин </label>
						 <input type="text" id="loginField" name="username" class="text-input" placeholder="Логин">
						<label for ="password"> Пароль </label>
						<input type="password" id="passField" name="password" class="text-input" placeholder="Пароль">
						<input type = "submit" value="Войти" class="btn-submit">
					</form:form>
				</div>
					
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