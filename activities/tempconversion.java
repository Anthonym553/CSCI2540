package activities;

import java.util.Scanner;

public class tempconversion {

	public static void main(String[] args) 
	{
		Scanner scannerKeyboard = new Scanner(System.in);
		
		System.out.println("Enter temperature to convert from Fahrenheit to Celsius: ");
		
		int F;
		F = scannerKeyboard.nextInt();
		
		double C;
		C = (F - 32) * 5 / 9;
		
		System.out.println(C + " Celsius");
		
		scannerKeyboard.close();
		
	}
}
