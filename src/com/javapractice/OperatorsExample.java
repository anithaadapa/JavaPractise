package com.javapractice;

public class OperatorsExample {

	public static void main(String[] args) {
		
		//Arithmetic operators
		
		int a = 10;
		int b =20;
		int c = a+b;
		
	//	System.out.println(c);
		
		
		int x= 10;
		int y = 20;
		int z = 10;
		
		if (x== y && x==z)
		{ 
			//System.out.println(" x is equal to y and z");
		}

		else
		{
			//System.out.println(" x is not equal to y and z");
	}
		
		if (x== y || x==z)
			
		{ 
		//	System.out.println(" x is equal to y or z");
		}

		else
		{
		//	System.out.println(" x is not equal to y or z");
	}

		int d = 10;
		//d++; // incrementing operator
		//++d
		System.out.println(d);
		System.out.println(d++); //output will be 10, memory value will be 11
		System.out.println(++d); //output will be 12, memory value will be 12
		System.out.println(d--); //output will be 12, memory value will be 11
		System.out.println(--d); //output will be 10, memory value will be 10
		
	//	--d;
	//	System.out.println(d);
		

}
}