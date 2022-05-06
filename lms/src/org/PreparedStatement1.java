package org;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class PreparedStatement1 {

	public static void main(String[] args) {
		
		String url="jdbc:mysql://localhost:3306/sample";
		String uname = "root";
		String pword = "1234";
		
		try {
			Connection con=DriverManager.getConnection(url,uname,pword);
			System.out.println("Connection Created");
			
			//String query="select * from customer";    // java code
			// change the java code to SQL statement
			
			PreparedStatement ps=con.prepareStatement("select id,name from customer where id=? and address=?");
			Scanner sc=new Scanner(System.in);
			System.out.println("enter id");
			int id=sc.nextInt();

			System.out.println("enter adresss");
			String address=sc.next();
			ps.setInt(1, id);
			ps.setString(2, address);
			ResultSet rs=ps.executeQuery();


			while(rs.next()) {
			id=rs.getInt(1);
			String name=rs.getString(2);
			// int age=rs.getInt(3);
			// String address=rs.getString(4);
			System.out.println("Id:"+id+"\n Name:"+name);
			System.out.println("----------");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
