package assg8_mirandaj20;
/**
 * @author Anthony Miranda
 * EventList class including methods to insert, remove, or retrieve an event from queue
 * Also includes the method to process arrival events and departure events
 */
import java.util.*;

public class EventList {

	//Private class Node used to establish the Event nodes to store arrTime & tranTime
	private class Node {
		Event data;
		Node next;
		
		/**
		 * Constructor to initialize data as an event and set next to null
		 * @param Data
		 */
		public Node(Event Data) {
			data = Data;
			next = null;
		}
		
		/**
		 * Assign data and next as variables to use as reference objects within queue
		 * @param Data
		 * @param Next
		 */
		public Node(Event Data, Node Next) {
			data = Data;
			next = Next;
		}
		
		/**
		 * Returns data within referenced Event obj
		 * @return Event data
		 */
		public Event getData() {
			return data;
		}
		
		/**
		 * returns next from referenced Node obj
		 * @return Node next
		 */
		public Node getNext() {
			return next;
		}
		
		/**
		 * sets next node from referenced Node Obj
		 * @param Next
		 */
		public void setNext(Node Next) {
			next = Next;
		}
	}
	
	private Node front;
	private int size;
	
	/**
	 * Initial constructor for EventList class to initialize size and front variables
	 */
	EventList() {
		size = 0;
		front = null;
	}
	
	/**
	 * Method to obtain size
	 * @return size
	 */
	int getSize() {
		return size;
	}
	
	/**
	 * Method to check if empty
	 * @return boolean
	 */
	boolean isEmpty() {
		if(size == 0) {
			return true;
		}
		else return false;
	}
	
	/**
	 * method to remove from queue/list
	 * @return boolean
	 */
	boolean dequeue() {
		if (size == 0) {
			return false;
		}
		else {
			front = front.getNext();
			size--;
			return true;
		}
	}
	
	/**
	 * looks at front of queue and returns data there if something is there
	 * @return Event Data
	 */
	Event peek() {
		if (size == 0) {
			return new Event();
		}
		else return front.getData();
	}
	
	/**
	 * Method to insert in queue/list
	 * @param newEvent
	 * @return boolean
	 */
	public boolean enqueue(Event newEvent) {
		Node current;
		
		if(newEvent == null) {
			return false;
		}
		else if (front == null) {
			front = new Node(newEvent, front);
			size++;
			return true;
		}
		
		current = front;
		
		while (current.next != null) {
			current = current.getNext();
		}
		
		current.setNext(new Node(newEvent));
		
		size++;
		return true;
	}
	
	/**
	 * Method to process Arrival event and Departure event
	 * @param newEvent
	 * @return boolean
	 */
	public boolean enqArrDep(Event newEvent) {
		
		if (newEvent == null) {
			return false;
		}
		
		if (front == null || newEvent.getArrivalTime() < front.getData().getArrivalTime()) {
			front = new Node(newEvent, front);
			size++;
			return true;
		}
		
		Node current = front;
		Node previous = null;
		
		while (current != null && (newEvent.getArrivalTime() > current.getData().getArrivalTime())) {
			previous = current;
			current = current.getNext();
		}
		if (current != null && (newEvent.getEventType() == 'D' && current.getData().getEventType() == 'A')) {
			if (newEvent.getArrivalTime() == current.getData().getArrivalTime()) {
				previous = current;
				current = current.getNext();
			}
		}
		
		Node newNode = new Node(newEvent, previous.getNext());
		previous.setNext(newNode);
		size++;
		return true;
	}

	
}

