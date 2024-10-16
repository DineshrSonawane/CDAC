package prepinsta;

import java.util.Scanner;

public class Space {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string:");
		String s = sc.nextLine();
		char c[] = s.toCharArray();
		String s1 = " ";
		for (int i = 0; i < c.length; i++) {
		if (c[i] != ' ') {
		s1 = s1 + c[i];
		}
		}
		System.out.println(s1);
		}

}
