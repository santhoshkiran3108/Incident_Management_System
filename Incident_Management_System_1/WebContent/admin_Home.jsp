<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.jdbc.ticketDetails"%>
<%
	ArrayList table = (ArrayList) request.getAttribute("table");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Assign Ticket</title>
<link href="css/style.css" rel="stylesheet" type="text/css">
<link href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.1.3/css/bootstrap.min.css" rel="stylesheet" />

<script type="text/javascript">
    function setValuesAndSubmit(row_id){
    document.getElementById('row_id').value=row_id;
  	alert(document.getElementById('row_id').value);
	document.forms[0].submit();
}
    </script>
</head>
<body>
	<form action="assignTicket" method="post">
		<input type="hidden" id="row_id" name="row_id" />
		<table border=1>
			<thead>
				<tr>
					<th>Ticket Id</th>
					<th>Ticket Name</th>
					<th>Ticket Description</th>
					<th>Ticket Priority</th>
					<th>Ticket Type</th>
					<th>Reported By</th>
					<th>Reported Date</th>
					<th>Assign Ticket</th>
				</tr>
			</thead>
			<%-- <%int count=0; %> --%>
			<%
				for (int recordCount = 0; recordCount < table.size(); recordCount++) {
			%>
			<tr>
				<%
					ticketDetails td = (ticketDetails) table.get(recordCount);
				%>
				<td><input type="text" id=<%=td.getTicketID()%>
					<%-- <%count++; %> --%>
					name="ticketid"
					value=<%=td.getTicketID()%> readonly></td>
				<td><%=td.getTittle()%></td>
				<td><%=td.getDescription()%></td>
				<td><%=td.getPriority()%></td>
				<td><%=td.getType()%></td>
				<td><%=td.getReported_by()%></td>
				<td><%=td.getReported_date()%></td>
				<td><button type="submit"
						onclick="setValuesAndSubmit(<%=td.getTicketID()%>);">Assign
						ticket</button></td>
			</tr>
			<%
				}
			%>
			<tr>
				<td></td>
			</tr>
		</table>
	</form>
</body>
</html>