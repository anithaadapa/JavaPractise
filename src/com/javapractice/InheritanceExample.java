package com.javapractice;


class Animal

{
	int numberofLegs = 4; //variable
	
	public void Eat() //method
	
	{
		System.out.println("Animals Eat");
	
	}
}	
	
	//Single Inheritance

	class Dog extends Animal
	{
		public void DogMethod()
		{
			System.out.println("This is Dog here");
		}
}


// Multi level Inheritance
	
	
	
	class Puppy extends Dog
	{
		public void PuppyDog()
		{
		
		System.out.println("This is puppy here");
		
	}
	
}
	
	

// Hierachical Inheritance

class cat extends Animal
{
	public void catmethod()
	{
		
	}
	
}
	public class InheritanceExample {
		
   public  static void main(String args[])
   {
	  
	   //class name obj name equal new class name()
	   Dog d1 =new Dog();
	   d1.DogMethod();
	   d1.Eat();
	   

	}


}

