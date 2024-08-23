public class Pattern4{
	public static void main(String []args)
	{
	 int i,j,rows=9;
	 for(i=1;i<=rows;i++)
		{ 
			for (j=rows-i; j>1; j--)   
		{  
		System.out.print(" ");   
		}   
			for( j=1;j<=i;j++)
			{
				if(i%2==0) 
				{
                    continue;
                }

			 System.out.print(" *");
			}
			System.out.println();   
		}	
	 }
}