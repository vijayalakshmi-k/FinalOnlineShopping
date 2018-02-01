<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="Stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<style>
.navbar-default {
	background-color: #FFA07A;
	border-color: #FFA07A;
}
</style>
</head>
<body>
	<nav class="navbar navbar-default">
	<div class="container-fluid">
		<div class="navbar-header">
			<a class="navbar-brand" href="${contextRoot}/home">Buyitt</a>
		</div>
		<ul class="nav navbar-nav">
			<li><a href="${contextRoot}/about">About</a></li>
			<li><a href="${contextRoot}/show/all/products">Products</a></li>
			<li><a href="${contextRoot}/manage/products">Manage products</a></li>
		</ul>
		<ul class="nav navbar-nav navbar-right">
			<li><a href="${contextRoot}/login"><span
					class="glyphicon glyphicon-log-in"></span>Login</a></li>
			<li><a href="${contextRoot}/register"> Sign up</a></li>
			<li><a href="#"><span
					class="glyphicon glyphicon-shopping-cart"></span>Cart</a></li>
		</ul>
	</div>
	</nav>
</body>
</html>