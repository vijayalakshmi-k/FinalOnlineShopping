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
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="content">

		<div class="container">
			<%-- this will be displayed only when user has logged out --%>
			<c:if test="${not empty logout}">
				<div class="row">
					<div class="col-md-offset-3 col-md-6">
						<div class="alert alert-success">${logout}</div>
					</div>
				</div>

			</c:if>
			<div class="row">

				<div class="col-md-offset-4 col-md-4">

					<div class="panel panel-primary">

						<div class="panel-heading">
							<h4>Login</h4>
						</div>

						<div class="panel-body">
							<form action="${contextRoot}/login" method="POST"
								class="form-horizontal">
								<div class="form-group">
									<label for="username" class="col-md-4 control-label">Email:
									</label>
									<div class="col-md-8">
										<input type="text" name="username" id="username"
											class="form-control" />
									</div>
								</div>
								<div class="form-group">
									<label for="password" class="col-md-4 control-label">Password:
									</label>
									<div class="col-md-8">
										<input type="password" name="password" id="password"
											class="form-control" />
									</div>
								</div>
								<div class="form-group">
									<div class="col-md-offset-4 col-md-8">
										<input type="submit" value="Login" class="btn btn-primary" />
										<input type="hidden" name="${_csrf.parameterName}"
											value="${_csrf.token}" />
									</div>
								</div>
							</form>

						</div>
						<div class="panel-footer">
							<div class="text-right">
								New User - <a href="${contextRoot}/register">Register Here</a>
							</div>
						</div>
					</div>

				</div>

			</div>

		</div>

	</div>

</body>
</html>