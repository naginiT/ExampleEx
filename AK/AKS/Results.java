package crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.HashSet;
import java.util.Scanner;

import org.testng.annotations.Test;

public class Results
{
	@Test
	public static void admin() 
	{
	       try
	       {
	    	   System.out.println(":::::::::WELCOME TO ADMIN WORLD:::::::::::");
	    	   Scanner sc=new Scanner(System.in);
	    	   System.out.println("Enter the UserName::::::");
	    	   String username=sc.next();
	    	   System.out.println("Enter the PassWord:::::::");
	    	   String password=sc.next();
	    	   Class.forName("oracle.jdbc.driver.OracleDriver");
	   		   Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","Nandan","Nandan");
	   		PreparedStatement pstmt=conn.prepareStatement("select * from ADMIN");
	        ResultSet rs=pstmt.executeQuery();
	        String us="";
	        String pw ="";
	        while(rs.next())
	        {
				us =rs.getString("username");
				pw=rs.getString("password");
			}
               if(username.equals(us)&&password.equals(pw))
               {
            	   System.out.println("Admin loggined sucessfully");
            	   User.marks();
	           }
               else 
	           {
            	   System.out.println("Admin loggin was unsucessfull");
	           }
	           }catch(Exception e)
	           {
	           	System.out.println(e);
	           }
	}
}

