package com.Statements;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class dbConnection {

	public static Connection getConnection() throws SQLException, IOException {
		
		//Way 1
//		Properties p=new Properties();
//		p.setProperty("url", "jdbc:mysql://localhost:3306/technocrats");
//		p.setProperty("user","root");
//		p.setProperty("password", "Sandi@1234");
//		//Connection con=DriverManager.getConnection(p.getProperty("url"),p);
		
		//Way2
		System.out.println("Attempting to read from file in: ");
		FileInputStream fis = new FileInputStream("D:\\Eclipse\\WileyEdge\\Day17\\src\\application.properties"); //specify the full path of the properties file;
		Properties p = new Properties();
		p.load(fis);
		
		//Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(p.get("url").toString(), p.getProperty("username"), p.getProperty("password"));
		//Connection con = DriverManager.getConnection(p.get("url").toString(), p);
		System.out.println("Connection Established");
		
		return con;
	}
}
