<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
        "http://www.w3.org/TR/html4/loose.dtd">
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
					<li id="clients-list" class="menu-list"><a href="clients">Clients
							list</a></li>
					<li id="orders-list" class="menu-list"><a href="orders">Orders
							list</a></li>
					<li id="create-order" class="menu-list"><a href="createorder">Create
							order</a></li>
					<li id="new-client" class="menu-list"><a href="newclient">New
							client</a></li>
				</ul>
			</div>
		</div>
		<div class="content-area">
			<div class="search-client">
				<form action="clientcard" class="search-client-form" method="post">
					<input type="text" class="search-client-input" name="name"
						placeholder="Name" id="name-search" /> 
					<input type="text" class="search-client-input" name="surname" 
						placeholder="Surname" id="surname-search" /> 
					<input type="submit" class="search-client-input" value="Search" 
						id="btn-search"/>
				</form>
			</div>	
		</div>
	</div>
</body>
</html>