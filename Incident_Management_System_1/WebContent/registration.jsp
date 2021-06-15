<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Registration With JSP</title>
<link href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.1.3/css/bootstrap.min.css" rel="stylesheet" />
<link href="css/style.css" rel="stylesheet" type="text/css">
</head>
<body>

	<form action="reg" method="post">
		<div class="container">
			<div class="modal-header">
			<h3 class="modal-title">Register</h3>
				<button type="button" class="close" data-dismiss="modal">&times;</button>
				
			</div>
			<div class="modal-body">
				<div class="form-group">
					<label class="control-label" for="username"> First Name</label> <input
						type="text" name="FirstName" class="form-control"
						placeholder="Firstname" required="required">
				</div>
				<div class="form-group">
					<label class="control-label" for="username"> Last Name</label> <input
						type="text" name="LastName" class="form-control"
						placeholder="Lastname" required="required">
				</div>
				<div class="form-group">
					<label class="control-label" for="email">Email</label> <input
						type="text" name="email" class="form-control" placeholder="Email"
						required="required">
				</div>
				<div class="form-group">
					<label class="control-label" for="username"> User Name</label> <input
						type="text" name="UserName" class="form-control"
						placeholder="Username" required="required">
				</div>
				<div class="form-group">
					<label class="control-label" for="password">Password</label> <input
						type="password" name="password" class="form-control"
						placeholder="Password" required="required">
				</div>
				<div class ="col text-center">
					<button type="submit">Sign Up</button>
					<br>
				</div>
			</div>
			<div class="modal-footer">
				Already a member?<a href="login.jsp">Login</a>
			</div>

		</div>
		
	</form>
	<script type="text/javascript" src="Bootstrap/js/bootstrap.js"></script>
</body>
</html>
<!-- 
<table>
		<tr>
			<td>User name :</td>
			<td><input type="text" name="username" required="required"><td>
		</tr>
		<tr>		
			<td>Email :</td>
			<td> <input type="text" name="email" required="required"></td>
		</tr>
		<tr>
			<td>Password : </td>
			<td><input type="password" name="password" required="required"></td>
		</tr>
		<tr>
			<td>&nbsp;</td>
			<td><input type="submit" value="REGISTER"></td>
		</tr>
		<tr>
			<td>&nbsp;</td>
			<td>All Ready a member ?<a href="login.jsp">Login</a></td>
	</table> -->