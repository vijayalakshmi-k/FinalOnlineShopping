<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="s"%>

<s:url var="images" value="/resources/images"></s:url>
<c:set var="contextRoot" value="${pageContext.request.contextPath}" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Online Shopping- ${title}</title>
<link rel="Stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
	<!--  Navigation -->
	<%@ include file="header.jsp"%>

	<!--  Home content -->
	<c:if test="${userClickHome==true}">
		<%@ include file="home.jsp"%>
	</c:if>

	<c:if test="${userClickAbout==true}">
		<%@ include file="about.jsp"%>
	</c:if>

	<c:if test="${userClickAllProducts==true}">
		<%@ include file="productlist.jsp"%>
	</c:if>

	<c:if test="${userClickManageProducts==true}">
		<%@ include file="manageProducts.jsp"%>
	</c:if>

	<c:if test="${userClickLogin==true}">
		<%@ include file="login.jsp"%>
	</c:if>
	<c:if test="${userClickRegister==true}">
		<%@ include file="register.jsp"%>
	</c:if>
	<c:if test="${userClickShowProduct==true}">
		<%@ include file="viewSingleProduct.jsp"%>
	</c:if>
	<c:if test="${userClickShowCart == true}">
		<%@include file="cart.jsp"%>
	</c:if>

	<!--  Footer -->
	<%@ include file="footer.jsp"%>
</body>
</html>