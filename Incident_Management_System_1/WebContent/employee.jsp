<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>TS Login</title>
<link href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.1.3/css/bootstrap.min.css" rel="stylesheet" />
<link href="css/style.css" rel="stylesheet" type="text/css">
</head>
<body>
	<form action="employee" method="post">
		<div class="container">
			<div class="modal-header">
				<h3 class="modal-title">Technical Support Login</h3>
				<button type="button" class="close" data-dismiss="modal">&times;</button>
			</div>
			<div class="modal-body">
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
				<div class ="col text-center">
					<button type="submit" >Login</button>
					<br>
				</div>
			</div>
			<div class="modal-footer">
				<br> <a href="index.jsp">Not an Employee?</a>
			</div>
		</div>
	</form>
	<script type="text/javascript" src="Bootstrap/js/bootstrap.js"></script>
	<!-- <script>

	document.getElementbyId();
	</script> -->
</body>
</html>
