package display;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class IssueNewBook {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		String url="jdbc:mysql://localhost:3306/lms";
		String uname = "root";
		String pword = "1234";
		
		int bid=0;
		String name="";
		String stat="";
		
		Date date = new Date();
	    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yy");
	    String str = formatter.format(date);

	
		try {
			
			Connection con=DriverManager.getConnection(url,uname,pword);
			System.out.println("Connection Created");
			System.out.println();
			
			// Selecting book from book ID
			PreparedStatement ps=con.prepareStatement("select bid,book_name,book_status from books where bid=? and book_status='Not Issued';");
			System.out.print("Enter Book Id: ");
			bid=sc.nextInt();
			
			ps.setInt(1, bid);
			ResultSet rs=ps.executeQuery();
			
			while(rs.next()) 
			{
				bid=rs.getInt(1);
				name=rs.getString(2);
				stat=rs.getString(3);
			}
			
			
				PreparedStatement ps1=con.prepareStatement("select uid from users where uid=?;");
				System.out.print("Enter User Id: ");
				int uid=sc.nextInt();
				
				ps1.setInt(1, uid);
				ResultSet rs1=ps1.executeQuery();
				
				while(rs1.next()) 
				{
					uid=rs1.getInt(1);
				}
				
				System.out.print("Enter Issue Id: ");
				int iid=sc.nextInt();
				
				System.out.print("Enter Period: ");
				int period = sc.nextInt();
				
				String query="insert into issued_books values("+iid+","+uid+","+bid+",'"+name+"','"+(String)str+"','"+period+"');";    // java code
				// change the java code to SQL statement
				
				
				// Inserting element
				Statement stmt=con.createStatement();
				stmt.executeUpdate(query);
				System.out.println("Book "+name+" issued for "+period+" days");
				
				
				// Changing the status of book entry to issued in books table
				String query2="update books set book_status='Issued' where bid ="+bid;    
				Statement stmt2=con.createStatement();
				stmt.executeUpdate(query2);
			
				//System.out.println("Book not available! ");
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
