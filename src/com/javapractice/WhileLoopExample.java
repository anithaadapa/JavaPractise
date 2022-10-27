package com.javapractice;

public class WhileLoopExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int temp =101;
		while(temp<=105)
		{
			System.out.println("The current temp is" + temp);
			
			++temp;
		}
		
		
		int i=1;
		do
		{
			System.out.println("The value of i"  + i );
			i++;
			
		}
		
		while(i<=10);
		
		do 
			
		{
			System.out.println("I am breaking your laptop");
		}
		while (true);
	}

}
