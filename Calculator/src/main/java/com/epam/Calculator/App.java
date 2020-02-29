package com.epam.Calculator;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Addition obj1=new Addition(5,10);
        Subtraction obj2=new Subtraction(10,5);
        Multiplication obj3=new Multiplication(20,10);
        Division obj4=new Division(25,5);
        Division obj5=new Division(2,0);
        System.out.println("Sum of "+obj1.a+" and "+obj1.b+" is "+obj1.add());
        System.out.println("Sum of "+obj2.a+" and "+obj2.b+" is "+obj2.sub());
        System.out.println("Sum of "+obj3.a+" and "+obj3.b+" is "+obj3.mul());
        System.out.println("Sum of "+obj4.a+" and "+obj4.b+" is "+obj4.divide());
        System.out.println("Sum of "+obj5.a+" and "+obj5.b+" is "+obj5.divide());
    }
}
