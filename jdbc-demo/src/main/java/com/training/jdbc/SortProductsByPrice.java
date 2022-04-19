package com.training.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortProductsByPrice {

	public static void main(String[] args) throws Exception {
		
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		
		String url = "jdbc:sqlserver://localhost:1433;"+
		"databaseName=mars_new;" +
		"encrypt=true;trustServerCertificate=true";
		
		String user = "sa";
		
		String password = "jesus";
		List<Product> products = new ArrayList<Product>();
		
		Connection con = DriverManager.getConnection(url, user, password);
		
		String query = "select * from product";
		
		Statement stmt = con.createStatement();
		
		ResultSet rs = stmt.executeQuery(query);
		
		while(rs.next()) 
		{
			Product product = new Product();
			product.setName(rs.getString("prod_name"));
			product.setDesc(rs.getString("prod_desc"));
			product.setPrice(rs.getDouble("price"));
			products.add(product);
		}
		Collections.sort(products);

		System.out.println("Sorted Products by price");
		for(Product product:products) {
			System.out.println(product.getName() + " - "+product.getPrice());
		}

	}

}

class Product implements Comparable<Product>{
	String name;
	String desc;
	Double price;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public int compareTo(Product product)
    {
        return price.compareTo(product.price);
    }
	
}
