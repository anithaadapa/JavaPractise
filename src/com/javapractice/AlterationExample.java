package com.javapractice;

public class AlterationExample {
	public static void main(String[] args) {
		
	int a=40;
	int b=20;
	int c=50;
	
	if(a>b) //false
	{
		System.out.println("A is grater than B");
		
	}
	
	else if(a>c)
	{
		System.out.println("A is grater than c");
	}
		
	else
	{
		System.out.println("A is lesser than b & c");
	}
	
	
	//Nested if 
	
if(a>b)
	
{
	if (a>c)
	{
		
	System.out.println("a is greater than B and C");
}
	

	}

}
}
