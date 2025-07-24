package Raju;

import java.util.Arrays;

public class StringPractice 
{

	
	
	
	 public int add(int a ,int b)
     {
  	   return a+b;
     }
	 
	public static void main(String[] args) 
	{
		//firs case
		
		// method 1
		//String s1="hello";
		//s1.concat("World");
		//s1=s1.concat("World");
		//System.out.println(s1);
		
		//method 2
		
		String result = "Hello".concat(" World!");
		System.out.println(result);
		
		System.out.println("*************************************************");
		//Second Case -> using comparison operator
		
		String s2="Raju";
		String s3="Raju";
		String s4="jeevanna";
		
		System.out.println(s2==s3); // it will print true 
		System.out.println(s3==s4); // it will print false
		
		System.out.println("*************************************************");

		
		//converting string into lower to upper case and upper to lower
		
		String lower = "HELLO".toLowerCase(); 
		String upper="raju".toUpperCase();
		System.out.println(lower);
		System.out.println(upper);
		
		System.out.println("*************************************************");

		// case-> founding substring 
		String test="raju completed cse";
		if(test.contains("btech"))
		{
			System.out.println("yes substring found");
		}
		else
		{
			System.out.println("substring not found");
		}
		
		System.out.println("*************************************************");


		// Splitting the string in given the String 
		
		String data="Raju,CSE,FULLSTACK";
		String[] parts=data.split(",");
		
		System.out.println("parts[0] ->"+parts[0]+"");
		System.out.println("parts[0] ->"+parts[1]+"");
		System.out.println("parts[0] ->"+parts[2]+"");
       
		System.out.println("*************************************************");

		// adding two number through using method 
		StringPractice obj=new StringPractice();
		int adding = obj.add(5, 10);  // Call the method with arguments
        System.out.println("Sum is: " + adding);
		
        //static and non static method
        
       
	}

}
