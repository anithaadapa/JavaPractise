package com.javapractice;

public class MethodOverloading {
	
	
	public int add (int a, int b)
	{
		int c =a+b;
		System.out.println(c);
		return c;
	}

	
	public int add(int a, int b, int c)
	
	{
		int d = a+b+c;
				System.out.println(d);
		
		return d;
	}
	
	
	public double add(double a, double b)
	{
		double c = a+b;
		System.out.println(c);
		return c;
	}
	
	public static void main(String args[])
	{
		MethodOverloading m1 = new MethodOverloading();
		
		m1.add(5, 10);
		m1.add(5, 10, 15);
		m1.add(1.5, 3.5);
	}
}
