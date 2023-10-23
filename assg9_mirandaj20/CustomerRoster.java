package assg9_mirandaj20;
/**
 * This class represents the customer roster and stores instances of Customer class
 * Contains binary search tree as data field containing all customers
 * @author Anthony Miranda
 */
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class CustomerRoster {

	BinarySearchTree<Customer, String> tree = new BinarySearchTree<Customer, String>();
	private String fileName = "assg9_CustomerRoster.txt";
	FileWriter save;
	
	public CustomerRoster() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Adds new Customer to roster, if the ID is already within roster the user will be prompted such
	 * @param cusID
	 * @param cusName
	 * @param cusPhone
	 */
	public void addCustomer(String cusID, String cusName, String cusPhone) {
		if(searchCustomer(cusID) == null) {
			tree.insert(new Customer(cusID, cusName, cusPhone));
		}
		else {
			System.out.println("ID is already in roster.");
		}
	}
	
	/**
	 * Deletes Customer, if the ID is not found then the user will be prompted such
	 * @param cusID
	 */
	public void deleteCustomer(String cusID) {
		
		if(searchCustomer(cusID) == null) {
			
			System.out.println("ID was not found.");
		}
		else {
			tree.delete(cusID);
		}
	}
	
	/**
	 * Searches for Customer with given ID, if not found then will let know
	 * @param ID
	 * @return Customer
	 */
	public Customer searchCustomer(String ID) {
		
		return tree.retrieve(ID);
		
	}
	
	/**
	 * Updates the information (Name and Phone#) of customer, if customer not found then will prompt user such
	 * @param cusID
	 * @param cusName
	 * @param cusPhone
	 */
	public void updateCustomer(String cusID, String cusName, String cusPhone) {
		
		if(searchCustomer(cusID) == null) {
			System.out.println("ID was not found.");
		}
		else {
			tree.delete(cusID);
			tree.insert(new Customer(cusID, cusName, cusPhone));
		}
	}
	
	/**
	 * Displays the customer roster in sorted order, sorted by ID
	 */
	public void displayCustomer() {
		TreeIterator<Customer> iter = new TreeIterator<Customer>(tree);
		
		iter.setInorder();
		
		while(iter.hasNext()) {
			
			iter.next().displayCustomer();
			
		}
	}
	
	/**
	 * Saves the roster into the same file it was input from in correct format.
	 */
	public void save() {
		TreeIterator<Customer> iter = new TreeIterator<Customer>(tree);

		iter.setInorder();
		
		try {
			save = new FileWriter(fileName);
			PrintWriter printWriter = new PrintWriter(save);
			while(iter.hasNext()) {
				Customer cus = iter.next();
				printWriter.printf("%s\t%s\t%s\n" , cus.getID(), cus.getName(), cus.getPhone());
			}
			printWriter.close();
		}
		catch (IOException e) {
			System.out.println("Error opening file");
		}
	}

}
