package com.jdbc;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/assignTicket")
public class assignTicket extends HttpServlet {

	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {

		try {

			String url = "jdbc:mysql://localhost:3306/incident_management";
			String user = "root";
			String pass = "root";

			String ticketid = req.getParameter("row_id");

			String query1 = "select username from userinfo";

			String query2 = "select * from admin_ticket_info where ticket_id =? ";

			// String query = " insert into ticket_info(ticket_id, ticket_name,
			// ticket_description, ticket_priority, reported_by,
			// reg_date,ticket_type)values(?,?,?,?,?,?,?)";

			// Class.forName("com.mysql.jdbc.Driver");
			List<String> dropdown = new ArrayList<String>();
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection(url, user, pass);
			PreparedStatement ps1 = ((java.sql.Connection) conn).prepareStatement(query1);
			PreparedStatement ps2 = ((java.sql.Connection) conn).prepareStatement(query2);
			ps2.setString(1, ticketid);
			ResultSet rs = ps1.executeQuery();
			ResultSet rs1 = ps2.executeQuery();
			rs1.next();
			PrintWriter out = resp.getWriter();
			out.println("<html><body><form action=" + "updateAssignTicket" + " method=" + "post" + ">");
			out.println("<label for=" + "ticket_id" + ">Ticket Id:</label><input type=" + "text" + " id=" + "ticket_id"
					+ " name=" + "ticket_id" + " value=" + rs1.getString(1) + " readonly><br><br>");
			out.println("<label for=" + "ticket_name" + ">Ticket Name:</label><input type=" + "text" + " id="
					+ "ticket_name" + " name=" + "ticket_name" + " value=" + rs1.getString(2) + " readonly><br><br>");
			out.println("<label for=" + "ticket_description" + ">Ticket Description:</label><input type=" + "text"
					+ " id=" + "ticket_description" + " name=" + "ticket_description" + " value=" + rs1.getString(3)
					+ " readonly><br><br>");
			out.println("<label for=" + "ticket_priority" + ">Ticket Priority:</label><input type=" + "text" + " id="
					+ "ticket_priority" + " name=" + "ticket_priority" + " value=" + rs1.getString(4)
					+ " readonly><br><br>");
			out.println("<label for=" + "ticket_type" + ">Ticket Type:</label><input type=" + "text" + " id="
					+ "ticket_type" + " name=" + "ticket_type" + " value=" + rs1.getString(5) + " readonly><br><br>");

			out.println("<label for=" + "Assign_to" + ">Assign To</label> <select id=" + "Assign_to" + " name="
					+ "Assign_to" + ">");
			while (rs.next()) {
				out.println("<option value=" + rs.getString(1) + ">" + rs.getString(1) + "</option>");
			}
			// out.println("<label for="+"country"+">Country:</label><input type="+"text"+"
			// id="+"country"+" name="+"country"+" value="+"Norway"+" readonly>");
			out.println("<br><br><input type=" + "submit" + " value=" + "Submit" + ">");
			out.println("</form></body></html>");

			/*
			 * String query3 =
			 * "UPDATE assign_ticket SET assigned_to = ?, updated_date = ? WHERE ticket_id =?;"
			 * ; PreparedStatement ps3 = ((java.sql.Connection)
			 * conn).prepareStatement(query3); Timestamp timestamp = new
			 * Timestamp(System.currentTimeMillis()); String Assign_to =
			 * req.getParameter("Assign_to"); ps3.setString(1, Assign_to);
			 * ps3.setTimestamp(2, timestamp); ps3.setString(3, ticketid); ResultSet rs2 =
			 * ps3.executeUpdate()();
			 */

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
