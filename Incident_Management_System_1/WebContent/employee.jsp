<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
<link href="Bootstrap/css/bootstrap.css" rel="stylesheet"
	type="text/css">
</head>
<body>

	<form action="employee" method="post">
		<div class="container">
			<div class="row">

				<div class="col-md-3"></div>
				<div class="col-md-6 col-xs-12">
					<div class="jumbotron">
						<h1 class="text-center">Employee Page</h1>
						<br>

						<div class="form-group">
							<label class="control-label" for="username"> User Name</label> <input
								type="text" name="username" class="form-control"
								placeholder="Username" required="required">
						</div>
						<div class="form-group">
							<label class="control-label" for="password">Password</label> <input
								type="password" name="password" class="form-control"
								placeholder="Password" required="required">
						</div>
						<div>
							<button type="submit" class="btn btn-outline-warning">Login</button>
							<br>
						</div>
						<div>
							<br> <a href="index.jsp">Not an Employee</a>
						</div>
					</div>
				</div>
				<div class="col-md-3"></div>

			</div>
		</div>

	</form>
	<script type="text/javascript" src="Bootstrap/js/bootstrap.js"></script>
	<!-- <script>

	document.getElementNyId();
	</script> -->
</body>
</html>
