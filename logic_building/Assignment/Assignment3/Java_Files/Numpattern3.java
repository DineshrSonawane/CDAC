public class Numpattern3
{
	public static void main(String[] args)
	{
	  int rows=9, i,j;
	  for(i=1;i<rows;i+=2)
	  {
	    System.out.println(i+"");
		for(j=1;j<=i;j+=2)
		{
		 System.out.print(j+"*");
		 }
		 
	   }
	   System.out.print(i);
	}
}