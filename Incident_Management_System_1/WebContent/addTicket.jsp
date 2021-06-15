<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Add New Ticket</title>
<link href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.1.3/css/bootstrap.min.css" rel="stylesheet" />
<link href="css/style.css" rel="stylesheet" type="text/css">
</head>
<body>
	<div class="form-popup">
		<form action="addTicket" method="post">

			<div class="row">

				<div class="col-md-3"></div>
				<div class="col-md-6 col-xs-12">
					<div class="jumbotron">

						<h3 class="text-center">Add Ticket</h3>
						<br>

						<div class="form-group">
							<label class="control-label" for="ticketName"> Ticket
								Name</label> <input type="text" name="ticketName" class="form-control"
								 required="required">
						</div>
						<div class="form-group">
							<label class="control-label" for="ticketDescription">
								Ticket Description</label> <textarea name="ticketDescription"
								class="form-control" 
								required="required"></textarea>
						</div>
						<div class="form-group">
							<label for="ticketPriority">Ticket Priority</label> <select
								id="ticketPriority" name="ticketPriority">
								<option value=" ">None</option>
								<option value="High">High</option>
								<option value="Medium">Medium</option>
								<option value="Low">Low</option>
							</select>
							<!-- 							<label class="control-label" for="ticketPriority">Ticket -->
							<!-- 								Priority</label> <input type="text" name="ticketPriority" -->
							<!-- 								class="form-control" placeholder="TicketPriority" -->
							<!-- 								required="required"> -->
						</div>
						<div class="form-group">
							<label class="control-label" for="username"> User Name</label> <input
								type="text" name="UserName" class="form-control"
								 required="required">
						</div>
						<div class="form-group">
							<label for="ticketType">Ticket Type</label> <select
								id="ticketType" name="ticketType">
								<option value=" ">None</option>
								<option value="Incident">Incident</option>
								<option value="Change Request">Change Request</option>
								<option value="JIRA">JIRA</option>
							</select>

							<div class ="col text-center">
								<button type="submit">Submit</button>
								<br>
							</div>

						</div>
					</div>
			</div>

		</form>
	</div>
	<script type="text/javascript" src="Bootstrap/js/bootstrap.js"></script>
</body>
</html>