package com.javapractice;

public class StringClassExample {

	public static void main(String args[])
	{
		String student ="Anvesh is a good boy 3";
		
		//int ab =10;
		
		System.out.println(student.charAt(10)); //0123456789
		
		String student1 = "ashvin";
		String student2 = "AVINASH";
		
		if (student1.equalsIgnoreCase(student2))
		{
			System.out.println("Both the student names are same");
		}
		else
		{System.out.println("students names are different");
	}
	
		
		System.out.println(student2.length());
		System.out.println(student2.isEmpty());
		System.out.println(student1.toUpperCase());
		
		System.out.println(student.contains("good"));
		System.out.println(student.contains("bad"));
		System.out.println(student.substring(0,6)); // get range of values
		System.out.println(student.substring(10)); //starting point is given and the remaining is displayed
}
}

