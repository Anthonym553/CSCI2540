package activity12;

import java.util.*;
import java.io.*;

public class Map {

	public static void main(String[] args) {
		
        HashMap<String, String> map = new HashMap<String, String>();

		
		String inputFile = "assg4_input.txt";
		Scanner inputStream = null;
		try {
			inputStream = new Scanner(new File(inputFile));
			
	
			while (inputStream.hasNextLine()) {
				
				
				String temp = inputStream.nextLine();
				
				String code = temp.substring(0, temp.indexOf('\t'));
				String city = temp.substring(temp.indexOf('\t'), temp.length());
				
		        map.put(code, city);
			}
			
		}
		catch (FileNotFoundException e) {
			System.out.println("Error opening the file " + inputFile + " for reading");
			System.exit(1);
		}
		
		System.out.println("1. Display all the airports/cities");
		System.out.println("2. Add a new airport");
		System.out.println("3. Search for an airport");
		System.out.println("4. Exit");
		
		
		Scanner scannerKbd = new Scanner(System.in);
		int choice = scannerKbd.nextInt();
		
		//Have not input loop yet to continue displaying options til exit is chosen
		
		while(choice != 4) {
			switch(choice) {
		
			case 1:
				for (String key : map.keySet()) {
					System.out.println(key + map.get(key));
				}
				break;
			
			case 2:
				System.out.println("Input new code.");
				Scanner scannerkbd2 = new Scanner(System.in);
				String newCode = scannerkbd2.next();
				System.out.println("Input new city");
				String newCity = scannerkbd2.next();
			
				map.putIfAbsent(newCode, '\t' + newCity);
			
				break;
		
			case 3:
				System.out.println("Enter code of city to look for: ");
				Scanner scannerkbd3 = new Scanner(System.in);
				String searchCode = scannerkbd3.next();
				System.out.println(map.get(searchCode));
				break;
			
			}
			
			System.out.println("1. Display all the airports/cities");
			System.out.println("2. Add a new airport");
			System.out.println("3. Search for an airport");
			System.out.println("4. Exit");
			
			choice = scannerKbd.nextInt();
		}
	}
}
