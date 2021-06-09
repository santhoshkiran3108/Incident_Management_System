/*
 * package com.jdbc;
 * 
 * import java.io.IOException; import java.io.PrintWriter; import java.sql.*;
 * 
 * import javax.servlet.RequestDispatcher; import
 * javax.servlet.ServletException; import javax.servlet.annotation.WebServlet;
 * import javax.servlet.http.HttpServlet; import
 * javax.servlet.http.HttpServletRequest; import
 * javax.servlet.http.HttpServletResponse;
 * 
 * @WebServlet("/deleteticket") public class deleteticket extends HttpServlet {
 * 
 * public void doPost(HttpServletRequest req, HttpServletResponse resp) throws
 * IOException, ServletException {
 * 
 * try { String url = "jdbc:mysql://localhost:3306/incident_management"; String
 * user = "root"; String pass = "root";
 * 
 * String ticketId = req.getParameter("ticketId");
 * 
 * String query = "call delete_ticket(?)";
 * 
 * Class.forName("com.mysql.cj.jdbc.Driver"); Connection conn =
 * DriverManager.getConnection(url, user, pass); PreparedStatement ps =
 * ((java.sql.Connection) conn).prepareStatement(query);
 * 
 * ps.setString(1, ticketId); PrintWriter out = resp.getWriter();
 * out.println("You Have Successfully Deleted !");
 * 
 * RequestDispatcher rd = req.getRequestDispatcher("Home.jsp"); rd.forward(req,
 * resp);
 * 
 * } catch (ClassNotFoundException e) { // TODO Auto-generated catch block
 * e.printStackTrace(); } catch (SQLException e) { // TODO Auto-generated catch
 * block e.printStackTrace(); }
 * 
 * }
 * 
 * }
 */

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

@WebServlet("/delete")
public class deleteticket extends HttpServlet {

	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {

		try {

			String url = "jdbc:mysql://localhost:3306/incident_management";
			String user = "root";
			String pass = "root";

			String ticketid = req.getParameter("row_id");

			String query = "select * from ticket_info where ticket_id =? ";

			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection(url, user, pass);
			PreparedStatement ps = ((java.sql.Connection) conn).prepareStatement(query);
			ps.setString(1, ticketid);
			ResultSet rs = ps.executeQuery();
			PrintWriter out = resp.getWriter();
			rs.next();
				out.println("<html><body><form action=" + "deleteTicket" + " method=" + "post" + ">");
				out.println("<label for=" + "ticket_id" + ">Ticket Id:</label><input type=" + "text" + " id="
						+ "ticket_id" + " name=" + "ticket_id" + " value=" + rs.getString(1) + " readonly><br><br>");
				out.println("<label for=" + "ticket_name" + ">Ticket Name:</label><input type=" + "text" + " id="
						+ "ticket_name" + " name=" + "ticket_name" + " value=" + rs.getString(2)
						+ " readonly><br><br>");
				out.println("<label for=" + "ticket_description" + ">Ticket Description:</label><input type=" + "text"
						+ " id=" + "ticket_description" + " name=" + "ticket_description" + " value=" + rs.getString(3)
						+ " readonly><br><br>");
				out.println("<label for=" + "ticket_priority" + ">Ticket Priority:</label><input type=" + "text"
						+ " id=" + "ticket_priority" + " name=" + "ticket_priority" + " value=" + rs.getString(4)
						+ " readonly><br><br>");
				out.println("<label for=" + "ticket_type" + ">Ticket Type:</label><input type=" + "text" + " id="
						+ "ticket_type" + " name=" + "ticket_type" + " value=" + rs.getString(7)
						+ " readonly><br><br>");

				out.println("<br><br><input type=" + "submit" + " value=" + "Submit" + ">");
				out.println("</form></body></html>");


		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}