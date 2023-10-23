/**
 * @author Qin Ding
 * This program asks user to enter an integer. If it is negative, it throws an exception. Otherwise it returns the square root of the number.
 */

package activity5;

import java.util.*;

public class ExceptionPractice {

	public static void main(String[] args) {
		
		int num;
		Scanner kbd = new Scanner(System.in);
		
		System.out.println("Enter an integer: ");
		num = kbd.nextInt();
		
		try {
			if (num < 0) 
				throw new NegativeNumberException();
			else
				System.out.println(Math.sqrt(num));
			}
		catch (NegativeNumberException e) {
			System.out.println(e.getMessage());
		}
		finally {
			kbd.close();
		}

	}
}
