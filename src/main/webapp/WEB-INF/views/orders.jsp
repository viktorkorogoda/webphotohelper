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
        <h1>Orders list</h1>
        
        <c:if test="${not empty orders}">
				<table class="user-table table table-bordered" id="order-table">
					<thead>
						<tr>
							<th>Order Status</th>
							<th>Date Order</th>
							<th>Order Cost</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${orders}" var="order">
							<tr>
								<td>${order.orderStatus}</td>
								<td>${order.dateOrder}</td>
								<td>${order.cost}</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</c:if>
    </div>
</div>
</body>
</html>