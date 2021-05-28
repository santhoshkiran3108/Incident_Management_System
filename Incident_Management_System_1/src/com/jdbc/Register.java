package com.jdbc;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.sql.Connection;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/reg")
public class Register extends HttpServlet{

	public void doPost(HttpServletRequest req , HttpServletResponse resp) throws IOException, ServletException {
		
		try {
			String url = "jdbc:mysql://localhost:3306/incident_management";
			String user = "root";
			String pass = "root";
			
			String FirstName = req.getParameter("FirstName");
			String LastName = req.getParameter("LastName");
			String email = req.getParameter("email");
			String UserName = req.getParameter("UserName");
			String password = req.getParameter("password");
			
			
			String query = " insert into userinfo(FirstName, LastName, Email, UserName, PassWord)values(?,?,?,?,?)";
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection(url, user, pass);
			PreparedStatement ps = ((java.sql.Connection) conn).prepareStatement(query);
			
			ps.setString(1, FirstName);
			ps.setString(2, LastName);
			ps.setString(3, email);
			ps.setString(4, UserName);
			ps.setString(5, password);
			ps.executeUpdate();
			
			PrintWriter out = resp.getWriter();
			out.println("You Have Successfully Registered !");
			
			RequestDispatcher rd = req.getRequestDispatcher("login.jsp");
			rd.forward(req, resp);
			
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
