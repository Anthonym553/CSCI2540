package assg4_mirandaj20;
/**
 * This class is a subclass of Account
 * Exception for an Account number not being found
 * @author Anthony Miranda
 * 
 */
public class AccountNotFoundException extends Exception{

	/**
	 * Default Constructor
	 * Error Message
	 */
	public AccountNotFoundException() {
		super("Account Not Found.");
	}
	
	/**
	 * one-parameter constructor
	 * @param msg
	 */
	public AccountNotFoundException(String msg) {
		super(msg);
	}

}
