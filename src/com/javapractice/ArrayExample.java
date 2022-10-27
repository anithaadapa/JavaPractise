package com.javapractice;

public class ArrayExample {

	
	public static void main(String[] args) {
		
		// syntax for creating array
		// datatype, array name with size for creating array
		int array1[] = new int[5] ;
	
		// second way if creating an array 
		
		int array2[] = {10,20,30,40,50};
		
		array1[0] = 90;
		array1[1]=80;
		array1[2]=70;
		array1[3]=60;
		array1[4]=50;
		
		System.out.println("The  size of the array1-"+array1.length);
		System.out.println("The  size of the array2-"+array1.length);
		
		for(int i=0; i<array1.length;i++)
		{
			System.out.println(array1[i]);
			
		}
		
		 for(int i=0; i<array2.length;i++)
			 System.out.println(array2[i]);
	}

}
