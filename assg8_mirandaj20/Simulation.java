package assg8_mirandaj20;
/**
 * @author Anthony Miranda
 * Main Method to read a file input of arrival and transaction times and then process them individually using methods from EventList class
 */
import java.io.*;
import java.util.*;

public class Simulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EventList bankQ = new EventList();
		EventList eventListQ = new EventList();
		
		double avgWaitTime = 0;
		int totalArrTime = 0;
		int totalDepTime = 0;
		int totalTranTime = 0;
		int events = 0;
		int arrival, transaction;
		
		String inputFile = "assg8_input.txt";
		Scanner inputStream = null;
		
		//Try catch method to read file and prompt error if file failed to read
		try {
			inputStream = new Scanner(new File(inputFile));
			boolean service = true;
			
			//Fills queue with data given in file by type (arrival or transaction)
			while (inputStream.hasNext()) {
				
				arrival = inputStream.nextInt();
				transaction = inputStream.nextInt();
				
				Event newArrival = new Event(arrival, transaction);
				eventListQ.enqArrDep(newArrival);
			}
			
			//While queue is not empty goes through each event by type processing times of events individually and making sure they cannot overlap one another 
			while (eventListQ.isEmpty() == false) {
				int currTime;
				
				Event currEvent = eventListQ.peek();
				currTime = currEvent.getArrivalTime();
				
				if(currEvent.getEventType() == 'A') {
					eventListQ.dequeue();
					Event currCus = currEvent;
					
					if(bankQ.isEmpty() && service) {
						int depTime = currTime + currEvent.getTransactionTime();
						Event newDeparture = new Event(depTime, 0, 'D');
						eventListQ.enqArrDep(newDeparture);
						service = false;
					}
					else {
						bankQ.enqueue(currCus);
					}
					
					System.out.println("Processing an arrival event at time:    " + currCus.getArrivalTime());
					events++;
					totalArrTime = totalArrTime + currCus.getArrivalTime();
					totalTranTime = totalTranTime + currCus.getTransactionTime();
				}
				else {
					eventListQ.dequeue();
					if(bankQ.isEmpty() == false) {
						int depTime;
						
						Event currCus = bankQ.peek();
						bankQ.dequeue();
						depTime = currTime + currCus.getTransactionTime();
						Event newDeparture = new Event(depTime, 0, 'D');
						eventListQ.enqArrDep(newDeparture);
					}
					else {
						service = true;
					}
					System.out.println("Processing a departure event at time:    " + currTime);
					totalDepTime = totalDepTime + currTime;
				}
			}
			
			//Overall statistics of events passed
			//Wasn't sure how to obtain a 5.6 as the example output shown was giving but after some research found that setting double at beginning allowed for the evaluation to become a double
			//Not sure how to get proper spacing on output for everything to be linear
			System.out.println();
			System.out.println("Final Statistics:");
			System.out.println("Total number of people processed:    " + events);
			System.out.println("Average of time spent waiting        " + (double)(totalDepTime - totalTranTime - totalArrTime) / events);
		}
		catch (FileNotFoundException e) {
			System.out.println("Error opening the file " + inputFile + " for reading");
			System.exit(1);
		}
	}

}
