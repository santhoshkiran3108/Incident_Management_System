package com.jdbc;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/adminHome")
public class adminHome extends HttpServlet {

	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {

		try {
			PrintWriter out = resp.getWriter();

			String url = "jdbc:mysql://localhost:3306/incident_management";
			String user = "root";
			String pass = "root";
			String query = "select * from admin_ticket_info";

			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection(url, user, pass);
			PreparedStatement ps = ((java.sql.Connection) conn).prepareStatement(query);
			ResultSet rs = ps.executeQuery();

			out.println("<h1 class=\"text-center\">Welcome to Home Page</h1>");
			// out.println("<a href="+"addTicket.jsp"+"><button type=submit>Add
			// ticket</button></a>");
			out.println("<html><body>"
					+ "<form action=\"assignTicket\" method=\" post\"><table border= 1"
					+ "><tr><th>Ticket Id</th><th>Title</th><th>Description</th><th>Priority</th><th>Ticket Type</th>"
					+ "<th>Reported By</th><th>Reported Date</th><th>Assign Ticket</th></tr>");

			while (rs.next()) {
				out.println("<tr><td><input type=\"text\"  id=\" ticketid \" name=\"ticketid\" value="
						+ rs.getString(1) + " readonly></td><td>" + rs.getString(2) + "</td><td>" + rs.getString(3)
						+ "</td><td>" + rs.getString(4) + "</td><td>" + rs.getString(5) + "</td><td>" + rs.getString(6)
						+ "</td><td>" + rs.getString(7) + "</td><td><button type=\" submit\">Assign ticket</button></td></tr>");
			}

			out.println("</table></form></body></html>");

		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
