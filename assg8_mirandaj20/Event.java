package assg8_mirandaj20;
/**
 * Event Class establish arrival time and transactino time along with type of events
 * @author Anthony Miranda
 *
 */
public class Event {
	
	private int arrTime;
	private int transTime;
	private char eventType;

	/**
	 * Initialized arrTime, transTime, and eventType
	 */
	public Event() {
		// TODO Auto-generated constructor stub
		arrTime = 0;
		transTime = 0;
		eventType = ' ';
	}
	
	/**
	 * assigns arrTime, transTime, and eventType to data given
	 * @param arrivalTime
	 * @param transactionTime
	 */
	public Event(int arrivalTime, int transactionTime) {
		arrTime = arrivalTime;
		transTime = transactionTime;
		eventType = 'A';
	}
	
	/**
	 * Assigns variables to data recieved
	 * @param arrivalTime
	 * @param transactionTime
	 * @param eType
	 */
	public Event(int arrivalTime, int transactionTime, char eType) {
		arrTime = arrivalTime;
		transTime = transactionTime;
		eventType = eType;
	}
	
	/**
	 * Obtains arrival time
	 * @return int
	 */
	public int getArrivalTime() {
		return arrTime;
	}
	
	/**
	 * Obtains transaction time
	 * @return int
	 */
	public int getTransactionTime() {
		return transTime;
	}
	
	/**
	 * Obtains event type A or D
	 * @return char
	 */
	public char getEventType() {
		return eventType;
	}
	
	

}
