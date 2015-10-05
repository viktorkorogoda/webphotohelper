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
                <li id="clients-list"class="menu-list"><a href="clients">Clients list</a></li>
                <li id="orders-list" class="menu-list"><a href="orders">Orders list</a></li>
                <li id="create-order" class="menu-list"><a href="createorder">Create order</a></li>
                <li id="new-client" class="menu-list"><a href="newclient">New client</a></li>
            </ul>
        </div>
    </div>
    <div class="content-area">

        <h1>New client</h1>
        <div class="new-form-div">
            <form action="addNewClient" class="new-form" method="POST">
                <label for="name"> First Name</label>
                <input type="text" name="name" class="text-input" placeholder="First Name">
                
                <label for="surname"> Last Name</label>
                <input type="text" name="surname" class="text-input" placeholder="Last Name">
                
                <label for="birthday"> Date of Birth</label>
                <input type="text" name="birthday"class="text-input" placeholder="Date of birth">
                
                <label for="address"> Address</label>
                <input type="text" name="address"class="text-input" placeholder="Address">
                
                <label for="phone"> Phone</label>
                <input type="text" name="phone" class="text-input" placeholder="Phone">
                
                <label for="email"> Email</label>
                <input type="text" name="email" class="text-input" placeholder="Email">
                
                <input type="submit" class="btn-add-new" value="Add new client">
            </form>
        </div>
    </div>
</div>
</body>
</html>