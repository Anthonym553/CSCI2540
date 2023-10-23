// Anthony Miranda
package assg1_mirandaJ20;

import java.util.Random;
import java.util.Scanner;

public class NumberGame {

	public static void main(String[] args) {
		
		Scanner scannerKbd = new Scanner(System.in);

		//Random number is generated and stored 
		int secret;
		Random generator = new Random();
		secret = generator.nextInt(100);
		
		//Prompts user to guess secret number as well as initiates counter for attempts
		//Also prompts user to continue trying to guess and updates counter for each try
		System.out.println("Guess the number chosen.");
		int numChosen = scannerKbd.nextInt();
		int attempts = 0;
		
		//while loop to hint user if guess is too high or low
		while (numChosen != secret) {
						
		if(numChosen > secret)
		{
			System.out.println("The secret number is lower than your chosen number.");
		}
		
		else if(numChosen < secret)
		{
			System.out.println("The secret number is higher than your chosen number.");
		}
		System.out.println("Try again!");
		numChosen = scannerKbd.nextInt();
		attempts++;
		}
		
		//attempts come up one short in program so an extra 1 is added for correctness
		attempts = attempts + 1;
		System.out.println("The number you chose is correct! Attempts:" + attempts);
	}

}
