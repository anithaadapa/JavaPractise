package com.javapractice;

public class AccessModifiersExample {

	private int a =10;
	
	public void print1()
    {
        System.out.println("Printing Public Method");
    }
    
    protected void print2()
    {
        System.out.println("Priting Protected Method");
    }
    
    private void print3()
    {
        System.out.println("Priting Private Method");
    }
    
    //Forpublic default, there is not need for giving the access specifier
    void print4()
    {
        System.out.println("Priting Default Method");
        
    }

}

class A
{
	public static void main(String args[])
	{
		AccessModifiersExample obj1 = new AccessModifiersExample();
		obj1.print1();
	}
}