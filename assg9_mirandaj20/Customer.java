package assg9_mirandaj20;
/**
 * Extends KeyedItem<String> class 
 * Creates instance of Customer with given info: ID,Name,PhoneNumber
 * @author AnthonyMiranda
 *
 */
public class Customer extends KeyedItem<String> {

	public Customer(String key) {
		super(key);
		
	}
	
	private String cusID;
	private String cusName;
	private String cusPhone;
	
	/**
	 * Default Constructor
	 * @param cusID
	 * @param cusName
	 * @param cusPhone
	 */
	public Customer(String cusID, String cusName, String cusPhone) {
		super(cusID);
		this.cusID = cusID;
		this.cusName = cusName;
		this.cusPhone = cusPhone;
	}
	
	/**
	 * Retrieves ID of current Customer
	 * @return
	 */
	public String getID() {
		return cusID;
	}
	
	/**
	 * Retrieves name of current customer
	 * @return
	 */
	public String getName() {
		return cusName;
	}
	
	/**
	 * retrieves phone of current customer
	 * @return
	 */
	public String getPhone() {
		return cusPhone;
	}
	
	/**
	 * Sets new ID
	 * @param cusID
	 */
	public void setID(String cusID) {
		this.cusID = cusID;
	}
	
	/**
	 * Sets new Name
	 * @param cusName
	 */
	public void setName(String cusName) {
		this.cusName = cusName;
	}
	
	/**
	 * Sets new phone number
	 * @param cusPhone
	 */
	public void setPhone(String cusPhone) {
		this.cusPhone = cusPhone;
	}
	
	/**
	 * Customer function to help output of one customer instance
	 */
	public void displayCustomer() {
		System.out.println("Customer:" + this.cusName);
		System.out.println("ID: " + this.cusID);
		System.out.println("Phone Number: " + this.cusPhone);
		System.out.println();
	}

}
