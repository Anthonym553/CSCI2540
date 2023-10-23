/**
 * @author Qin Ding
 * This class is an exception class for negative number. 
 */

package activity5;

public class NegativeNumberException extends Exception{

	public NegativeNumberException() {
		super("Error: negative number!");
	}

	public NegativeNumberException(String msg) {
		super(msg);
	}
}
