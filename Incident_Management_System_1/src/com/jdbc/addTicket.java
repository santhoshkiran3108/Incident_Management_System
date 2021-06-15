package com.jdbc;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/addTicket")
public class addTicket extends HttpServlet {

	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {

		try {
			String url = "jdbc:mysql://localhost:3306/incident_management";
			String user = "root";
			String pass = "root";

			String ticketName = req.getParameter("ticketName");
			String ticketDescription = req.getParameter("ticketDescription");
			String ticketPriority = req.getParameter("ticketPriority");
			String UserName = req.getParameter("UserName");
			String ticketType = req.getParameter("ticketType");

			String query1 = "select max(ticket_id) from ticket_info";

			String query = " insert into ticket_info(ticket_id, ticket_name, ticket_description, ticket_priority, reported_by, reg_date, ticket_type, status)values(?,?,?,?,?,?,?,?)";

			// Class.forName("com.mysql.jdbc.Driver");
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection(url, user, pass);
			PreparedStatement ps1 = ((java.sql.Connection) conn).prepareStatement(query1);
			ResultSet rs = ps1.executeQuery();
			rs.next();
			int ticket_no = rs.getInt(1);
			PreparedStatement ps = ((java.sql.Connection) conn).prepareStatement(query);

			// java.sql.Timestamp ourJavaTimestampObject = new
			// java.sql.Timestamp(calendar.getTime().getTime());
			Timestamp timestamp = new Timestamp(System.currentTimeMillis());
			ps.setLong(1, (ticket_no + 1));
			ps.setString(2, ticketName);
			ps.setString(3, ticketDescription);
			ps.setString(4, ticketPriority);
			ps.setString(5, UserName);
			ps.setTimestamp(6, timestamp);
			ps.setString(7, ticketType);
			ps.setString(8, " ");
			ps.executeUpdate();

			PrintWriter out = resp.getWriter();
			// out.println("<html><body><a href="+"Home.jsp"+">Back</a></body></html>");
			out.println("You Have Successfully Registered !");

			// RequestDispatcher rd = req.getRequestDispatcher("Home.jsp");
			// rd.forward(req, resp);

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
