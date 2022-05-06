package org;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCConnectionTest {

	public static void main(String[] args) {
		
		String url="jdbc:mysql://localhost:3306/lms";
		String uname = "root";
		String pword = "1234";
		
		try {
			Connection con=DriverManager.getConnection(url,uname,pword);
			System.out.println("Connection Created");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
