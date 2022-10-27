package com.javapractice;



abstract class Shape {  // used to define methods definitions. Create blue print and inheritant class and use your methods. can have normal methods and abstract class
    //should use all the methods defined in abstract class
    abstract void draw();
    abstract void color();
    
    public void print()
    {
        System.out.println("Printing something");
    }
    
}
class Circle extends Shape
{
    @Override
    void draw() {
        
        System.out.println("Drawing a circle");
        
    }
    @Override
    void color() {
        
        System.out.println("Circle color is blue");
        
    }    
    
}
class Square extends Shape
{
    @Override
    void draw() {
        System.out.println("Drawing Square");
        
    }
    @Override
    void color() {
        System.out.println("Square color is green");
    }
    
}
public class AbstractClassExample
{
    public static void main(String args[])
    {
        Shape s1 = new Circle();
        s1.color();
        
        Shape s2 = new Square();
        s2.color();
        
    }
    
}