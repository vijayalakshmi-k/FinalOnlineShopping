<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<c:set var="contextRoot" value="${pageContext.request.contextPath}" />
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
		<div class="col-md-offset-4 col-md-4">
			<div class="panel panel-primary">
				<div class="panel-heading">
					<h4>Create an Account</h4>
				</div>
				<div class="panel-body">
					<form action="${contextRoot}/register" method="POST"
						class="form-horizontal">
						<div class="form-group">
							<label for="username" class="col-md-4 control-label">Name</label>
							<div class="col-md-8">
								<input type="text" name="username" id="username"
									class="form-control" />
							</div>
						</div>
						<div class="form-group">
							<label for="mobno" class="col-md-4 control-label">Mobile
								Number</label>
							<div class="col-md-8">
								<input type="text" name="mobno" id="mobno" class="form-control" />
							</div>
						</div>
						<div class="form-group">
							<label for="email" class="col-md-4 control-label">Email</label>
							<div class="col-md-8">
								<input type="text" name="email" id="email" class="form-control" />
							</div>
						</div>
						<div class="form-group">
							<label for="pwd" class="col-md-4 control-label">Password</label>
							<div class="col-md-8">
								<input type="text" name="pwd" id="pwd" class="form-control" />
							</div>
						</div>
						<div class="form-group">
							<label for="address" class="col-md-4 control-label">Address</label>
							<div class="col-md-8">
								<input type="text" name="address" id="address"
									class="form-control" />
							</div>
						</div>
						<div class="form-group">
							<div class="col-md-offset-4 col-md-8">
								<input type="submit" value="Register" class="btn btn-primary" />
								<input type="hidden" name="${_csrf.parameterName}"
									value="${_csrf.token}" />
							</div>
						</div>
					</form>
				</div>
			</div>
		</div>
	</div>
</body>
</html>