<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login With JSP</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.1.3/css/bootstrap.min.css" rel="stylesheet" /> 
<link href="css/style_login.css" rel="stylesheet" type="text/css">
<link href="css/style.css" rel="stylesheet" type="text/css">
</head>
<body>

	<form action="log" method="post">
		<div class="container">
			<div class="modal-header">
			<h3 class="modal-title">User Login</h3>
				<button type="button" class="close" data-dismiss="modal">&times;</button>
			</div>
			
			<br>
			<div class="modal-body">
				<div class="form-group">
					<label for="username"> User Name</label> <input type="text"
						name="username" class="form-control" placeholder="Username"
						required="required">
				</div>
				<div class="form-group">
					<label for="password">Password</label> <input type="password"
						name="password" class="form-control" placeholder="Password"
						required="required">
				</div>
				<div class ="col text-center">
					<button type="submit">Login</button>
					<br>
				</div>
			</div>
			<div class="modal-footer">
				 Not a member yet ? <a href="registration.jsp" style="left: auto;">Join Us</a>
				</div>
			</div>
		</div>

	</form>
	<script type="text/javascript" src="Bootstrap/js/bootstrap.js"></script>
</body>
</html>




<!-- <fieldset>
	<legend>Login</legend>
	<form action="log" method="post">
	<table>
		<tr>
			<td>User name :</td>
			<td><input type="text" name="username" required="required"></td>
		</tr>
		<tr>
			<td>Password :</td>
			<td><input type="password" name="password" required="required"></td>
		</tr>
		<tr>
			<td>&nbsp;</td>
			<td><input type="submit" value="LOGIN"></td>
		</tr>
		<tr>
			<td>&nbsp;</td>
			<td>Not a member yet ? <a href="registration.jsp">Join Us</a></td>
		</tr>
	</table>
</form>


</fieldset>
</body>
</html> -->