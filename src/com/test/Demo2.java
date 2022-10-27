package com.test;

import com.javapractice.AccessModifiersExample;

public class Demo2 extends AccessModifiersExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AccessModifiersExample Obj1 = new AccessModifiersExample();
		
		Obj1.print1();
		
		 // only public method can be accessed outside my package
		
		  Demo2 d2 = new Demo2();
	        
	        d2.print2();
	}

}

