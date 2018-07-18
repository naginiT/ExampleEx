package com.db;

import java.util.ArrayList;
import java.util.Iterator;

public class employee {
 
	int id;
	String name;
	String dept;
	public employee(int id, String name, String dept) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
	}
	public static void main(String[] args) {
		employee e=new employee(121, "kishre", "java");
		employee e1=new employee(125, "nagini", "testing");
		ArrayList<employee> al=new ArrayList<>();
		al.add(e);
		al.add(e1);
		Iterator<employee> itr=al.iterator();
		while(itr.hasNext()){
	employee ee=(employee)itr.next();
	System.out.println(ee.dept);
	System.out.println(ee.id);
	System.out.println(ee.name);
		}
		
		
		
	}
	


	
	
	
}
