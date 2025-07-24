package Raju;

public class Multidimensional {

	public static void main(String[] args) 
	{

		//case 1
		int a[][] =new int[2][3];
		
		a[0][0]=2;
		a[0][1]=4;
		a[0][2]=5;
		a[1][0]=1;
		a[1][1]=4;
		a[1][2]=7;
		
	   System.out.println(a[1][2]); //expected 7 on 

		
	//case 2-> printing output like this
			 /* 2  4  5
	         1  4   7*/
		for(int i=0;i<2;i++)//row
		{                                               
			for(int j=0;j<3;j++)//Column
			{                                                
				System.out.print(a[i][j]);
				System.out.print("\t");
			}
			System.out.println();
		}
		
		System.out.println("**************************************************");
		
		//case3 ->
		
		/*2	4	5	
		3	4	7	
		5	2	7*/
		
		int b[][]= {{2,4,5},{3,4,7},{5,2,7}}; 
		
		//System.out.println(b[2][1]); // expected ouput is 2 
		
		for(int i=0;i<b.length;i++)//row
		{                                               
			for(int j=0;j<b[i].length;j++)//column
			{                                                
				System.out.print(b[i][j]);
				System.out.print("\t"); //for spacing
			}
			System.out.println();
		}
		
		
		
	}
}
