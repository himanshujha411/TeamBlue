package org;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertTest {

	public static void main(String[] args) {

		String url="jdbc:mysql://localhost:3306/sample";
		String uname = "root";
		String pword = "1234";
		
		try {
			Connection con=DriverManager.getConnection(url,uname,pword);
			System.out.println("Connection Created");
			
			String query="insert into customer values(1004,'Krishna',23,'UP');";    // java code
			// change the java code to SQL statement
			
			Statement stmt=con.createStatement();
			stmt.executeUpdate(query);
			System.out.println("Record Inserted");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
