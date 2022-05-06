package display;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class IssuedBooksList {

	public static void main(String[] args) {

		String url="jdbc:mysql://localhost:3306/lms";
		String uname = "root";
		String pword = "1234";
		
		try {
			Connection con=DriverManager.getConnection(url,uname,pword);
			System.out.println("Connection Created");
			
			String query="select * from issued_books;";    // java code
			// change the java code to SQL statement

			Statement stmt=con.createStatement();
			ResultSet rs = stmt.executeQuery(query);  
			// We use ResultSet to store query after execution in a variable
			System.out.println();
			
			while(rs.next())
			{
				
				int iid = rs.getInt(1);
				int uid = rs.getInt(2);
				int bid = rs.getInt(3);
				System.out.println("**********************");
				String date = rs.getString(4);
				int period = rs.getInt(5);
				
				System.out.println("-------------------------");
				System.out.println(" Issue Id: "+iid+"\n Book ID: "+bid+"\n User ID: "+uid+"\n Date of Issue: "+date+"\n Period: "+period+" Days");
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
