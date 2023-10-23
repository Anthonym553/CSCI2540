package activity12;

import java.util.*;

public class NgramPractice {
	/*
	//Input file will be read and lines should be parsed and held within a map
	//in order to obtain Ngrams
	
	public static HashMap<String, Integer> Ngrams(String inputString, int n) {
		
		HashMap<String, Integer> finalOutput = new HashMap<>();	
	
		//assume line from document
		String[] x = {"cat", "dog", "goldfish", "cat", "dog", "shrimp"};
		
		for (int pos = 0; pos < x.length; pos++) {
			
			finalOutput.put(x[pos], 1);
			System.out.println(finalOutput.get(x[pos]));
			System.out.println(finalOutput.keySet());
			
			if (finalOutput.get(x[pos]) > 1) {
				
				finalOutput.put(x[pos], finalOutput.get(x[pos] +1));
				
			}
		}
	
	
	return finalOutput;
	*/
	public static void main(String[] args) {

		//hash map/dictionary to hold words with how many times
		//they occurred
		HashMap<String, Integer> j = new HashMap<String, Integer>();

		//assume this is a line from the document
		String[] x = {"cat","dog","goldfish","cat","dog","shrimp"};

		//for loop to run through the string array and
		//read each word to put in the hash map
		for(int pos = 0; pos < x.length; pos++) {

			//an if statement that is supposed to see
			//if a word was already seen and then update
			//the count of that word.
			if (j.get(x[pos]) != null){
				j.put(x[pos], j.get(x[pos])+1);
			}//end of if
			
			else {
				j.put(x[pos],1);
			}
		}//end of for

		//testing if putting the same word twice creates
		//a duplicate (or something else unexpected)
		//j.put("cat", 1);

		//System.out.print(j);

		

		}// end of main


}

