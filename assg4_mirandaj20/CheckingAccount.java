package assg4_mirandaj20;

/**
 * Checking account is a subclass of Account class
 * @author Anthony Miranda
 *
 */

public class CheckingAccount extends Account{
	
	private double overdraft;
	private static double fee;
	
	/**
	 * Constructor with one parameter
	 * @param acctNo
	 * @param overdraft
	 */

	public CheckingAccount(String acctNo) {
		super(acctNo);
		this.overdraft = 0;
	}
	
	/**
	 * three parameter constructor
	 * @param acctNo
	 * @param overdraft
	 */
	public CheckingAccount(String acctNo, double balance, double overdraft) {
		super(acctNo, balance);
		this.overdraft = overdraft;
	}
	
	/**
	 * This is a "get" method used to get the overdraft amount.
	 * @return overdraft
	 */
	public double getOverdraft() {
		return overdraft;
	}
	
	/**
	 * this is a "set" method used to modify the overdraft amount.
	 * @param overdraft
	 */
	public void setOverdraft(double overdraft) {
		this.overdraft = overdraft;
	}
	
	/**
	 * this is a "get" method used to get the overdraft fee
	 * @return fee
	 */
	public static double getFee() {
		return fee;
	}
	
	/**
	 * This is a "set" method used to modify overdraft fee.
	 * @param fee
	 */
	public static void setFee(double fee) {
		CheckingAccount.fee = fee;
	}
	
	/**
	 * Searches the array of a list of checking accounts based on the given account number
	 * @param CheckingAccount Array, numCheckAccs, acctNo
	 * @return index within array if works if not throws exception
	 */
	public static int checkingAccountSearch(CheckingAccount[] checkAccs, int numOfChecks, String acctNo) {
		int i = 0;
		while (i < numOfChecks) {
			if (acctNo == checkAccs[i].getAcctNo()) {
				return i;
			}
		}
		return i;
	}
	
	/**
	 * returns a String object with the account info
	 */
	@Override
	public String toString() {
		return super.toString() + "\nOverdraft amount: " + overdraft;
	}
	
	/**
	 * withdraws amount if enough in account
	 * @param amount
	 * @return true if withdraw works, otherwise false
	 */
	@Override
	public boolean withdraw(double amount) {
		//Check if amount to be withdrawn is positive
		if (amount > 0) {
			//if the account has enough balance
			if (getBalance() >= amount) {
				return super.withdraw(amount);
			}
			//check if within overdraft limit
			else if (getBalance() + this.overdraft - fee - amount >= 0) {
				setBalance(getBalance() - (amount + fee));
				return true;
			}
			else {
				System.out.println("Not enough amount within the account.");
				return false;
			}
		}
		else {
			System.out.print(amount + "should be positive value");
			return false;
		}
	}
	
	/**
	 * print checking account information
	 */
	@Override
	public void displayInfo() {
		System.out.println(this.toString());
	}
	
}
