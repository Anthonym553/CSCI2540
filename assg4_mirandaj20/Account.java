package assg4_mirandaj20;

/**
 * Account Class
 * @author Anthony Miranda
 *
 */

public class Account {
	

	private String acctNo;
	private double balance;
	
	/**
	 * Constructor with one parameter
	 * @param acctNo
	 */
	public Account(String acctNo) {
		// TODO Auto-generated constructor stub
		this.acctNo = acctNo;
		this.balance = 0;
	}
	
	/**
	 * Constructor with 2 parameters
	 * @param acctNo
	 * @param balance
	 */
	public Account(String acctNo, double balance) {
		this.acctNo = acctNo;
		if(balance > 0) {
			this.balance = balance;
		}
		else 
			this.balance = 0;
	}
	
	/**
	 *Get method used to obtain account number
	 *@return acctNo
	 */
	public String getAcctNo() {
		return acctNo;
	}
	
	/**
	 *Get method used to obtain the balance
	 *@return balance
	 */
	public double getBalance() {
		return balance;
	}
	
	/**
	 *Set method used to set account balance
	 *@param balance
	 */
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	/**
	 * "deposit" method to deposit money into account
	 * @param amount
	 */
	public void deposit(double amount) {
		// checks to see if amount depositing is positive
		if (amount > 0) {
			this.balance += amount;
		}
		else {
			System.out.println("Amount to be deposited must be a positive amount.");
		}
	}
	
	/**
	 * Withdraw method to take money from balance
	 * @param amount
	 */
	public boolean withdraw(double amount) {
		//check that amount withdrawn is positive
		if (amount > 0) {
			// check that there is enough money within account
			if (this.balance - amount >= 0) {
				this.balance -= amount;
				return true;
			}
			else {
				System.out.println("Not enough money within account.");
				return false;
			}
		}
		else {
				System.out.print(amount + "should be of positive value");
				return false;
			}
		}
	
	/**
	 * This method allows transferring money from this account to another.
	 * 
	 * @param a1
	 * @param amount
	 */
	public void transfer (Account a1, double amount) {
		//check that withdraw from account was successful then add amount to passed account
		if (this.withdraw(amount)) {
			a1.deposit(amount);
		}
	}
	
	/**
	 * displays the account information according to format
	 */
	public void displayInfo() {
		System.out.println(toString());
	}
	
	/**
	 * @return a String object with the account information
	 */
	@Override
	public String toString() {
		return "Account number: " + acctNo + "\nCurrent balance: " + balance;
	}
	
	/**
	 * Two accounts are equal if they have the same acctNo
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		if(acctNo == null) {
			if(other.acctNo != null)
				return false;
		}
		else if (!acctNo.equals(other.acctNo))
			return false;
		return true;
	}
}
