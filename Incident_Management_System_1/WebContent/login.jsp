<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login With JSP</title>
<link href="Bootstrap/css/bootstrap.css" rel="stylesheet" type="text/css">
<link href="css/style.css" rel="stylesheet" type="text/css"> 
</head>
<body>

<form action="log" method="post">
<div class="container">
	<div class="row">
			
				<div class="col-md-3"></div>
					<div class="col-md-6 col-xs-12">
						<div class="jumbotron">
						
						<h1 class="text-center">Login Page</h1>
						<br>
						
						<div class="form-group">
							<label class="control-label" for="username"> User Name</label>
							<input type="text" name="username" class="form-control" placeholder="Username" required="required">
						</div>
						<div class="form-group">
							<label class="control-label" for="password">Password</label>
							<input type="password" name="password" class="form-control" placeholder="Password" required="required">
						</div>
						<div>
							<button type="submit" class="btn btn-outline-warning">Login</button>
							<br>
						</div>
						<div>
							<br>
							Not a member yet ? <a href="registration.jsp">Join Us</a>
						</div>
						<div>
						 <br>
						  <a href="admin.jsp">Login as admin</a>						
						</div>
						
					</div>
				</div>
				<div class="col-md-3"></div>		
			
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