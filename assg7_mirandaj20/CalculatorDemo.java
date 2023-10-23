/**
 * @author Anthony Miranda
 * CalculatorDemo Class includes main method to test Calculator class methods
 * Prompts the user to type in an expression to be converted from infix to postfix and then evaluated based on precedence
 */
package assg7_mirandaj20;

import java.util.*;

public class CalculatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated constructor stub
		System.out.println("***PROGRAM ONLY FOR SINGLE DIGIT OPERANDS***");
		System.out.println();
		System.out.println("Please choose an option");
		System.out.println("1. Convert and evaluate an infix expression");
		System.out.println("2. Exit");
		Scanner kbd1 = new Scanner(System.in);
		int choice = kbd1.nextInt();
		
		//While loop gives user choice to continue converting and evaluating expressions as long as user doesn't choose to exit
		while (choice != 2) {
			
			switch(choice) {
			
			case 1:
			System.out.println("Enter an infix expression (Do not include spaces): ");
			Scanner kbd2 = new Scanner(System.in);
			String exp = kbd2.next();
		
			System.out.println("Conversion to postfix from: ");
			Calculator calc = new Calculator(exp);
			System.out.println(calc.getPostfix());
			System.out.println();
		
			System.out.println("Calculated result: ");
			System.out.println(calc.evaluate());
			System.out.println();
			System.out.println();
			
			break;
			
			case 2:
				System.exit(0);
				break;
			}
			System.out.println("What next?");
			System.out.println("Please choose an option");
			System.out.println("1. Convert and evaluate an infix expression");
			System.out.println("2. Exit");
			
			choice = kbd1.nextInt();
		}
		kbd1.close();
	}

}
