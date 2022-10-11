package com.Statements;

import java.io.IOException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StoredProcedures {

	public static void main(String[] args) throws SQLException, IOException {
		// TODO Auto-generated method stub
		Connection con=dbConnection.getConnection();
		
		// to retreive all the customers from the table
		CallableStatement stmt=con.prepareCall("{call getAllCustomerDetails()}");
		ResultSet rs=stmt.executeQuery();
		while(rs.next()) {
			System.out.println(rs.getString(1)+" "+rs.getString(2));
		}
		
		//to set the parameter of the user IN parameter
		System.out.println("the in paramater uses start here ........................");
		CallableStatement stmt1=con.prepareCall("{call getAllCustomerDetailsByName(?)}");
		stmt1.setString(1,"Udaya");
		ResultSet rs1=stmt1.executeQuery();
		while(rs1.next()) {
			System.out.println(rs1.getString(1)+" "+rs1.getString(2));
		}
		System.out.println();
		System.out.println("the multiple in paramater uses start here ........................");
		CallableStatement stmt2=con.prepareCall("{call getAllCustomerDetailsByName2(?,?)}");
		stmt2.setString(1,"Udaya");
		stmt2.setString(2, "kolkata");
		ResultSet rs2=stmt2.executeQuery();
		while(rs2.next()) {
			System.out.println(rs2.getString(1)+" "+rs2.getString(2));
		}
		System.out.println();
		//inout stored procedure
		System.out.println("the multiple in-out paramater uses start here ........................");
		CallableStatement stmt3=con.prepareCall("{call getCounter(?,?)}");
		
		stmt3.registerOutParameter(1, java.sql.Types.INTEGER);
		stmt3.setInt(2,5);
		stmt3.setInt(2,3);
		stmt3.executeUpdate();
		System.out.println(stmt3.getInt(1));
		System.out.println();
		
		//out parameter
		
		
System.out.println("the out paramater uses start here ........................");		
CallableStatement stmt4=con.prepareCall("{call getCustomerByCity(?,?,?)}");
		stmt4.setString(1,"kolkata");
		stmt4.registerOutParameter(2, java.sql.Types.INTEGER);
		stmt4.registerOutParameter(3, java.sql.Types.INTEGER);
		stmt4.executeUpdate();
		System.out.println(stmt4.getInt(2)+" "+stmt4.getString(3));
	}

	
	
}
