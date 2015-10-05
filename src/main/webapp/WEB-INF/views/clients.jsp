<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
        "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<title>Service Station</title>
<link href="css/styles.css" rel="stylesheet" type="text/css">
<link href="css/bootstrap.css" rel="stylesheet">
<link href="css/jtable.css" rel="stylesheet" type="text/css"></link>
<!-- <script src="http://ajax.googleapis.com/ajax/libs/jquery/1/jquery.js" -->
<!-- 	type="text/javascript"></script> -->
<script src="scripts/jquery-2.1.3.js" type="text/javascript"></script>
<script src="http://ajax.googleapis.com/ajax/libs/jqueryui/1/jquery-ui.js" type="text/javascript"></script>
<script src="scripts/jtable.2.4.0/jquery.jtable.js" type="text/javascript"></script>
<script src="scripts/jtable.2.4.0/external/json2.js" type="text/javascript"></script>
</head>
<body>
	<div class="mainArea">
		<div class="menu-container">
			<div class="menu" id="menu">
				<ul class="menu-tabs">
					<li id="main-page" class="menu-list"><a href="index">Main</a></li>
					<li id="clients-list" class="menu-list"><a href="clients">Clients list</a></li>
					<li id="orders-list" class="menu-list"><a href="orders">Orders list</a></li>
					<li id="create-order" class="menu-list"><a href="createorder">Create order</a></li>
					<li id="new-client" class="menu-list"><a href="newclient">New client</a></li>
				</ul>
			</div>
		</div>
		<div class="content-area">
			<h1>Client list</h1>

			<c:if test="${not empty clients}">
				<table class="user-table table table-bordered" id="client-table">
					<thead>
						<tr>
							<th>Name</th>
							<th>Surname</th>
							<th>Birthday</th>
							<th>Address</th>
							<th>Phone</th>
							<th>Email</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${clients}" var="client">
							<tr>
								<td>${client.name}</td>
								<td>${client.surname}</td>
								<td>${client.birthday}</td>
								<td>${client.address}</td>
								<td>${client.phone}</td>
								<td>${client.email}</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</c:if>
		</div>
</body>
</html>