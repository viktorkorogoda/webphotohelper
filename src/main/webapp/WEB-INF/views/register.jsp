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
					<li id="services" class="menu-list"><a href="services">Услуги</a></li>
					<li id="contacts" class="menu-list"><a href="contacts">Контакты</a></li>
					<li id="about" class="menu-list"><a href="about">О нас</a></li>
					<li id="login" class="menu-list"><a href="login">Вход</a></li>
					<li id="new-client" class="menu-list"><a href="register">Регистрация</a></li>
					<c:if test="${name != 'anonymousUser' && name != null}">
								<li id="logout" class="menu-list">
									<a href="<c:url value="/logout" />" > Выход</a>
								</li>
					</c:if>
					<c:if test="${name != 'anonymousUser' && name != null}">
								<li id="profile" class="menu-list">
									<a href="<c:url value="/profile" />" > Здравствуйте, ${name}</a>
								</li>
					</c:if>
				</ul>
			</div>
		</div>
		<div class="content-area">
			<div class="content-area-block">
				<div id="reg-area">
					<form action="addNewUser" method="post" id="register-form">
						<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
						<label for="login">  Логин <span>*</span></label>
							<input type="text" id="loginField" name="login" class="text-input" placeholder="loginIvanov" required>
							
						<label for ="password"> Пароль <span>*</span></label>
							<input type="text" id="passField" name="password" class="text-input" placeholder="ivanov123456" required>
							
						<label for ="nameandsurname"> Имя и фамилия <span>*</span></label>
							<input type="text" id="nameAndSurnameField" name="nameandsurname" class="text-input" placeholder="Ivan Ivanov" required>
							
						<label for ="phone"> Телефон <span>*</span></label>
							<input type="text" id="phoneField" name="phone" class="text-input" placeholder="+375123456789" required>
							
						<label for ="email"> Адрес электронной почты <span>*</span></label>
							<input type="email" id="emailField" name="email" class="text-input" placeholder="ivanivanov@mail" required>
							
						<label for ="note"> Примечание </label>
							<input type="text" id="noteField" name="note" class="text-input" placeholder="Примечание">
							
						<label for ="cityIndex"> Индекс </label>
							<input type="text" id="cityIndexField" name="cityIndex" class="text-input" placeholder="225051" >
							
						<label for ="city"> Город </label>
							<input type="text" id="cityField" name="city" class="text-input" placeholder="Каменец" >
							
						<label for ="region"> Область </label>
							<input type="text" id="regionField" name="region" class="text-input" placeholder="Брестская" >
							
						<label for ="address"> Адрес </label>
							<input type="text" id="addressField" name="address" class="text-input" placeholder="ул.Брестская" >
						<label for ="coutry"> Страна </label>
							<input type="text" id="countryField" name="country" class="text-input" placeholder="Беларусь" >
						<input type = "submit" value="Регистрация" class="btn-submit">
					</form>
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