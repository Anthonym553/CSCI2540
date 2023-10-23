/**
 * This program tests the treeSort algorithm. It reads a list of city names from an input file, and then uses treeSort method to sort the list and prints the sorted list. 
 * @author Qin Ding
 */
package activity11;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

import assg9_mirandaj20.BinarySearchTree;
import assg9_mirandaj20.TreeIterator;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner input = null;
		ArrayList<String> cityList = new ArrayList<String>();
		ArrayList<String> sortedCityList;
		
		try {
			input = new Scanner(new File("activity11_input.txt"));
		}
		catch (FileNotFoundException e) {
			System.out.println("Error: File not found.");
			System.exit(1);
		}
		
		while (input.hasNextLine()) {
			cityList.add(input.nextLine());
		}
		
		System.out.println("The original list of the cities is: ");
		for (String city: cityList) {
			System.out.println(city);
		}
		
		sortedCityList = treeSort(cityList);
		
		System.out.println("\nThe sorted list of the cities is: ");
		for (String city: sortedCityList) {
			System.out.println(city);
		}
		
		input.close();
		
	}
	
	/**
	 * This method uses treeSort algorithm to sort a list of city names
	 * @param lst The list of city names
	 * @return The sorted list
	 */
	public static ArrayList<String> treeSort(ArrayList<String> lst) {

		ArrayList<String> resultList = new ArrayList<String>();
		BinarySearchTree<City, String> bst = new BinarySearchTree<City, String>();
		TreeIterator<City> iter;
		 
		// create the binary search tree
		for (String str:lst) {
			bst.insert(new City(str));
		}
		
		// do an in-order traversal of the binary search tree
		iter = new TreeIterator<City>(bst);
		
		iter.setInorder();
		
		while (iter.hasNext()) {
			resultList.add(iter.next().getKey());
		}
		
		return resultList;
	}

}
