package prepinsta;

public class PositiveNumber1 {

	public static void main(String[] args) {
		int a=-4;
		String result;
		
		if(a==0)
		{
		System.out.println("Number is zero");
		}
		else
		{
			result = a<0 ? "Negative" : "Positive"; 
			System.out.println(result);
		}
	}

}
