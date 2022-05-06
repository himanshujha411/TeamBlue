package org;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class UpdateTest {

	public static void main(String[] args) {
		
Scanner sc = new Scanner(System.in);
		
		String url="jdbc:mysql://localhost:3306/sample";
		String uname = "root";
		String pword = "1234";
		
		System.out.print("Enter Id: ");
		int id = sc.nextInt();
		
		System.out.print("Enter Address: ");
		String address = sc.next();
		
		try {
			Connection con=DriverManager.getConnection(url,uname,pword);
			System.out.println("Connection Created");
			System.out.println();
			
			String query="update customer set address='"+address+"' where id ="+id;    // java code
			// change the java code to SQL statement
			
			Statement stmt=con.createStatement();
			stmt.executeUpdate(query);
			System.out.println("Record Updated");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
