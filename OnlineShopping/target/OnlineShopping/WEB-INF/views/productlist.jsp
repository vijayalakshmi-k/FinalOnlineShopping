<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="Stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="row">
		<div class="col-xs-12">
			<h3>Available Products</h3>
			<hr />
		</div>

		<c:if test="${userClickAllProducts == true}">
			<ol class="breadcrumb">
				<li><a href="${contextRoot}/home">Home</a></li>
				<li class="active">All Products</li>
			</ol>
		</c:if>

		<div class="col-xs-12">
			<div class="container-fluid">
				<div class="table-responsive">
					<table class="table table-striped table-bordered">
						<thead>
							<tr>
								<th>Id</th>
								<th>&#160;</th>
								<th>Name</th>
								<th>Description</th>
								<th>Stock</th>
								<th>Price</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach items="${products}" var="product">
								<tr>
									<td>${product.id}</td>
									<td style="width: 171px"><img
										src="${contextRoot}/resources/images/products/${product.code}.jpg"
										style="width: 100px; height: 90px;">
									<td>${product.productname}</td>
									<td>${product.description}</td>
									<td>${product.stock}</td>
									<td>${product.price}</td>
									<td>${product.view}</td>

									<td><a href="getProductById/${product.id}"
										class="btn-btn-info" role="button"> <span
											class="glyphicon glyphicon-info-sign"></span></a> <a
										href="addToCart/${product.id}" class="btn-btn-primary"
										style="margin-left: 5px" role="button"> <span
											class="glyphicon glyphicon-shopping-cart"></span></a></td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
				</div>
			</div>
		</div>
	</div>
</body>
</html>