package activity13;

import java.util.*;

public class graphExample {

	public static void main(String[] args) {
		
		int V = 4;
		ArrayList<ArrayList<Character>> list = new ArrayList<ArrayList<Character>>();
		
		for (int i = 0; i < V; i++) {
			list.add(new ArrayList<Character>());
		}
		
		addEdge(list, 'a', 'b');
		addEdge(list, 'a', 'c');
		addEdge(list, 'c', 'd');
		addEdge(list, 'b', 'e');
		
	}
	static void addEdge(ArrayList<ArrayList<Character>> list, char source, char destination) {
		list.get(source).add(destination);
		list.get(destination).add(source);
		
	}
}
