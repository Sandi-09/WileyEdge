package com.JDBC_Practise;

import java.sql.*;
import java.util.Scanner;

public class UserCheck {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/student";
		String username = "root";
		String password = "Sandi@1234";
		// Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, username, password);
		Statement st = con.createStatement();
		System.out.println("Connection Established");

//		st.execute("create table users (id int AUTO_INCREMENT, username varchar(255) NOT NULL,"
//				+ " password varchar(255) NOT NULL, PRIMARY KEY(id))");
//		//st.execute("drop table users");
//		st.executeUpdate("insert into users values ('ramulal','sandi@1234')");
//		ResultSet rs = st.executeQuery("select * from users");
//		while (rs.next()) {
//			System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3));
//		}

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter username and password to log in");
		String u = sc.nextLine();
		String p = sc.nextLine();
		PreparedStatement ps = con.prepareStatement("select username,password from users where username=? and password=?");
		ps.setString(1, u);
		ps.setString(2, p);
		ResultSet rs2 = ps.executeQuery();
//		while (rs2.next()) {
//			System.out.println(rs2.getString(1) + " " + rs2.getString(2));
//		}
//		String userName=rs2.getString(2);
//		String pass=rs2.getString(3);
//		System.out.println(userName+" "+pass);
		// if () {;
		if (!rs2.next()) {
			System.out.println("Username and/or Password is incorrect, " + "do you wish to add a new combination?"
					+ " \nEnter 'Y' for Yes and 'N' for No");
			String k = sc.nextLine();
			if (k.equalsIgnoreCase("Y")) {
				System.out.println("You opted for Yes, now adding your combination");
				PreparedStatement ps2 = con.prepareStatement("insert into users(username,password) values (?,?)");
				ps2.setString(1, u);
				ps2.setString(2, p);
				int i = ps2.executeUpdate();
				System.out.println(i + " rows added");
				ps2.close();
			} else {
				System.out.println("You opted for No, now exiting program");
			}
		} else {
			System.out.println("Welcome " + u + " you have successfully logged in");
		}
		ResultSet rs3 = st.executeQuery("select * from users");
		while (rs3.next()) {
			System.out.println(rs3.getString(2));
		}

//		rs2.close();
//		ps.close();
//		st.close();
		// con.close();
	}
}
