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
	
	<c:choose>
		<c:when test="${orders.size() > 0}">
		<h2>Orders available for delivery</h2>
		<table border = "1" style = "border-collapse: collapse">
		<tr><th>Name</th><th>Location</th><th>Details</th></tr>
			<c:forEach items="${orders}" var="order">
				<tr>
				<td>${order.getName()}</td>
				<td>${order.getLocation()}</td>
				<td>${order.getDetails()}</td>
				<td><a href = "Deliver?id=${order.getId()}">Sign up to deliver</a></td>
				</tr>
			</c:forEach>
		</table>
		</c:when>
		<c:otherwise><p>No orders at the moment please try again later</p></c:otherwise>
	</c:choose>

    <!-- <div class="buttons">
        <a href="default.asp" target="_blank">Place an Order</a><br> <br>
        <a href="default.asp" target="_blank">Deliver an Order</a>
    </div> -->



    <!-- FOOTER -->
    <footer class="footer">
        </div>
        ©2020 GoGo Food - California State University, Los Angeles
    </footer>
    <!-- END OF FOOTER -->

</body>

</html>