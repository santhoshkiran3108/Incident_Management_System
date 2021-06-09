package com.jdbc;

import java.io.IOException;
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

@WebServlet("/employeeHome")
public class employeeHome extends HttpServlet {

	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {

		ArrayList<ticketDetails> td = new ArrayList<ticketDetails>();
		try {
		//	PrintWriter out = resp.getWriter();
			
			String username = req.getParameter("username");
			
			String url = "jdbc:mysql://localhost:3306/incident_management";
			String user = "root";
			String pass = "root";
			String query = "select * from admin_ticket_info where assigned_to=?";
			
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
				td1.setType(rs.getString(5));
				td1.setReported_by(rs.getString(6));
				td1.setReported_date(rs.getTimestamp(7));
				td1.setStatus(rs.getString(10));
				td.add(td1);
			}
			req.setAttribute("table", td);
			RequestDispatcher rd = req.getRequestDispatcher("employeeHome.jsp");
			rd.forward(req,resp);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
