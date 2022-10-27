package com.javapractice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionHandlingExample {
	public void openFile() throws FileNotFoundException
    {
        File file = new File("D://Projects//");
        FileInputStream st = new FileInputStream(file);
    }
	

	public static void main(String[] args) throws InterruptedException, FileNotFoundException {
		// TODO Auto-generated method stub
		//unchecked exception
        int a =10;
        int b =0;
        
        try {
        int c = a/b;
        }
        
        catch(Exception e)
        {
            //System.out.println(e);
        }
        
        System.out.println("The calculation is completed");
        
        //Checked Exception
        
        Thread.sleep(4000);
		File file = new File("D://projects//");
		FileInputStream st = new FileInputStream(file);
	}

}
