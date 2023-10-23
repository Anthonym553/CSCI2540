package activities;

import java.util.Scanner;

public class CardConverter {
	public static void main(String[] args) 
	{
		Scanner scannerKbd = new Scanner(System.in);
		
		String userText;
		
		userText = scannerKbd.nextLine();
		
		switch(userText) {
		
		case "AH":
			System.out.println("Ace of Hearts");
			break;
		
		case "AD":
			System.out.println("Ace of Diamonds");
			break;
			
		case "AS":
			System.out.println("Ace of Spades");
			break;
			
		case "AC":
			System.out.println("Ace of Clubs");
			break;
			
		case "JH":
			System.out.println("Jack of Hearts");
			break;
			
		case "JD":
			System.out.println("Jack of Diamonds");
			break;
			
		case "JS":
			System.out.println("Jack of Spades");
			break;
			
		case "JC":
			System.out.println("Jack of Clubs");
			break;
			
		case "QD":
			System.out.println("Queen of Diamonds");
			break;
			
		case "QH":
			System.out.println("Queen of Hearts");
			break;
			
		case "QS":
			System.out.println("Queen of Spades");
			break;
			
		case "QC":
			System.out.println("Queen of Clubs");
			break;
			
		case "KD":
			System.out.println("King of Diamonds");
			break;
			
		case "KH":
			System.out.println("King of Hearts");
			break;
			
		case "KS":
			System.out.println("King of Spades");
			break;
			
		case "KC":
			System.out.println("King of Clubs");
			break;
			
		case "2D": case "2H": case "2S": case "2C":
			System.out.println("");
			break;
			
		case "3D": case "3H": case "3S": case "3C":
			System.out.println("");
			break;
			
		case "4D": case "4H": case "4S": case "4C":
			System.out.println("");
			break;
			
		case "5D": case "5H": case "5S": case "5C":
			System.out.println("");
			break;
			
		case "6D": case "6H": case "6S": case "6C":
			System.out.println("");
			break;
			
		case "7D": case "7H": case "7S": case "7C":
			System.out.println("");
			break;
			
		case "8D": case "8H": case "8S": case "8C":
			System.out.println("");
			break;
			
		case "9D": case "9H": case "9S": case "9C":
			System.out.println("");
			break;
			
		case "10D": case "10H": case "10S": case "10C":
			System.out.println("");
			break;
		}
		
	}
}
