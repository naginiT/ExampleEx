package crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.HashSet;
import java.util.Scanner;

import org.testng.annotations.Test;

public class AdminAprove
{

	public static void admin() 
	{
	       try
	       {
	    	   System.out.println(":::::::::WELCOME TO ADMIN LOGIN WORLD:::::::::::");
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
            	   Class.forName("oracle.jdbc.driver.OracleDriver");
    	   		   Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","Nandan","Nandan");
    	   	    	PreparedStatement psmt=con.prepareStatement("select * from Approve where status='inactive'");
    	        	 ResultSet rst=psmt.executeQuery();
    	        	 HashSet<String> hs = new HashSet<>();
    	        	 System.out.println("List of the users:::");
    	        	
    	        	 while(rst.next())
    	 	           {
    	        		 hs.add(rst.getString("username"));
    	 				 System.out.println(rst.getString("username")+"    "+rst.getString("email")+"     "+rst.getInt("mobile"));
    	 			  }
    	        	 System.out.println("enter the username to approve");
    	        	 String name=sc.next();
    	        	
    	        
    	        	 if(hs.contains(name))
    	        	 {
    	        	 Class.forName("oracle.jdbc.driver.OracleDriver");
      	   		    Connection con1=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","Nandan","Nandan");
      	   	    	PreparedStatement psmt1=con1.prepareStatement("update Approve set status='active' where username=?");
      	   	    	psmt1.setString(1, name);
      	   	    	int i = psmt1.executeUpdate();
      	   	    	if(i==1)
      	   	    	{
      	   	    		System.out.println("approved successfully");
      	   	    	}
      	   	    	else
      	   	    	{
      	   	    		System.out.println("approval failed");
      	   	    	}
    	        	 }
            	   
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
	public static void main(String[] args) {
		admin();
	}
}


