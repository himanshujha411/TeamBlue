package org;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DeleteTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String url="jdbc:mysql://localhost:3306/sample";
		String uname = "root";
		String pword = "1234";
		
		System.out.print("Enter Id: ");
		int id = sc.nextInt();
		
		
		try {
			Connection con=DriverManager.getConnection(url,uname,pword);
			System.out.println("Connection Created");
			System.out.println();
			
			String query="Delete from customer where id ="+id;    // java code
			// change the java code to SQL statement
			
			Statement stmt=con.createStatement();
			stmt.executeUpdate(query);
			System.out.println("Record Deleted");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
