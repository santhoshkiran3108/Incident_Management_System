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

@WebServlet("/home")
public class home extends HttpServlet {

public void doPost(HttpServletRequest req , HttpServletResponse resp) throws IOException, ServletException {
		
		try {
			PrintWriter out = resp.getWriter();
			
			String url = "jdbc:mysql://localhost:3306/incident_management";
			String user = "root";
			String pass = "root";
			String query = "select * from ticket_info";
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection(url, user, pass);
			PreparedStatement ps = ((java.sql.Connection) conn).prepareStatement(query);
			ResultSet rs = ps.executeQuery();
			
			out.println("<h1 class=\"text-center\">Welcome to Home Page</h1>");
			out.println("<a href="+"addTicket.jsp"+"><button type=submit>Add ticket</button></a>");
			out.println("<html><body><table style="+"width:100%"+"><tr><th>Ticket Id</th><th>Tittle</th><th>Description</th><th>Priority</th>"
					+ "<th>Reported By</th><th>Reported Date</th></tr>");
			
			while(rs.next()) {
				out.println("<tr><td>"+rs.getString(1)+"</td><td>"+rs.getString(2)+"</td><td>"+rs.getString(3)+"</td><td>"+rs.getString(4)+"</td><td>"+rs.getString(5)+"</td><td>"+rs.getString(6)+"</td></tr>");
			}
			
			out.println("</table></body></html>");
			
		}	catch (Exception e) {
				// TODO: handle exception
			}
	}
}
