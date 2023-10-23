// Anthony Miranda
package assg1_mirandaJ20;

import java.util.Scanner;

public class ColorFinder {
	public static void main(String[] args) 
	{
		
		//Gathering sentence input from user
		Scanner scannerKbd = new Scanner(System.in);
		
		System.out.println("Enter a sentence:");
		
		String userText;
		
		userText = scannerKbd.nextLine();

		//Listing the keywords that will be searched for
		String additiveN1 = "red";
		String additiveN2 = "green";
		String additiveN3 = "blue";
		String subtractiveN1 = "magenta";
		String subtractiveN2 = "yellow";
		String subtractiveN3 = "cyan";
		
		//Various if statements each checking for keywords and outputting proper statements
		if (userText.toLowerCase().contains(additiveN1.toLowerCase()))
			{
				System.out.println("Additive primary color found.");
				
				//additives contain program termination to keep priority of finding additive first and displaying
				System.exit(0);
			}
		
		if (userText.toLowerCase().contains(additiveN2.toLowerCase()))
			{
				System.out.println("Additive primary color found.");
			
				System.exit(0);
			}
		
		if (userText.toLowerCase().contains(additiveN3.toLowerCase()))		
			{
				System.out.println("Additive primary color found.");
			
				System.exit(0);
			}
		
		if (userText.toLowerCase().contains(subtractiveN1.toLowerCase()))
			{
				System.out.println("Subtractive primary color found.");
				
				System.exit(0);
			}
		
		if (userText.toLowerCase().contains(subtractiveN2.toLowerCase()))
			{
			System.out.println("Subtractive primary color found.");
			
			System.exit(0);
			}
		if (userText.toLowerCase().contains(subtractiveN3.toLowerCase()))
		{
		System.out.println("Subtractive primary color found.");
		
		System.exit(0);
		}
		
		//if no primary colors found system will display and program will end
		else 
			System.out.println("No primary colors found.");
		
	
	}
}
