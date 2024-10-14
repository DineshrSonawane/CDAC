package prepinsta;

public class Vowel2 {

	public static void main(String[] args) {
		 char c = 'K';

	        
	        if (isLowercaseVowel (c) || isUppercaseVowel (c))
	            System.out.println (c + " is a vowel ");

	        else
	            System.out.println (c + " is not vowel ");

	    }

	    static boolean isLowercaseVowel (char c)
	    {
	        	        return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u');
	    }

	    static boolean isUppercaseVowel (char c)
	    {
	        return (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U');
	    }

	}
	