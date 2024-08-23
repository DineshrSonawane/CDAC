public class Pattern4{
	public static void main(String []args)
	{
	 int i,j,rows=5;
	 for(i=0;i<=rows;i+=2)
		{ 
		for (j=rows-i; j>1; j--)   
		{  
		System.out.print(" ");   
		}   
			for( j=1;j<=i;j++)
			{
			 System.out.print(" *");
			}
			System.out.println();   
		}	
	 }
}