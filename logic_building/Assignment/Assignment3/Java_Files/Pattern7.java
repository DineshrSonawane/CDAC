public class Pattern7
{
	public static void main(String []args)
	{
	 int i,j,rows=9;
	 {
	 for(i=0;i<=rows-1;i++)
		{ 
			for (j=0; j<i; j++)   
		{  
		System.out.print(" ");   
		}   
			for( j=i;j<=rows-1;j++)
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
