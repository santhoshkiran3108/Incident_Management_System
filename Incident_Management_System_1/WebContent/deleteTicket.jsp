<%-- <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
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
<title>Delete Page</title>
</head>
<body>
	<form action="delete" method="post">
	<%
			for (int recordCount = 0; recordCount < table.size(); recordCount++) {
		%>
	
	<%
				ticketDetails td = (ticketDetails) table.get(recordCount);
			%>
		
		<label for="ticket_id">Ticket Id:</label><input type="text" id="ticket_id"
					 name="ticket_id" value=<%=td.getTicketID()%> readonly><br><br>
			<label for=" ticket_name">Ticket Name:</label><input type="text" id="
					ticket_name" name="ticket_name" value=<%=td.getTittle()%> readonly><br><br>
		<label for=" + "ticket_description" + ">Ticket Description:</label><input type="text"
					 id= "ticket_description"name="ticket_description" value=<%=td.getDescription()%> readonly><br><br>
			<label for="ticket_priority" >Ticket Priority:</label><input type= "text" id="
					ticket_priority" name="ticket_priority" value=<%=td.getPriority()%> readonly><br><br>
			<label for= "ticket_type" >Ticket Type:</label><input type=" text" id="ticket_type" name="ticket_type"  value=<%=td.getType()%> readonly><br><br>
			
		<%
			}
		%>	
		
		
				<td><input type="text" id=<%=td.getTicketID()%>
					<%count++; %>
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
</html> --%>