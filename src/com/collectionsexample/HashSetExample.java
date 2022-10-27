package com.collectionsexample;

import java.util.HashSet;

public class HashSetExample {

	public static void main(String[] args) {
		// removes duplicates . Case sensitive. If upper case it will consider different
	
		HashSet<String> setNumbers = new HashSet();
		
		setNumbers.add("Ten");
		setNumbers.add("Twenty");
		setNumbers.add("Thirty");
		setNumbers.add("ten");
		
		for (String Num:setNumbers)
		{
			//System.out.println(Num);
		}
		
		setNumbers.remove("Twenty");
		{
			for (String Num:setNumbers)
			{
				System.out.println(Num);
			}
		
		}
		
		
	}

}
