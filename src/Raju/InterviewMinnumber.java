package Raju;

public class InterviewMinnumber {

	
	/*2 4 5

	3 4 7

	1 2 9*/
	public static void main(String[] args) 
	{
		
	 int abc[][]= {{2,4,5},{3,4,7},{1,2,9}};
     int min=0;
     int mincoloumn = 0;
     
     
     for(int i=0;i<3;i++)
     {
    	 for(int j=0;j<3;j++)
    	 {
    		 
    		 if(abc[i][j]<min)
    		 {
    			 min=abc[i][j];
    			 mincoloumn=j;
    		 }
    		 
    		 
    	 }
     }
     int max=abc[0][mincoloumn];
		int k=0;
		while(k<3)
		{
			
			if(abc[k][mincoloumn]>max)
			{
				max=abc[k][mincoloumn];
			}
			k++;
		}
		System.out.print(max);
		
		
	}

}
