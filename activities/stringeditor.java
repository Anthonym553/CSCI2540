package activities;

import java.util.Scanner;

public class stringeditor {
	
	public static void main(String[] args) 
	{
		Scanner scannerKeyboard = new Scanner(System.in);
		
		System.out.println("Enter a String to be edited: ");
		
		String userText;
		
		
		userText = scannerKeyboard.next();
		
		userText = userText.substring(1, userText.length() - 1);
		
		System.out.println(userText);
		
		scannerKeyboard.close();
	}
	}

