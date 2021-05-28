<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add New Ticket</title>
<link href="Bootstrap/css/bootstrap.css" rel="stylesheet" type="text/css">
</head>
<body>
<div class="form-popup">
<form action="addTicket" method="post">

	<div class="row">
			
				<div class="col-md-3"></div>
					<div class="col-md-6 col-xs-12">
						<div class="jumbotron">
						
						<h1 class="text-center">Add Ticket Page</h1>
						<br>
						
						<div class="form-group">
							<label class="control-label" for="ticketName"> Ticket Name</label>
							<input type="text" name="ticketName" class="form-control" placeholder="TicketName" required="required">
						</div>
						<div class="form-group">
							<label class="control-label" for="ticketDescription"> Ticket Description</label>
							<input type="text" name="ticketDescription" class="form-control" placeholder="TicketDescription" required="required">
						</div>
						<div class="form-group">
							<label for="ticketPriority">Ticket Priority</label> <select id="ticketPriority" name="ticketPriority">
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
							<label class="control-label" for="username"> User Name</label>
							<input type="text" name="UserName" class="form-control" placeholder="Username" required="required">
						</div>
						<div class="form-group">
							<label for="ticketType">Ticket Type</label> <select id="ticketType" name="ticketType">
								<option value=" ">None</option>
								<option value="Incident">Incident</option>
								<option value="Change Request">Change Request</option>
								<option value="JIRA">JIRA</option>
								</select> 
						
						<div>
							<button type="submit" class="btn btn-outline-warning">Submit</button>
							<br>
						</div>
									
					</div>
				</div>
				<div class="col-md-3"></div>		
			
		</div>
	</div>
	
</form>
</div>
<script type="text/javascript" src="Bootstrap/js/bootstrap.js"></script>
</body>
</html>