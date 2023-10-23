/**
 * @author Anthony Miranda
 */
package assg5_mirandaj20;

import java.util.*;

public class RecursionTest {

	/**
	 * Main method for testing recursive methods deleteFirst and deleteAll
	 * @param args
	 */
	public static void main(String[] args) {
		
		/**
		 * Asking user to enter a string and character to be used in test
		 * Provides menu of options to edit the string pertaining to the character
		 */
		System.out.println("Please enter string: ");
		Scanner input = new Scanner(System.in);
		String str = input.next();
		
		System.out.println("Please enter character: ");
		char ch = input.next().charAt(0);
		
		System.out.println("1.  Test deleteFirst method");
		System.out.println("2.  Test deleteAll method");
		System.out.println("3.  Exit\n");
		
		int userInput = input.nextInt();
		
		//While loop to perform methods based on user choice
		//Program will exit if user chooses 3
		while(userInput != 3) {
			
			//Input 1 will call deleteFirst method
			if (userInput == 1) {
			
				System.out.println(deleteFirst(str, ch));
				
			}
			
			//Input 2 will call deleteAll method
			else if(userInput == 2) {
				
				System.out.println(deleteAll(str, ch));
				
			}
			
			//input 3 will exit program
			else if (userInput == 3) {
				
				System.exit(0);
				
			}
			
			//Any other number that isn't on the menu will prompt user to select again
			else {
				
				System.out.println("Choice not valid, please choose from given options.");
				
			}
			
			System.out.println("1.  Test deleteFirst method");
			System.out.println("2.  Test deleteAll method");
			System.out.println("3.  Exit\n");
			
			userInput = input.nextInt();
		}
		input.close();
	}
	
	/**
	 * Recursive method that deletes first occurrence of ch in string str
	 * @param str
	 * @param ch
	 * @return new string
	 */
	public static String deleteFirst(String str, char ch) {
		if(str.length() ==0) {
			return str;
		}
		else if (str.charAt(0) == ch) {
			
			return str.substring(1);
			
		}
		else {
			return str.charAt(0) + deleteFirst(str.substring(1), ch);
		}
		
	}
	
	/**
	 * Recursive method that deletes every occurrence of ch in string str
	 * @param str
	 * @param ch
	 * @return original string or new string
	 */
	public static String deleteAll(String str, char ch) {
		if(str.length() == 0) {
			
			return str;
		}
		else {
			if (str.charAt(0) == ch) {
				
				return deleteAll(str.substring(1), ch);
			}
			else {
				return str.charAt(0) + deleteAll(str.substring(1), ch);
			}
		}
	}

}
