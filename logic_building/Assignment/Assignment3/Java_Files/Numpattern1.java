public class Numpattern1
{
	public static void main(String[] args)
	{
	  int rows=5, i,j;
	  for(i=1;i<rows;i++)
	  {
	    System.out.println(i+"");
		for(j=1;j<=i;j++)
		{
		 System.out.print(j+"*");
		 }
		 
	   }
	   System.out.print(i);
	}
}