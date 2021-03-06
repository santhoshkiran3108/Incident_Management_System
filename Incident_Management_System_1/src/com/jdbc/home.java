package com.jdbc;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/home")
public class home extends HttpServlet {

	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {

		ArrayList<ticketDetails> td = new ArrayList<ticketDetails>();
		
		try {
			PrintWriter out = resp.getWriter();
			
			String username = req.getParameter("username");
			
			String url = "jdbc:mysql://localhost:3306/incident_management";
			String user = "root";
			String pass = "root";
			String query = "select * from ticket_info where reported_by=?";
			
			Class.forName("com.mysql.cj.jdbc.Driver");
		//	Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection(url, user, pass);
			PreparedStatement ps = ((java.sql.Connection) conn).prepareStatement(query);
			ps.setString(1, username);
			ResultSet rs = ps.executeQuery();
	
			
			while(rs.next()) {
				ticketDetails td1 = new ticketDetails();
				td1.setTicketID(rs.getInt(1));
				td1.setTittle(rs.getString(2));
				td1.setDescription(rs.getString(3));
				td1.setPriority(rs.getString(4));
				td1.setReported_by(rs.getString(5));
				td1.setReported_date(rs.getTimestamp(6));
				td1.setType(rs.getString(7));
				td.add(td1);
			}
			req.setAttribute("table", td);
			RequestDispatcher rd = req.getRequestDispatcher("Home.jsp");
			rd.forward(req,resp);
			

			/*
			 * out.println("<h1 class=\"text-center\">Welcome to Home Page</h1>");
			 * out.println("<a href=" + "addTicket.jsp" +
			 * "><button type=submit>Add ticket</button></a>");
			 * out.println("<html><body><table border=" + "1" +
			 * "><tr><th>Ticket Id</th><th>Title</th><th>Description</th><th>Priority</th>"
			 * + "<th>Reported By</th><th>Reported Date</th></tr>");
			 * 
			 * while (rs.next()) { out.println("<tr><td>" + rs.getString(1) + "</td><td>" +
			 * rs.getString(2) + "</td><td>" + rs.getString(3) + "</td><td>" +
			 * rs.getString(4) + "</td><td>" + rs.getString(5) + "</td><td>" +
			 * rs.getString(6) + "</td></tr>"); }
			 * 
			 * out.println("</table></body></html>");
			 */

		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
