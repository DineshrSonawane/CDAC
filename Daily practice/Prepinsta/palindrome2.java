package prepinsta;

public class palindrome2 {

	public static void main (String[]args)
		  {
		    int num = 14415;
		    int reverse = 0;
		    int rem;
		    int temp;
		    if (getReverse(num, reverse) == num)
		     System.out.println (num + " is Palindrome");
		    else
		      System.out.println (num + " is not Palindrome");
		  }
		  
		  static int getReverse(int num, int rev){
		    if(num == 0)
		        return rev;
		    
		    int rem = num % 10;
		    rev = rev * 10 + rem;
		    
		    return getReverse(num / 10, rev);
		}
		}