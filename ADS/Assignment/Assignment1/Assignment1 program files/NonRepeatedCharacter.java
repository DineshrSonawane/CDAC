public class NonRepeatedCharacter
{
	public static void main(String[] args)
	{
		String str = "stress";
		
		char[] arr = str.toCharArray();
		
		for(int i=0; i<arr.length; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i] != arr[j])
				{
					System.out.println(arr[j]);
					System.exit(0);
					
				}
				else
				{
					System.out.println("null");
					System.exit(0);
				}
			}
		}			

	}
}