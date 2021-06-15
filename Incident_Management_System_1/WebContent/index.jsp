<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Incident_Management_System</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link
	href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.1.3/css/bootstrap.min.css"
	rel="stylesheet" />
<link href="css/style_index.css" rel="stylesheet" type="text/css">
<link href="css/style.css" rel="stylesheet" type="text/css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.1.3/js/bootstrap.min.js"></script>
</head>
<body>

	<div class="content">
		<h1>Incident Management System</h1>
		<br>

		<div class="container-fluid">
			<img class="img-fluid"
				src="https://www.hft-stuttgart.de/fileadmin/Dateien/Marketing/_processed_/f/3/csm_hochschule-fuer-technik-stuttgart-luftbild_d8d8027aee.jpg"
				class="img-responsive center-block d-block mx-auto" alt="Image">
			<div class="sidenav">
				<a href="registration.jsp" class='s-modal'> Signup </a> <a
					href="login.jsp" class='li-modal'>User Login </a> <a
					href="admin.jsp" class='a-modal'>Admin Login</a> <a
					href="employee.jsp" class='t-modal'>Technical Support Login</a>
			</div>

			<div id="theModal" class="modal fade">
				<div class="modal-dialog">
					<div class="modal-content"></div>
				</div>
			</div>
		</div>
	</div>
	<script>
		$('.li-modal').on(
				'click',
				function(e) {
					e.preventDefault();
					$('#theModal').modal('show').find('.modal-content').load(
							$(this).attr('href'));
				});
		$('.s-modal').on(
				'click',
				function(e) {
					e.preventDefault();
					$('#theModal').modal('show').find('.modal-content').load(
							$(this).attr('href'));
				});
		$('.a-modal').on(
				'click',
				function(e) {
					e.preventDefault();
					$('#theModal').modal('show').find('.modal-content').load(
							$(this).attr('href'));
				});
		$('.t-modal').on(
				'click',
				function(e) {
					e.preventDefault();
					$('#theModal').modal('show').find('.modal-content').load(
							$(this).attr('href'));
				});
	</script>
</body>
</html>