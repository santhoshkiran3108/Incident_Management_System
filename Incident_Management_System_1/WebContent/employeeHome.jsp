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
<title>Insert title here</title>
<script type="text/javascript">
    function setValuesAndSubmit(row_id){
    document.getElementById('row_id').value=row_id;
  	alert(document.getElementById('row_id').value);
	document.forms[0].submit();
}
    </script>
</head>
<body>
	<form action="resolveTicket" method="post">
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
					<th>Status</th>
					<th>Resolve</th>
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
				<td><%=td.getStatus()%></td>
				<% if(td.getStatus().equalsIgnoreCase("Resolved")){ %>
				<td><button type="submit" disabled>Resolve Ticket</button></td>
				<%} else{ %>
				<td><button type="submit"
						onclick="setValuesAndSubmit(<%=td.getTicketID()%>);">Resolve
						ticket</button></td>	
				<%} %>			
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