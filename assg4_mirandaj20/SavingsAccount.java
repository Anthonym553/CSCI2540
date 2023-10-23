package assg4_mirandaj20;

/**
 * This class is a subclass of Account class
 * creates a saving's account with interest rate
 * @author Anthony Miranda
 *
 */

public class SavingsAccount extends Account{
	
	private double intRate;
	
/**
 * One-parameter constructor
 * @param acctNo
 */
	public SavingsAccount(String acctNo) {
		super(acctNo);
		this.intRate = 0;
	}
	
	/**
	 * three-parameter constructor
	 * @param acctNo
	 * @param balance
	 * @param intRate
	 */
	public SavingsAccount(String acctNo, double balance, double intRate) {
		super(acctNo, balance);
		this.intRate = intRate;
	}
	
	/**
	 * This is a "get" method used to get the interest rate.
	 * @return intRate
	 */
	public double getIntRate() {
		return intRate;
	}
	
	/**
	 * This is a "set" method used to modify the interest rate
	 * @param intRate
	 */
	public void setIntRate(double intRate) {
		this.intRate = intRate;
	}
	
	/**
	 * Add the interest earned to the balance
	 */
	public void addInterest() {
		super.setBalance((1 + intRate) * getBalance());
	}
	
	/**
	 * Searches the array of a list of checking accounts based on the given account number
	 * @param CheckingAccount Array, numCheckAccs, acctNo
	 * @return index within array if works if not throws exception
	 */
	public static int savingsAccountSearch(SavingsAccount[] saveAccs, int numOfSaves, String acctNo) {
		int i = 0;
		while (i < numOfSaves) {
			if (acctNo == saveAccs[i].getAcctNo()) {
				return i;
			}
		}
		return i;
	}
	
	/**
	 * returns a String object with the account information
	 */
	@Override 
	public String toString() {
		return super.toString() + "\nInterest Rate: " + intRate;
	}
	
	/**
	 * prints the savings account information
	 */
	@Override
	public void displayInfo() {
		System.out.println(this.toString());
	}

}
