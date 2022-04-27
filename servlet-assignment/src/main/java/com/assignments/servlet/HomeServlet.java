package com.assignments.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HomeServlet
 */
//@WebServlet("/HomeServlet")
@WebServlet("/home")
public class HomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public HomeServlet() {
		super();
	}

	String name = null;

	public void init() {
		name = "Jacob";
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		RequestDispatcher rd;
		UserProfile user = new UserProfile();
		try {
			System.out.println("Inside doGet Method");

			String userName = request.getParameter("uname");

			String password = request.getParameter("pwd");
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

			String url = "jdbc:sqlserver://localhost:1433;" + "databaseName=Login_Form;"
					+ "encrypt=true;trustServerCertificate=true";

			String db_user = "sa";

			String db_password = "jesus";

			Connection con = DriverManager.getConnection(url, db_user, db_password);

			String query = "select Email_Id,Date_of_Birth,Contact,Address  from User_Login_Details WHERE UserName=? and Password=?";

			PreparedStatement preparedStmt = con.prepareStatement(query);

			preparedStmt.setString(1, userName);
			preparedStmt.setString(2, password);
			
			ResultSet resultSet = preparedStmt.executeQuery();

			boolean loginSuccess = false;
			while (resultSet.next()) 
			{
				loginSuccess = true;
				user = new UserProfile();
				user.setAddress(resultSet.getString("Address"));
				user.setEmail(resultSet.getString("Email_Id"));
				user.setContact(resultSet.getString("Contact"));
				user.setDateOfBirth(resultSet.getDate("Date_of_Birth"));
				user.setUsername(userName);
				
				System.out.println("Logged in user email :" + resultSet.getString("Email_Id"));
			}
			if (loginSuccess) 
			{
				request.setAttribute("user", user);
				rd = request.getRequestDispatcher("success.jsp");
			} else 
			{
				request.setAttribute("userName", userName);
				rd = request.getRequestDispatcher("invalidlogin.jsp");
			}

			request.setAttribute("userName", userName);

			rd.forward(request, response);
		} catch (Exception ex) 
		{
			ex.printStackTrace();
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
