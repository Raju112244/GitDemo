package Raju;

//function or method overloading  overloading 

public class childClass extends ParentClass
{
    public void audiosystem()
    {
    	System.out.println("audio chlild class");
    }
	public void engine(int a)
	{
		System.out.println(a);
		
	}
	public void engine(String name)
	{
		
		System.out.println(name);
	}
	public void engine(int a,int b)
	{
		
		System.out.println(b);
	}
	public void colour()
	{
		
		System.out.println(colour);
	}
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		childClass cd=new childClass();
		cd.engine(10);
		cd.engine("raju");
		cd.engine(2, 3);
		cd.colour();
		cd.audiosystem(); //fun
		cd.breaks();
		cd.gear();
		

	}

}
