public class Fibo 
{
public static void main(String[] args) {

    int n =15, num1 = 0, num2 = 1;
    System.out.println("Fibonacci Series till " + n + " terms:");

    for (int i = 1; i <=n; i++) {
	while(num1<=15)	
	{	
      System.out.print(num1 + ", ");

      int nex = num1 + num2;
      num1 = num2;
      num2 = nex;
    }
	}
  }
}