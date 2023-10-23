package activity9;

import java.util.*;

public class PalindromePart2 {

	public static void main(String[] args) {
		
		
		
		System.out.println("Enter String to test: ");
		Scanner scannerKbd = new Scanner(System.in);
		String str = scannerKbd.nextLine();
		
		System.out.println("Choose a method to test for Palindrome: ");
		System.out.println("1. Using Stack");
		System.out.println("2. Using Recursion");
		System.out.println("3. Using Stack and Queue");
		
		int choice = scannerKbd.nextInt();
		
		switch(choice) {
		
		case 1:
			if (isPalindromeUsingStack(str) == true) {
			System.out.println("String is a Palindrome");
			}
			else if (isPalindromeUsingStack(str) == false) {
			System.out.println("String is not a Palindrome");
			}
			break;
		
		case 2:
			if (isPalindromeRecursion(str) == true) {
			System.out.println("String is a Palindrome by Recursion");
			}
			else if (isPalindromeRecursion(str) == false) {
			System.out.println("String is not a Palindrome by Recursion");
			}
			break;
		
		case 3:
			if (isPalindromeUsingStackQueue(str) == true) {
				System.out.println("String is a Palindrome by comparison of Stack and Queue");
			}
			else if (isPalindromeUsingStackQueue(str) == false) {
				System.out.println("String is not a Palindrome by comparison of Stack and Queue");
			}
		
		}
		
	}
public static boolean isPalindromeUsingStack(String str) {
		
		Stack stack = new Stack();
		String strReverse = "";
		
		for (int i = 0; i < str.length(); i++) {
			stack.push(str.charAt(i));
		}
		
		while (!stack.isEmpty()) {
			strReverse = strReverse + stack.pop();
		}
		
		if (str.equals(strReverse)) {
			return true;
		}
		else return false;
			
		
		
	}
	
	public static boolean isPalindromeRecursion(String str) {
		
		if (str.length() == 0 || str.length() == 1)
			return true;
		if (str.charAt(0) == str.charAt(str.length() -1)) {
			return isPalindromeRecursion(str.substring(1, str.length() - 1));
		}
		return false;
	}
	
	public static boolean isPalindromeUsingStackQueue(String str) {
		Stack stack = new Stack();
		Queue<Character> q = new LinkedList<>();
		
		for (int i = 0; i < str.length(); i++) {
			stack.push(str.charAt(i));
		}
		
		for (int i = 0; i < str.length(); i++ ) {
			q.add(str.charAt(i));
		}
		
		while (!stack.isEmpty() || !q.isEmpty()) {
			if (stack.pop() == q.remove()); 
			else if (stack.pop() != q.remove()); {
				return false;
			}
		}
		
		return true;
	}

}
