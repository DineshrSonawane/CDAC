public class Prime 
{
public static void main(String[] args) 
	{
	int i, j, chk;
        System.out.println("---First 5 Prime Numbers---");
		for(i=2; i<=11; i++)
		{
			chk = 0;
			
			for(j=2; j<i; j++)
			{
				if(i%j==0)
				{
					chk++;
					break;
				}
			}
			if(chk==0)
            System.out.println(i);
        }
    }
}