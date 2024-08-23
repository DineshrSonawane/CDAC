public class Numpattern2
{
	public static void main(String[] args)
	{
	  int rows=5, i,j;
	  for(i=rows;i>=1;i--)
	  {
	    System.out.println(i+"");
		for(j=rows;j>=i;j--)
		{
		 System.out.print(j+"*");
		 }
		 
	   }
	   System.out.println();
	}
}