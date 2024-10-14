package prepinsta;

public class SumOfNaturalNum1 {
	
	public static int sum(int a) {
		if (a==0)
			return 0 ;
		else {
			return a + sum(a-1); 
		}
	}

	public static void main(String[] args) {
		
		System.out.println(" Sum is "+sum(10));

	}

}
