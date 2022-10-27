package com.javapractice;

public class ForLoopExample { // only for incrementing and decrementing

	
	
	public static void main(String[] args) {
      //Normal For loop
		
		//Starting Value, condition , increment
		
		for(int i =0;i<=10;i++) //it will run until 10 and it comes back here with value 11 and it fails as 11 is greater than 10
		{
			System.out.println(i);
		}

		//Enhanced for loop
		
		int[] Array1 = {20,30,40,50};
		
		for(int a:Array1)
		{
			System.out.println(a);
		}
		
		for (int i =10;i<10;i++)
		{
			for(int j=0;j<5;j++)
			{
		}
		
	}

	}
}
