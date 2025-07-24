package Raju;

public class StaticAndNonStaticMethod {

	
	// simple example of static and non static methods
	
	public static void StaticMethod()
	{
		System.out.println("iam a static method");
	}
	public void NonStaicMethod()
	{
		System.out.println("iam a non-static method");

	}
	public static void main(String[] args) 
	{

		StaticAndNonStaticMethod.StaticMethod(); // calling via class name 
		
		StaticAndNonStaticMethod obj=new StaticAndNonStaticMethod();
		obj.NonStaicMethod();// calling via object creation
		
		
		
	}

}
