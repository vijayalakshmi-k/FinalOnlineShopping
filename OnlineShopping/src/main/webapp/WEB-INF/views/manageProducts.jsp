<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
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
<script>
	var $alert = $('.alert');
	if ($alert.length) {
		setTimeout(function() {
			$alert.fadeOut('slow');
		}, 3000)
	}
</script>
</head>
<body>
	<div class="container">
		<div class="row">
			<c:if test="${not empty message}">
				<div class="col-xs-12">
					<div class="alert alert-success alert-dismissible">
						<button type="button" class="close" data-dismiss="alert">&times;</button>
						${message}
					</div>
				</div>
			</c:if>
			<div class="col-md-offset-2 col-md-8">
				<div class="panel panel-primary">
					<div class="panel-heading">
						<h4>Add Product</h4>
					</div>
					<div class="panel-body">
						<form:form class="form-horizontal" modelAttribute="product"
							action="${contextRoot}/manage/products" method="POST"
							enctype="multipart/form-data">

							<div class="form-group">
								<label class="control-label col-md-4" for="productname">Product
									Name </label>
								<div class="col-md-8">
									<form:input type="text" path="productname" id="productname"
										class="form-control" />
								</div>
							</div>

							<div class="form-group">
								<label class="control-label col-md-4" for="description">Product
									Description </label>
								<div class="col-md-8">
									<form:input type="text" path="description" id="description"
										class="form-control" />
								</div>
							</div>

							<div class="form-group">
								<label class="control-label col-md-4" for="manufacturer">Product
									Manufacturer </label>
								<div class="col-md-8">
									<form:input type="text" path="manufacturer" id="manufacturer"
										class="form-control" />
								</div>
							</div>

							<div class="form-group">
								<label class="control-label col-md-4" for="price">Product
									Price </label>
								<div class="col-md-8">
									<form:input type="text" path="price" id="price"
										class="form-control" />
								</div>
							</div>

							<div class="form-group">
								<label class="control-label col-md-4" for="stock">Stock</label>
								<div class="col-md-8">
									<form:input type="text" path="stock" id="stock"
										class="form-control" />
								</div>
							</div>

							<div class="form-group">
								<label class="control-label col-md-4" for="image">Image
								</label>
								<div class="col-md-8">
									<form:input type="file" path="image" id="image"
										class="form-control" />
								</div>
							</div>

							<div class="form-group">
								<div class="col-md-offset-4 col-md-8">
									<input type="submit" name="submit" id="submit" value="Submit"
										class="btn btn-primary" />
								</div>
							</div>
						</form:form>
					</div>
				</div>
			</div>
		</div>

	</div>
</body>
</html>