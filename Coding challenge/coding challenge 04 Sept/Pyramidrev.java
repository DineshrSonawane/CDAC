public class Pyramidrev {
 
	public static void main(String args[])   
	{ 	
	  int i,j,n=9;
	 for(i=n;i>=0;i--)
		{ 
			for (j=i-n; j<0; j++)   
		{  
		System.out.print(" ");   
		}   
			for(int k=1;k<=(2*i-1);k++)
			{
				if(k==1 || i == n || k==(2*i-1))   
			{
				System.out.print("*");
			}
			else
			{
			System.out.print(" ");   
		    }
			}
			System.out.println("");

	}
}

}
