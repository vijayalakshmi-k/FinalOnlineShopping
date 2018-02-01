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
<table class="table">
<tr>
<th>cartId</th>
<th>Product Name</th>
<th>Product Price</th>
<th>User name</th>
<th>Quantity</th>
<th>Total Amount</th>
</tr>
<c:forEach items="${cart}" var="cartproduct">
<tr>
<td>${cartproduct.id}</td>
<td>${cartproduct.productName}</td>
<td>${cartproduct.price}</td>
<td>${cartproduct.user}</td>
<td>${cartproduct.quantity}</td>
<td>${cartproduct.quantity*cartproduct.price}</td>
</tr>
</c:forEach>
<tr>
<td><a href="${contextRoot}/show/all/products" class="btn btn-warning"><span class="glyphicon glyphicon-chevron-left"></span> Continue Shopping</a></td>
<td class="hidden-xs text-center"><strong>Total &#8377; ${user.cart.grandTotal}</strong></td>
<td><a href="#" class="btn btn-success btn-block">Checkout <span class="glyphicon glyphicon-chevron-right"></span></a></td>
</tr>
</table>
</body>
</html>