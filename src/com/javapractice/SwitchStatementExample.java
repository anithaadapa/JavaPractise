package com.javapractice;

public class SwitchStatementExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int day =3;
		String weekday ="Not defined";
		
		//switch give the number for the case condition
		switch(day) //1
		{
		case 1:weekday ="Monday";
		  break;
		
		case 2:weekday ="Tuesday";
	    break;
	    
		case 3:weekday ="Wednesday";
		  break;
		}
		
		System.out.println(weekday);
	}

}
