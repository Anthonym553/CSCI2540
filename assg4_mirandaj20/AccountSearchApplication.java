package assg4_mirandaj20;
/**
 * AccountSearchApplication is the program consisting of the main method
 * Reads data from input file, stores into arrays, then ask user to enter info for search and display
 * Also handles exceptions
 */
import java.io.*;
import java.util.Scanner;

public class AccountSearchApplication {

	public static void main(String[] args) {
		//initializing arrays for accounts with size 100
		//Also initializes variables for counting amount of checking accs and savings accs
		CheckingAccount[] checkAccs  = new CheckingAccount[100];
		SavingsAccount[] saveAccs = new SavingsAccount[100];
		int numOfChecks = 0;
		int numOfSaves = 0;
		
		//Reading input file and creating a blank scanner to read file into
		String inputFile = "assg4_input.txt";
		Scanner inputStream = null;
		
		/**
		 * Reading file and splitting the several accounts within input file according to whether they are-
		 * savings or checkings into arrays
		 * Also keeps track of number of checkings and savings accounts 
		 */
		/**
		 * Ultimately Stuck here
		 * Not sure why it keeps looping on the "S" situation
		 * Understand that this will affect my grade greatly, but would appreciate the feedback as to what I was overlooking and how to-
		 * improve the functionality of this code and get it working for future reference
		 */
		try {
			inputStream = new Scanner(new File(inputFile));
			
			int index = 0;
			while (inputStream.hasNextLine()) {
				if (inputStream.hasNext("S")) {
					saveAccs[index] = new SavingsAccount(inputStream.next(), inputStream.nextDouble(), inputStream.nextDouble());
					System.out.println(saveAccs[index]);
					numOfSaves++;
				}
				
				else if (inputStream.hasNext("C")) {
					checkAccs[index] = new CheckingAccount(inputStream.next(), inputStream.nextDouble(), inputStream.nextDouble());
					System.out.println(checkAccs[index]);
					numOfChecks++;
				}
				index++;
			}
		}
		/**
		 * Checked exception if error in reading file
		 */
		catch (FileNotFoundException e) {
			System.out.println("Error opening the file " + inputFile + " for reading");
			System.exit(1);
		}
		
		double avgBalCheck = 0;
		double avgBalSave = 0;
		int i = 0;
		while ((i < numOfChecks + numOfSaves)) {
			if (inputStream.hasNext("C") ) {
				avgBalCheck = avgBalCheck + inputStream.nextDouble();
				
			}
			else if (inputStream.hasNext("S")) {
				avgBalSave = avgBalSave + inputStream.nextDouble();
			}
			i++;
		}
		/**
		 * Testing for average balances/output of all accounts would come next, but I have no general idea on why the loops keeps occurring
		 * 
		 */
		System.out.println("Number of checking accounts: " + numOfChecks);
		System.out.println("Average balance of all checking accounts: " + avgBalCheck);
		System.out.println("Number of savings accounts: " + numOfSaves);
		System.out.println("Average balance of all savings accounts: " + avgBalSave);
		
		System.out.println("All the checking accounts:\n");
		System.out.println("insert account number, insert amount within \n");
		System.out.println("insert account number, insert amount within \n");
		
		System.out.println("All the savings accounts: \n");
		System.out.println("Insert account number, insert amount within \n");
		System.out.println("Insert account number, insert amount within \n");
		System.out.println("Insert account number, insert amount within \n");
		
		System.out.println("Start Searching...");
		/**
		 * Repetition of asking user if they want to continue displaying information and from what accounts
		 */
		try {
			
			System.out.println("Enter Account type (C/S - C is Checkings and S is Savings) to search: ");
			Scanner kbd1 = new Scanner(System.in);
			String choice = kbd1.next();
			
			while(choice == "Y") {
			Scanner kbd2 = new Scanner(System.in);
			String accType = kbd2.nextLine();
			
			if(accType == "C") {
				System.out.println("Enter account number: ");
				
				Scanner userIn = new Scanner(System.in);
				String accInput = userIn.nextLine();
				
				for (int j = 0; j < numOfChecks; j++) {
					if (accInput == checkAccs[j].getAcctNo()) {
						System.out.println(checkAccs[j]);
					}
				}
			}
			else if(accType == "S") {
				System.out.println("Enter account number: ");
				
				Scanner userIn = new Scanner(System.in);
				String accInput = userIn.nextLine();
				
				for (int j = 0; j < numOfChecks; j++) {
					if (accInput == saveAccs[j].getAcctNo()) {
						System.out.println(saveAccs[j]);
					}
				}
			}
			else {
				throw new AccountNotFoundException();
			}
			System.out.println("Do you want to search for another account (Y/N?");
			Scanner kbd3 = new Scanner(System.in);
			String cont = kbd3.nextLine();
			}
		}
		catch (AccountNotFoundException e) {
			System.out.println(e.getMessage());
		} 
		
		}
		
	}
		

