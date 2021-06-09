package com.jdbc;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/resolveTicket")
public class resolveTicket extends HttpServlet {

	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {

		ArrayList<ticketDetails> td = new ArrayList<ticketDetails>();
		try {
			PrintWriter out = resp.getWriter();
			
			String ticket_id = req.getParameter("row_id");
			
			String url = "jdbc:mysql://localhost:3306/incident_management";
			String user = "root";
			String pass = "root";
			String query = "UPDATE assign_ticket SET updated_date = ?, status ='resolved' WHERE ticket_id =?;";
			
			Class.forName("com.mysql.cj.jdbc.Driver");
		//	Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection(url, user, pass);
			PreparedStatement ps = ((java.sql.Connection) conn).prepareStatement(query);
			Timestamp timestamp = new Timestamp(System.currentTimeMillis());
			ps.setTimestamp(1, timestamp);
			ps.setString(2, ticket_id);
			ps.executeUpdate();
			
			out.println("<html><body><form action="+"employeeHome"+" method="+"post"+"><h1>"+"Ticket Status Changed"+"</h1><a href="+"employeeHome"+"><Button name="+"submit"+" value="+"submit"+">Back</Button></a></form></body></html>");
		//	RequestDispatcher rd = req.getRequestDispatcher("employeeHome.jsp");
		//	rd.forward(req,resp);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
