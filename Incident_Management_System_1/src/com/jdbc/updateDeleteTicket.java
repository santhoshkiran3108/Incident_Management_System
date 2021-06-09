package com.jdbc;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/deleteTicket")
public class updateDeleteTicket extends HttpServlet{
	
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {

		try {

			String url = "jdbc:mysql://localhost:3306/incident_management";
			String user = "root";
			String pass = "root";

			String ticket_id = req.getParameter("ticket_id");
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection(url, user, pass);

			String query3 = "call Delete_Ticket(?)";
			PreparedStatement ps3 = ((java.sql.Connection) conn).prepareStatement(query3);
						
			ps3.setString(1, ticket_id);
			ps3.executeUpdate();
	//		RequestDispatcher rd= req.getRequestDispatcher("Home.jsp");
	//		rd.forward(req, resp);
			PrintWriter out = resp.getWriter();
			out.println("Ticket Deleted!");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}


}
