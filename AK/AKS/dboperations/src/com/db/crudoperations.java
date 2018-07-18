package com.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class crudoperations {

	public static void insert() {
       try{
    	   Scanner sc=new Scanner(System.in);
    	   System.out.println("Enter the UserName::::::");
    	   String username=sc.next();
    	   System.out.println("Enter the PassWord:::::::");
    	   String password=sc.next();
    	   System.out.println("Enter the Email::::::::::::::");
    	   String email=sc.next();
    	   System.out.println("Enter the Id::::::::::::::::::::");
    	   int id=sc.nextInt();
    	   Class.forName("oracle.jdbc.driver.OracleDriver");
    	   Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","apraja","apraja");
    	   PreparedStatement pstmt=conn.prepareStatement("insert into empdata (username,password,email,id) values (?,?,?,?)");
    	   pstmt.setString(1, username);
    	   pstmt.setString(2, password);
    	   pstmt.setString(3, email);
    	   pstmt.setInt(4, id);
    	   int i=pstmt.executeUpdate();
    	   if(i==1){
    		   System.out.println("Insert Success");
    	   }else{
    		   System.out.println("Not Success");
    	   }
    	   
       }catch(Exception e){
    	   System.out.println(e);
       }
		
		
		
	}

	public static void fetch() {
	try{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","apraja","apraja");
		PreparedStatement pstmt=conn.prepareStatement("select * from empdata");
		ResultSet rs=pstmt.executeQuery();
		while(rs.next()){
			
			System.out.println("UserName:::"+rs.getString("username"));
			System.out.println("PassWord::::"+rs.getString(2));
			System.out.println("Email:::::::::::"+rs.getString("email"));
			System.out.println("Id::::::::::::::::"+rs.getInt(4));
			
			
		}
		
	}catch(Exception e){
		System.out.println(e);
	}
	}

	public static void update() {
    try{
    	Scanner sc=new Scanner(Sy)
    	
    	
    	
    	
    	
    }catch(Exception e){
    	System.out.println(e);
    }
		
		
		
	}

	

}
