public class Starpatternfibo
{           
	public static void main(String[] args)   
	{  
	int rows=6;
	int num1=0;
	int num2=1;
	int n=15;
	
			for (int k = 1; k <=n; k++) 
			{
				while(num1<=15)	
				{	
					

					int nex = num1 + num2;
					num1 = num2;
					num2 = nex;
				System.out.print("*");
				for (int i = 1; i <rows; i++)   
				{  
				for (int j = 1; j < i; j++)   
				System.out.println();	
				}
				}
			}
			   
	}
}
	