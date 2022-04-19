package com.training.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcTest {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		
		//String url = "jdbc:sqlserver://localhost:\\mars_new";
		
		String url = "jdbc:sqlserver://localhost:1433;"+
		"databaseName=mars_new;" +
		"encrypt=true;trustServerCertificate=true";
		
		String user = "sa";
		
		String password = "jesus";
		
		Connection con = DriverManager.getConnection(url, user, password);
		
		String query = "select * from product";
		
		Statement stmt = con.createStatement();
		
		ResultSet rs = stmt.executeQuery(query);
		
		while(rs.next()) 
		{
			System.out.println("Prod_name:"+rs.getString("prod_name"));
			System.out.println("Prod_desc:"+rs.getString("prod_desc"));
			System.out.println("Prod_pric:"+rs.getDouble("price"));
		}
		
		/*if(con != null)
		{
			System.out.println("Connection Established Sucessfully");
		}
		else
		{
			System.out.println("Connection Refused");
		}*/
		

	}

}
