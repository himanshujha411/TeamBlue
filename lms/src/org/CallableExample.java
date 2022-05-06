package org;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class CallableExample {
	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/sample";
		String uname="root";
		String pword="1234";
		try {
			Connection con=DriverManager.getConnection(url,uname,pword);
			System.out.println("Connection created");
			CallableStatement cs=con.prepareCall("{CALL addRecord()}");
			cs.execute();
			System.out.println("Procedure executed successfully");
			CallableStatement cs1=con.prepareCall("{CALL addRecordWithPlaceHolders(?,?,?,?)}");
			cs1.setInt(1,1010);
			cs1.setString(2, "Arun");
			cs1.setInt(3, 33);
			cs1.setString(4,  "Lko");
			cs1.execute();
			System.out.println("Procedure 2 executed successfully");
			
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}