package activities;

import java.util.Scanner;

public class Lines {
	public static void main(String[] args) 
	{
	Scanner scannerKbd = new Scanner(System.in);
	
	System.out.println("How many asterisks should be printed? ");
	
	int asterisks;
	
	asterisks = scannerKbd.nextInt();
	
	printLine(asterisks);
	
	scannerKbd.close();
	}
	
	public static int printLine(int asterisks)
	{
		for (int i = 0; i < asterisks; i++)
		{
			System.out.print("*");

		}
		System.out.println("\n");
		
		return 0;
	}
	
}
