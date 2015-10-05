<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
        "http://www.w3.org/TR/html4/loose.dtd">

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Service Station</title>
    <link href="css/styles.css" rel="stylesheet" type="text/css">
    <link href="css/bootstrap.css" rel="stylesheet">
</head>
<body>
<div class="mainArea">
    <div class="menu-container">
        <div class="menu" id="menu">
            <ul class="menu-tabs">
                <li id="main-page" class="menu-list"><a href="index">Main</a></li>
                <li id="clients-list"class="menu-list"><a href="clients">Clients list</a></li>
                <li id="orders-list" class="menu-list"><a href="orders">Orders list</a></li>
                <li id="create-order" class="menu-list"><a href="createorder">Create order</a></li>
                <li id="new-client" class="menu-list"><a href="newclient">New client</a></li>
            </ul>
        </div>
    </div>
    <div class="content-area">

        <h1>Create order</h1>
        <div class="new-form-div">
            <form action="addNewOrder" class="new-form" method="post">

                <label for="idClient"> Client</label><br>
                <select size="1" name="idClient" id="client">
                	<option disabled> Select client name </option>
               		<c:forEach items="${clients}" var="client"> 
                    	<option value="${client.idClient}">${client.name} ${client.surname}</option>
                    </c:forEach>
                </select><br>
                <label for="idCar"> Car</label><br>
                <select size="1" name="idCar" id="car">
                    <option disabled> Select car </option>
                    <c:forEach items="${cars}" var="car"> 
                    	<option value="${car.idCar}">${car.make} ${car.model} ${car.vin}</option>
                    </c:forEach>
                </select><br>
                <label for="dateorder"> Date</label>
                <input type="text" name="dateOrder" class="text-input" placeholder="Date">
                <label for="cost"> Order amount</label>
                <input type="text" name="cost" class="text-input" placeholder="Order amount">
                <input type="submit" class="btn-add-new" value="Add new order">
            </form>
        </div>
    </div>
</div>
</body>
</html>