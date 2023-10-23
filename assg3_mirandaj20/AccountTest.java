package assg3_mirandaj20;

import assg4_mirandaj20.Account;
import assg4_mirandaj20.CheckingAccount;
import assg4_mirandaj20.SavingsAccount;

/**
 * Class that contains main to test the three other classes
 * @author Anthony Miranda
 *
 */
public class AccountTest {

	public static void main(String[] args) {
		System.out.println("Account Class Test\n");
		
		/**
		 * Testing of methods(including constructors and overridden methods)
		 * example of account class using single argument constructor
		 */
		Account a1 = new Account("001");
		System.out.println("Account 1 Information");
		a1.displayInfo();
		System.out.println("\n");
		
		//Deposit test
		a1.deposit(100);
		System.out.println("Information of Account 001 after deposit.");
		a1.displayInfo();
		System.out.println("\n");
		
		//Example of two argument constructor in Account class
		Account a2 = new Account("002", 1000);
		System.out.println("Account 2 Information");
		System.out.println(a2.toString());
		System.out.println("\n");
		
		//Example of account class using single argument
		Account a3 = new Account("001", 500);
		System.out.println("Account 3 Information");
		System.out.println(a3.toString());
		System.out.println("\n");
		
		//Checking of equals method (not equal)
		if (a1.equals(a2)) {
			System.out.println("Account 1 and Account 2 are equal.");
		}
		else {
			System.out.println("Account 1 and Account 2 are not equal.");
		}
		System.out.println("\n");
		
		//Checking of equals method (equal)
		if (a1.equals(a3)) {
			System.out.println("Account 1 and Account 3 are equal.");
		}
		else {
			System.out.println("Account 1 and Account 3 are not equal.");
		}
		System.out.println("\n");
		
		//Testing of methods and constructors in ChekingAccount Class
		System.out.println("Checking Account Class Test\n");
		
		//Example of CheckingAccount class using single argument constructor
		CheckingAccount checkA1 = new CheckingAccount("100");
		System.out.println("Checking Account 1 Information");
		checkA1.displayInfo();
		System.out.println("\n");
		
		//Deposit into Checking Account 1
		checkA1.deposit(1000);
		System.out.println("Checking Account 1 Information after depositing 100");
		checkA1.displayInfo();
		System.out.println("\n");
		
		//Withdraw from Checking Account 1
		if(checkA1.withdraw(100)) {
			System.out.println("Checking Account 1 Information after withdrawing 100");
			checkA1.displayInfo();
			System.out.println("\n");
		}
		
		//Example of Checking Account Class using three-argument constructor
		CheckingAccount checkA2 = new CheckingAccount("200", 500, 1000);
		System.out.println("Checking Account 2 Information");
		checkA2.displayInfo();
		System.out.println("\n");
		
		//Set method test on Account 2
		CheckingAccount.setFee(25);
		
		//Withdraw from Account 2
		if (checkA2.withdraw(45)); {
			System.out.println("Checking Account 2 Information after withdrawing 45");
			checkA2.displayInfo();
			System.out.println("\n");
		}
		
		//Checking if Account 1 and 2 are equal
		if(checkA1.equals(checkA2)) {
			System.out.println("Checking Accounts 1 and 2 are equal.");
		}
		else {
			System.out.println("Checking Accounts 1 and 2 are not equal.");
		}
		System.out.println("\n");
		
		//Transfer method testing
		checkA1.deposit(1000);
		checkA1.transfer(checkA2, 500);
		System.out.println(checkA1.toString());
		System.out.println(checkA2.toString());
		System.out.println("\n");
		
		System.out.println("Savings Account Class Test \n");
		

		/**
		 * Constructor Examples
		 * Constructor with one parameter
		 */
		SavingsAccount saveAcc1 = new SavingsAccount("010");
		System.out.println("Savings Account 1 Information");
		saveAcc1.displayInfo();
		System.out.println("\n");
		
		/**
		 * Constructor with 3 parameters
		 * addInterest testing included
		 */
		SavingsAccount saveAcc2 = new SavingsAccount("020", 5000, 0.2);
		System.out.println("Savings Account 2 Information");
		saveAcc2.displayInfo();
		saveAcc2.addInterest();
		System.out.println("\n");
		System.out.println("Savings Account 2 Information after adding 20% interest rate");
		saveAcc2.displayInfo();
		System.out.println("\n");
		
		/**
		 * getIntRate test 
		 * setIntRate test
		 */
		System.out.println("Displaying method getIntRate testing");
		System.out.println(saveAcc2.getIntRate() + "\n");
		System.out.println("Updating Interest Rate for account 2 to 0.3");
		saveAcc2.setIntRate(0.3);
		saveAcc2.displayInfo();
		System.out.println("\n");
		
		//Test case that transfers from a checking account to a savings account
		System.out.println("Testing transfer from checking to savings account");
		System.out.println("Account details\n" + checkA1.toString());
		System.out.println("\n");
		System.out.println(saveAcc1.toString());
		System.out.println("\n");
		checkA1.transfer(saveAcc1, 200);
		System.out.println(checkA1.toString());
		System.out.println("\n");
		System.out.println(saveAcc1.toString());
		System.out.println("\n");
		
		//Same test but from savings to checking this time
		saveAcc1.transfer(checkA1, 100);
		System.out.println(checkA1.toString());
		System.out.println("\n");
		System.out.println(saveAcc1.toString());
		
	}
}
