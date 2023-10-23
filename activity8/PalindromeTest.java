package activity8;

import java.util.*;

public class PalindromeTest {

	public static void main(String[] args) {
		
		
		
		System.out.println("Enter String to test: ");
		Scanner scannerKbd = new Scanner(System.in);
		String str = scannerKbd.nextLine();
		
		isPalindromeUsingStack(str);
		
		//isPalindromeRecursion(str);
		
		//System.out.println("String is a Palindrome by Recursive Test");
		
		//System.out.println("String is not a Palindrome by Recursive Test");
	}
	
	public static boolean isPalindromeUsingStack(String str) {
		
		Stack<Character> stack = new Stack<Character>();
		String strReversed = "";
		
		for (int i = 0; i < str.length(); i++) {
			stack.push(str.charAt(i));
		}
		
		while(!str.isEmpty()) {
			strReversed = strReversed + stack.pop();
		}
		
		if (str.equals(strReversed)) {
			System.out.println("String is a Palindrome");
			return true;
		}
		else System.out.println("String is not a Palindrome");
		return false;
			
		
		
	}
	
	public static boolean isPalindromeRecursion(String str) {
		
		return true;
	}

}
