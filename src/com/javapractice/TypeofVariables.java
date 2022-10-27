package com.javapractice;

public class TypeofVariables {

	//Variable sets example
//Data type for the variable
	
	//attributes/datatypes are int etc
	// Global Variable are displayed in blue and are declared for entire class
	
	int a=10;
	int rollnumber = 07;
	String studentName = "Anitha";
	
	//Static global variable. //***If i use static, i don't need to create object for me to access
	static int b = 20;
	
	//Methods set example
	//Syntax for method - 1.Access specifier 2. return type 3. Name for that method
	
	public void Print1()
	{
		int a = 11; //local variable is created inside method and the scope is restricted only inside the method
		int localvariable =10;
		System.out.println(a);
		
	}
	//Method with return type
	
	public int add()
	
	{
	int a = 10;
	int b = 20;
	int c = a+b;
	
	return c;
	
	}
	
	//Static method
	
	public static void print2()
	{
		System.out.println("printing static method");
	
	}
	
	//***If i use static, i don't need to create object for me to access
	
	
	public static void main(String args[])
	
	{
		//To create an object we need to use the class name for that
		
		//**** In Java to access any variable or method for a class, we need to create object for that class
		
		TypeofVariables Obj1 = new TypeofVariables();
		System.out.println(Obj1.a);
		System.out.println(TypeofVariables.b);
		Obj1.Print1(); // can print local variable also from here, just right click and select method as print1
		System.out.println(Obj1.add());
		TypeofVariables.print2(); // directly gave class name and printed it , no object used  because we used static
		print2();
	}
}
