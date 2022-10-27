package com.javapractice;

public class ConstructorExample {  //if i don't want to create method with any default void method)

	
	
	
	public  void print()
	{
		System.out.println("Normal Method");
		
	}

	//Default constructor
	 ConstructorExample() // default method for the class. We can create constructor by using the class name
	 
	 {
		 System.out.println("This is my Constructor method ");
		 
	 }
	 
	 //Parametrized constructor
	 
	 ConstructorExample(int a, int b)
	 {
		 int c = a+b;
		 System.out.println(c);
		 
	 }
	 
	 //Constructor Overloading
	 
	 ConstructorExample(int a, int b, int c)
	 
	 {
		 c=a+b;
		 System.out.println(c);
		 
	 }
	 
 ConstructorExample(int a, int b, int c, int d)
	 
	 {
		 d=a+b+c;
		 System.out.println(d);
		 
	 }
 
	 ConstructorExample(int Roll, String Name)
	 {
		 System.out.println("Roll numner is:" +Roll);
		 System.out.println("Name is:" +Name);

	 }
	 
	 
	 public static void main (String args[])
	 {
	 ConstructorExample c1 = new  ConstructorExample();  //we are not calling normal method like print
	 ConstructorExample c2 = new  ConstructorExample(10,20);
	 ConstructorExample c3 = new  ConstructorExample(10,"Anitha");
	 ConstructorExample c4 = new  ConstructorExample(10,20,30);
	
	 c1.print(); // Normal method
	 
}

}