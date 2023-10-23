/**
 * @author Qin Ding
 * This program writes from an input file, adds line number and writes to an output file. 
 */
package activity5;

import java.io.*;
import java.util.*;

public class FileInputOutputPractice {

	public static void main(String[] args) {
		
		String filename1 = "input.txt";
		String filename2 = "output.txt";
		
		Scanner inputStream = null;
		PrintWriter outputStream = null;
		String line;
		int count=0;
		
		try {
			inputStream = new Scanner(new File(filename1));
			
		}
		catch (FileNotFoundException e) {
			System.out.println("Error opening the file " + filename1 + " for reading");
			System.exit(1);
		}
		
		try {outputStream = new PrintWriter(filename2);}
		catch (IOException e) {
			System.out.println("Error openning the file " + filename1 + " for writing");
			System.exit(1);
		}
		
		while (inputStream.hasNextLine()) {
			line = inputStream.nextLine();
			count++;
			outputStream.println(count + " " + line);
		}
		
		System.out.println("Writing finished!");
		
		inputStream.close();
		outputStream.close();
	}

}
