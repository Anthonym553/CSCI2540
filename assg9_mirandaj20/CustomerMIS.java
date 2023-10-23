package assg9_mirandaj20;
/**
 * Main method - Provides menu with actions to perform according to user choice until user chooses to exit
 * @author Anthony Miranda
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CustomerMIS {

	public static void main(String[] args) {
		
		CustomerRoster roster = new CustomerRoster();
		Scanner inputFile = null;
		
		String cusID, cusPhone, cusFirst, cusLast;
		
		//Try/Catch statement to load file and if not able to prompt the user
		try {
			inputFile = new Scanner(new File("assg9_CustomerRoster.txt"));
		}
		catch (FileNotFoundException e) {
			System.out.println("Error: File not found.");
			System.exit(1);
		}
		
		//Begins to store instances of Customers using info in file to roster
		while (inputFile.hasNextLine()) {
			
			roster.addCustomer(inputFile.next(), inputFile.next() + " " + inputFile.next(), inputFile.next());
		}
		
		//Menu to be Displayed
		System.out.println("What would you like to do?");
		System.out.println("1. Display Customer Roster (Sorted)");
		System.out.println("2. Add Customer");
		System.out.println("3. Delete Customer");
		System.out.println("4. Search Customer by ID");
		System.out.println("5. Update Customer Information");
		System.out.println("6. Exit");
		
		Scanner scannerKbd = new Scanner(System.in);
		int choice = scannerKbd.nextInt();
		
		/**
		 * While loop with different cases to choose from to manipulate roster until user chooses to exit program
		 */
		while(choice != 6) {
			switch (choice) {
			
			//Display option
			case 1:
				roster.displayCustomer();
				break;
				
			//Adds Customer with user given info
			case 2:
				Scanner kbd = new Scanner(System.in);
				
				System.out.println("Please enter new ID");
				cusID = kbd.next();
				
				System.out.println("Please enter first name of new customer");
				cusFirst = kbd.next();
				
				System.out.println("Please enter last name of new customer");
				cusLast = kbd.next();
				
				System.out.println("Please enter PhoneNumber of new customer (000-000-0000)");
				cusPhone = kbd.next();
				
				roster.addCustomer(cusID, cusFirst + " " + cusLast, cusPhone);
				
				break;
				
			//Deletes a Customer with user given ID if found
			case 3:
				Scanner kbd2 = new Scanner(System.in);
				
				System.out.println("Please enter ID of Customer to delete");
				cusID = kbd2.next();
				
				roster.deleteCustomer(cusID);
				
				break;
			
			//Search for Customer with user given ID 
			case 4:
				Scanner kbd3 = new Scanner(System.in);
				
				System.out.println("Please enter ID of Customer to Search");
				cusID = kbd3.next();
				
				if(roster.searchCustomer(cusID) == null) {
					System.out.println("Customer not found");
				}
				else {
				roster.searchCustomer(cusID).displayCustomer();
				}
				
				break;
			
			//Updates information of current Customer if found with new given info
			case 5:
				Scanner kbd4 = new Scanner(System.in);
				System.out.println("Please enter ID of Customer to update");
				cusID = kbd4.next();
				
				System.out.println("Please enter Customer new first name");
				cusFirst = kbd4.next();
				
				System.out.println("Please enter Customer new last name");
				cusLast  = kbd4.next();
				
				System.out.println("Please enter Customer new phone # (000-000-0000)");
				cusPhone = kbd4.next();
				
				roster.updateCustomer(cusID, cusFirst + " "  + cusLast, cusPhone);
				
				break;
				
			//Prompts user to make a choice from given options	
			default:
				System.out.println("\n Choose from available options");
				
			}
			System.out.println();
			System.out.println("What would you like to do?");
			System.out.println("1. Display Customer Roster (Sorted)");
			System.out.println("2. Add Customer");
			System.out.println("3. Delete Customer");
			System.out.println("4. Search Customer by ID");
			System.out.println("5. Update Customer Information");
			System.out.println("6. Exit");
			
			choice = scannerKbd.nextInt();
		}
		//Saves roster back into file and exits
		roster.save();
		System.exit(0);
	}
}
