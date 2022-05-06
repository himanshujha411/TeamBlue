package display;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BookDetails {

	public static void main(String[] args) {

		String url="jdbc:mysql://localhost:3306/lms";
		String uname = "root";
		String pword = "1234";
		
		try {
			Connection con=DriverManager.getConnection(url,uname,pword);
			System.out.println("Connection Created");
			
			String query="select * from books;";    // java code
			// change the java code to SQL statement
			
			Statement stmt=con.createStatement();
			ResultSet rs = stmt.executeQuery(query);  
			// We use ResultSet to store query after execution in a variable
			System.out.println("");
			
			//System.out.println("Book ID:\t Book Name:\t Book Author:\t Book Price:\t Book Status:");
			while(rs.next())
			{
				
				int id = rs.getInt(1);
				String name = rs.getString(2);
				String author = rs.getString(3);
				int price = rs.getInt(4);
				String status = rs.getString(5);
				
				System.out.println("-------------------------");
				System.out.println(" Book ID: "+id+"\n Book Name: "+name+"\n Book Author: "+author+"\n Book Price: "+price+"\n Book Status: "+status);
				//System.out.println(id+"\t "+name+"\t "+author+"\t "+price+"\t "+status);
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
