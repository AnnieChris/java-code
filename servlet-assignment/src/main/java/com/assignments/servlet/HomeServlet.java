package com.assignments.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
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

		try {
		System.out.println("Inside doGet Method");

		String userName = request.getParameter("uname");

		String password = request.getParameter("pwd");
Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		
		//String url = "jdbc:sqlserver://localhost:\\mars_new";
		
		String url = "jdbc:sqlserver://localhost:1433;"+
		"databaseName=mars_new;" +
		"encrypt=true;trustServerCertificate=true";
		
		//String user = "sa";
		
		//String password = "jesus";
		
		Connection con = DriverManager.getConnection(url, userName, password);
		
		String query = "select * from product";
		
		Statement stmt = con.createStatement();
		
		ResultSet rs = stmt.executeQuery(query);
		
		while(rs.next()) 
		{
			System.out.println("Prod_name:"+rs.getString("prod_name"));
			System.out.println("Prod_desc:"+rs.getString("prod_desc"));
			System.out.println("Prod_pric:"+rs.getDouble("price"));
		}
		

		request.setAttribute("userName", userName);

		RequestDispatcher rd = request.getRequestDispatcher("index.jsp");

		rd.forward(request, response);
		}
		catch(Exception ex) {
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
