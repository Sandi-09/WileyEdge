package com.JDBC_Practise;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class demoJdbc {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		String url="jdbc:mysql://localhost:3306/employee";
		String userName="root";
		String password="Sandi@1234";
		//Class.forName("com.mysql.jdbc.driver");
		//Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con =DriverManager.getConnection(url,userName,password);
		System.out.println("the connection has been eastablished");
		Statement stmt=con.createStatement();
		//System.out.println(stmt.execute("select * from employee"));
		ResultSet rs= stmt.executeQuery("select * from employee");
		
		while(rs.next()) {
		System.out.println(rs.getInt(1)+" " +rs.getString(2));
		}
		
//		String insert="insert into employee()"
//		PreparedStatement ps=con.prepareStatement();
	}

}
