<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="shortcut icon" href="/images/hamburgerClipart.png">
    <title>GoGo Food Delivery</title>
    <link rel="stylesheet" type="text/css" href="GGF.css">
</head>

<body>
	
    <ul class="topnav">
        <li><img src="img/USEgogofoodlogo1.jpg" id="logo" alt="GoGo Food logo" style="width:150px;height:120px"></li>
    </ul>
    <h1>Welcome Runners</h1>
	<p>Thank you for participating in delivery</p>
	<table border="1" style="text-align:left; border-collapse: collapse">
	<form action = "Deliver" method = "post">
		<tr>
			<th>Id</th>
			<td name = "id">${id}</td>
		</tr>
		<tr>
			<th>Name on Order</th>
			<td>${name}</td>
		</tr>
		<tr>
			<th>Order Location</th>
			<td>${location}</td>
		</tr>
		<tr>
			<th>Order Details</th>
			<td>${details}</td>
		</tr>
		<tr>
			<th>Runner Name</th>
			<td><input name="runner" size="60" /></td>
		</tr>
		<tr>
			<th>Phone Number</th>
			<td><input name="phone" size="60" /></td>
		</tr>
		<tr>
			<td colspan="2" rowspan="1"><input name="post" type="submit" value="Submit" /></td>
		</tr>
		</form>
		</table>
</body>
</html>