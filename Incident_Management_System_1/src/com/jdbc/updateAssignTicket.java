package com.jdbc;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/updateAssignTicket")
public class updateAssignTicket extends HttpServlet {

	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {

		try {

			String url = "jdbc:mysql://localhost:3306/incident_management";
			String user = "root";
			String pass = "root";

			String ticket_id = req.getParameter("ticket_id");
			String Assign_to = req.getParameter("Assign_to");

			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection(url, user, pass);

			String query3 = "UPDATE assign_ticket SET assigned_to = ?, updated_date = ?, status ='assigned' WHERE ticket_id =?;";
			PreparedStatement ps3 = ((java.sql.Connection) conn).prepareStatement(query3);
			Timestamp timestamp = new Timestamp(System.currentTimeMillis());

			ps3.setString(1, Assign_to);
			ps3.setTimestamp(2, timestamp);
			ps3.setString(3, ticket_id);
			ps3.executeUpdate();
	//		RequestDispatcher rd = req.getRequestDispatcher("admin_Home1.jsp");
	//		rd.forward(req,resp);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
