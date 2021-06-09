<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Incident_Management_System</title>
<style>
h1 {
	text-align: center;
}

/* .container {
	text-align: center;
	border: 7px solid black;
	width: 300px;
	height: 200px;
	padding-top: 100px;
	
}
 */
.center {
	text-align: center;
	margin: 0;
	position: absolute;
	top: 50%;
	left: 50%;
	-ms-transform: translate(-50%, -50%);
	transform: translate(-50%, -50%);
}

#btn {
	font-size: 25px;
}
</style>
</head>
<body>


	<h1>Welcome to Incident Management System</h1>
	<br>
	<div class="container">
		<div class="center">
			<a href="login.jsp">
				<button type="submit">User Login</button>
			</a> <br> <br> <a href="admin.jsp">
				<button type="submit">Admin Login</button>
			</a> <br> <br> <a href="employee.jsp">
				<button type="submit">Support Employee Login</button>
			</a> <br>
		</div>
	</div>
</body>
</html>