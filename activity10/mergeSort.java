/**
 * @author Qin Ding
 * This class implements mergesort method on an ArrayList.
 */

package activity10;

import java.util.*;
import java.io.*;

//Changed name to file name saved under pc
public class mergeSort {

	public static void main(String[] args) {
		
		Scanner input = null;
		ArrayList<Integer> lst = new ArrayList<Integer>();
		ArrayList<Integer> sortedList;
		String[] arr;
		
		try {
			input = new Scanner(new File("activity10_input.txt"));
		}
		catch (FileNotFoundException e) {
			System.out.println("Error: File not found.");
			System.exit(1);
		}
		
		arr = input.nextLine().split(",");
		
		for (String s : arr) {
			lst.add(Integer.parseInt(s));  // add the integers to the ArrayList
		}
		
		System.out.println("The original list is: ");
		for (int i = 0; i<lst.size()-1; i++) {
			System.out.print(lst.get(i)+",");
		}
		System.out.println(lst.get(lst.size()-1));
				
		sortedList = mergeSort(lst);   // sort the list
		
		System.out.println("The sorted list is: ");
		for (int i = 0; i<sortedList.size()-1; i++) {
			System.out.print(sortedList.get(i)+",");
		}
		System.out.println(sortedList.get(sortedList.size()-1));
		
		input.close();

	}
	
	/**
	 * This method takes an ArrayList of Integer and use mergesort to sort the list and returns a new sorted list. 
	 * @param lst
	 * @return the sorted list
	 */
	public static ArrayList<Integer> mergeSort(ArrayList<Integer> lst) {
		
		ArrayList<Integer> firstHalf = new ArrayList<Integer>();
		ArrayList<Integer> secondHalf = new ArrayList<Integer>();
		int size = lst.size();
		
		if ((size == 0) || (size == 1)) {
			return lst;
		}
		
		for (int i = 0; i < size/2; i++) {
			firstHalf.add(lst.get(i));            
		}
		
		for (int i = size/2; i < size; i++) {
			secondHalf.add(lst.get(i));
		}
		
		return merge(mergeSort(firstHalf), mergeSort(secondHalf));		
		
	}
	
	/**
	 * This method merges two sorted Integer lists into a new sorted list
	 * @param list1 The first sorted list
	 * @param list2 The second sorted list
	 * @return the new merged sorted list
	 */
	public static ArrayList<Integer> merge(ArrayList<Integer> list1, ArrayList<Integer> list2) {
		
		ArrayList<Integer> resultList = new ArrayList<Integer>();
		
		while (!list1.isEmpty() && !list2.isEmpty()) {
			if (list1.get(0) <= list2.get(0)) {
				resultList.add(list1.get(0));
				list1.remove(0);
			}
			else {
				resultList.add(list2.get(0));
				list2.remove(0);
			}
		}
		
		if (list1.isEmpty()) 
			resultList.addAll(list2);
		else if (list2.isEmpty()) 
			resultList.addAll(list1);
				
		return resultList;
		
	}

	
}
