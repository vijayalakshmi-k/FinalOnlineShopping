<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div class="container">

		<!-- Breadcrumb -->
		<div class="row">
			<div class="col-xs-12">
				<ol class="breadcrumb">
					<li><a href="${contextRoot}/home">Home</a></li>
					<li><a href="${contextRoot}/show/all/products">Products</a></li>
					<li class="active">${product.name}</li>
				</ol>
			</div>
		</div>
		<div class="row">
			<!-- Display the product image -->
			<div class="col-xs-12 col-sm-4">
				<div class="thumbnail">
					<img src="${images}/${product.code}.jpg" class="img img-responsive" />
				</div>
			</div>

			<!--  product description -->
			
			<div class="col-xs-12 col-sm-8">
				<h3>${product.productname}</h3>
				<hr />
				<p>${product.description}</p>
				<hr />
				<h4>
					Price: <strong> &#8377; ${product.unitPrice} /-</strong>
				</h4>
				<hr />
				<h3>${product.stock}</h3>
				<hr />
				<security:authorize access="hasAuthority('USER')">
					<c:choose>
						<c:when test="${product.quantity < 1}">
							<a href="javascript:void(0)" class="btn btn-success disabled"><strike>
									<span class="glyphicon glyphicon-shopping-cart"></span> Add to
									Cart
							</strike></a>
						</c:when>
						<c:otherwise>
							<a href="${contextRoot}/cart/add/${product.id}/product"
								class="btn btn-success"> <span
								class="glyphicon glyphicon-shopping-cart"></span> Add to Cart
							</a>
						</c:otherwise>
					</c:choose>
				</security:authorize>
				<security:authorize access="hasAuthority('ADMIN')">
					<a href="${contextRoot}/manage/${product.id}/product"
						class="btn btn-warning"> <span
						class="glyphicon glyphicon-pencil"></span> Edit
					</a>
				</security:authorize>
			</div>
		</div>
	</div>
</body>
</html>