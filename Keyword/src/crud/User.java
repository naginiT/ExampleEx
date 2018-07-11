package crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import org.testng.annotations.Test;

public class User 
{
	
	@Test
	
	public static void marks() 
	{
	       try{
	    	   Scanner sc=new Scanner(System.in);
	    	   System.out.println("Enter the UserName::::::");
	    	   String username=sc.next();
	    	   System.out.println("Enter the PassWord:::::::");
	    	   String password=sc.next();
	    	   System.out.println("Enter M1 Marks::::::::::::::");
	    	   int M1=sc.nextInt();
	    	   System.out.println("Enter M2 Marks::::::::::::::::::::");
	    	   int M2=sc.nextInt();
	    	   System.out.println("Enter PHYSICS Marks::::::::::::::");
	    	   int PHYSICS=sc.nextInt();
	    	   System.out.println("Enter CHEMISTRY Marks::::::::::::::::::::");
	    	   int CHEMISTRY=sc.nextInt();
	    	   System.out.println("Enter DBMS Marks::::::::::::::");
	    	   int DBMS=sc.nextInt();
	    	   System.out.println("Enter JAVA Marks::::::::::::::::::::");
	    	   int JAVA=sc.nextInt();
	    	   Class.forName("oracle.jdbc.driver.OracleDriver");
	    	   Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","Nandan","Nandan");
	    	   PreparedStatement pstmt=conn.prepareStatement("insert into USERS (UserName,Password,M1,M2,PHYSICS,CHEMISTRY,DBMS,JAVA) values (?,?,?,?,?,?,?,?)");
	    	   pstmt.setString(1, username);
	    	   pstmt.setString(2, password);
	    	   pstmt.setInt(3, M1);
	    	   pstmt.setInt(4, M2);
	    	   pstmt.setInt(5, PHYSICS);
	    	   pstmt.setInt(6, CHEMISTRY);
	    	   pstmt.setInt(7, DBMS);
	    	   pstmt.setInt(8, JAVA);
	    	   
	    	   int i = pstmt.executeUpdate();
	    	  
	    	   if(i==1)
	    	   {
	    		   System.out.println("Insertion was Success");
	    	   }else{
	    		   System.out.println("Insertion was UnSuccessfull");
	    	   }
	    	   
	       }catch(Exception e){
	    	   System.out.println(e);
	       }
		
		}

	public static void userLogin()
	{
		try
		{
			int m1,m2,phy,chem,dbms,java,total;
			double percent;
	   Scanner sc=new Scanner(System.in);
	   System.out.println("::::::::::::WELCOME TO USERS WORLD:::::::::::");
  	   System.out.println("Enter the UserName::::::");
  	   String username=sc.next();
  	   System.out.println("Enter the PassWord:::::::");
  	   String password=sc.next();
   	   Class.forName("oracle.jdbc.driver.OracleDriver");
	   Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","Nandan","Nandan");
	   PreparedStatement pstmt=conn.prepareStatement("select *from USERS");
	   ResultSet rs=pstmt.executeQuery();
	   HashMap<String,String> hm = new HashMap<>();
	   String user="";
	   String pwd="";	
		while(rs.next())
		{
			hm.put(rs.getString("UserName"), rs.getString("Password"));
			
		}
		 for(Map.Entry m:hm.entrySet())
		 {  
			  user= (String) m.getKey();
			   pwd=(String) m.getValue(); 
			   
			   if(username.equals(user)&&password.equals(pwd))
			   {
				   System.out.println("Welcome to results portal");
				   Class.forName("oracle.jdbc.driver.OracleDriver");
				   Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","Nandan","Nandan");
				   PreparedStatement psmt=conn.prepareStatement("select *from USERS where UserName=?");
				   psmt.setString(1, user);
				   
				   ResultSet rst =psmt.executeQuery();
				   while(rst.next())
				   {
				   System.out.println(rst.getString("UserName"));
				   m1=rst.getInt("M1");
				   m2=rst.getInt("M2");
				   phy=rst.getInt("PHYSICS");
				   chem=rst.getInt("CHEMISTRY");
				   dbms=rst.getInt("DBMS");
				   java=rst.getInt("JAVA");
				   total=m1+m2+phy+chem+dbms+java;
				   percent=(total/600.0)*100;
				   System.out.println("MARKS............");
				   System.out.println("M1 = "+m1);
				   System.out.println("M2 = "+m2);
				   System.out.println("PHYSICS = "+phy);
				   System.out.println("CHEMISTRY = "+chem);
				   System.out.println("DBMS  =  "+dbms);
				   System.out.println("JAVA  =  "+java);
				   System.out.println("TOTAL = "+total);
				   System.out.println("PERCENTAGE = "+percent);
				   break;
				   }
			   }
		 }  
  	   
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		 
	}
	
	
	
	
	
	
	
	
}
