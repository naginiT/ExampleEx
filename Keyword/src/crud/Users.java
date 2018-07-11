package crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import org.testng.annotations.Test;

public class Users 
{
	@Test
	public static void app()
	{
	try{
 	   Scanner sc=new Scanner(System.in);
 	   System.out.println("Enter the username");
 	   String username=sc.next();
 	   System.out.println("Enter the password");
 	   String password=sc.next();
 	   System.out.println("Enter the email");
 	   String email=sc.next();
 	   System.out.println("Enter the mobile");
 	   int mobile=sc.nextInt();
 	   Class.forName("oracle.jdbc.driver.OracleDriver");
 	   Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","Nandan","Nandan");
 	   PreparedStatement pstmt=conn.prepareStatement("insert into Approve (username,password,email,mobile,status) values (?,?,?,?,'inactive')");
 	   pstmt.setString(1, username);
 	   pstmt.setString(2, password);
 	   pstmt.setString(3, email);
	   pstmt.setInt(4, mobile);
 	   int i=pstmt.executeUpdate();
 	  if(i==1)
	   {
		   System.out.println("User registration was Success");
	   }else{
		   System.out.println("User registration was UnSuccessfull");
	   }
 	   }catch(Exception e)
	{
	   System.out.println(e);
     }
}

  public static void userfetch()
  {
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","Nandan","Nandan");
			PreparedStatement pstmt=conn.prepareStatement("select * from Approve");
			ResultSet rs=pstmt.executeQuery();
			while(rs.next())
			{
				System.out.println(rs.getString("username"));
				System.out.println(rs.getString("password"));
				System.out.println(rs.getString("email"));
				System.out.println(rs.getInt("mobile"));
				
		   }
			
		}catch(Exception e){
			System.out.println(e);
		}
  
	  
  }

}