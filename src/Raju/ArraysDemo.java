package Raju;

public class ArraysDemo {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		int a[] =new int[5]; //static memory  alocated
		a[0]=2;
		a[1]=6;
		a[2]=7;
		a[3]=8;
		a[4]=9;
		
		System.out.println(a[4]); //printing particular element
		
		for(int i=0;i<a.length;i++)
		{
			
			System.out.println(a[i]);
		}
		
		int b[] = {527,017,17,150,205}; //memory allocated dynamically
		
		
		for(int i=0;i<b.length;i++)
		{
			
			System.out.println(b[i]);
		}
		

		
		

	}

}
