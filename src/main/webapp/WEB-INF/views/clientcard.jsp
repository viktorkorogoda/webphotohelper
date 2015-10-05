
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
					<li id="clients-list" class="menu-list"><a href="clients">Clients list</a></li>
					<li id="orders-list" class="menu-list"><a href="orders">Orders list</a></li>
					<li id="create-order" class="menu-list"><a href="createorder">Create order</a></li>
					<li id="new-client" class="menu-list"><a href="newclient">New client</a></li>
				</ul>
			</div>
		</div>
		<div class="content-area">
			<h1>Client card</h1>
			<div>
				<label class="error-label">${errorMessage}</label>
			</div>
			<div class="card">
				<div id="client-info">
					<p id="client-name-info" class="info-client">
						Name <label>${name}</label>
					</p>
					<p id="client-surname-info" class="info-client">
						Surname <label>${surname}</label>
					</p>
					<p id="client-birthday-info" class="info-client">
						Birthday <label>${birthday}</label>
					</p>
					<p id="client-address-info" class="info-client">
						Address <label>${address}</label>
					</p>
					<p id="client-phone-info" class="info-client">
						Phone <label>${phone}</label>
					</p>
					<p id="client-email-info" class="info-client">
						Email <label>${email}</label>
					</p>
				</div>
				<div id="cars-info">
				<form action="addNewCar" method="post">
				
					<label for="make"> Make</label>
	                <input type="text" name="make" class="text-input" placeholder="Make">
	                
	                <label for="makeYear"> Make Year</label>
	                <input type="text" name="makeYear" class="text-input" placeholder="Make Year">
	                
	                <label for="vin"> VIN</label>
	                <input type="text" name="vin"class="text-input" placeholder="VIN">
	                
	                <label for="model"> Model Car</label>
	                <input type="text" name="model"class="text-input" placeholder="Model Car">
	                
	                <input type="text" name="idClient" value="${idClient}" class="text-input" style="display:none">
	                
					<input type="submit" name="new-car" class="text-input" value="Add new car">
				</form>
			
					<c:if test="${not empty cars}">
						<table class="user-table table table-bordered" id="car-table-card">
							<thead>
								<tr>
									<th>Make</th>
									<th>Model Car</th>
									<th>Make Year</th>
									<th>VIN</th>
								</tr>
							</thead>
							<tbody>
								<c:forEach items="${cars}" var="car">
									<tr>
										<td>${car.make}</td>
										<td>${car.model}</td>
										<td>${car.makeYear}</td>
										<td>${car.vin}</td>
									</tr>
								</c:forEach>
							</tbody>
						</table>
					</c:if>
					
					<c:if test="${not empty orders}">
						<table class="user-table table table-bordered" id="order-table-card">
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

		</div>
</body>
</html>