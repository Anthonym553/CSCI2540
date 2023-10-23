package assg6_mirandaj20;
/**
 * @author Anthony Miranda
 * The class for the student roster
 * Code written for methods specified within the RosterInterface
 */
import java.util.*;
import java.io.*;

public class Roster implements RosterInterface {
	
	private ArrayList<Student> stdRoster;
	ArrayList<Student> studentMajors = new ArrayList<>();
	private String fileName;
	FileWriter save;
	
	/**
	 * Default Constructor
	 * Creates arrayList to hold students within roster
	 */
	public Roster() {
		stdRoster = new ArrayList<>();
	}
	
	/**
	 * Method loads data containing all students from input file
	 * @param fileName
	 */
	@Override
	public void loadData(String fileName) {
		
		this.fileName = fileName;
		
		try {
			Scanner inputFile = new Scanner(new File(fileName));
			
			while(inputFile.hasNextLine()) {
				String tokens[] = inputFile.nextLine().split(",");
				addStudent(tokens[0], tokens[1], tokens[2], tokens[3]);
			}
			inputFile.close();
		}
		catch (FileNotFoundException e) {
			System.out.println("Error: input file not found.");
			System.exit(1);
		}
	}
	
	/**
	 * Method displays the complete info of all students within roster
	 */
	@Override
	public void displayRoster() {
		
		System.out.println("Student Roster:");
		toString();
		for (Student std : stdRoster) {
			System.out.println(std.getID() + "," + std.getName() + "," + std.getStanding() + "," + std.getMajor());
		}
		
	}
	
	/**
	 * Method returns the student object if found, or null if not found
	 * @param id
	 */
	@Override
	public Student searchForStudent(String id) {
		
		for (Student std : stdRoster) {
			if (std.getID().equals(id)) {
				return std;
			}
		}
		return null;
	}
	
	/**
	 * If id is already in roster, message is printed informing user
	 * Method returns a boolean value
	 * If the student is added, it returns true; otherwise it returns false
	 * @param id
	 * @param name
	 * @param standing
	 * @param major
	 */
	@Override
	public boolean addStudent(String id, String name, String standing, String major) {
		
		
		if (searchForStudent(id) != null) {
			System.out.println("ID is already within use in the roster");
			return false;
		}
		else if (searchForStudent(id) == null) 
			stdRoster.add(new Student(id, name, standing, major));
			return true;
			
	}
	
	/**
	 * Method should remove the student from the roster if the id is found.
	 * Otherwise, message will be printed
	 * Returns a boolean value. If the student is removed, it returns true; otherwise it returns false
	 * @param id
	 */
	@Override
	public boolean removeStudent(String id) {
		
		if (searchForStudent(id) != null) {
			System.out.println("ID is found, student will be removed from roster");
			stdRoster.remove(searchForStudent(id));
			return true;
		}
		else {
			System.out.println("Student ID not found");
			return false;
		}
	}
	
	/**
	 * Returns an ArrayList object with all the students with the given major
	 * If there is no student with the given major, the size of the ArrayList will be zero
	 * @param major
	 */
	@Override
	public ArrayList<Student> getStudentsByMajor(String major) {
		for (Student std : stdRoster) {
			if (std.getMajor().equals(major)) 
				studentMajors.add(std);
			}
			return studentMajors;
	}
	
	/**
	 * Sorts all the students by their id
	 */
	@Override
	public void Sort() {
		Collections.sort(stdRoster);
	}
	
	/**
	 * Method writes the student roster back to the file if the data has been changed
	 * Same file is used for both reading and writing
	 */
	@Override
	public void Save() {
		try {
			save = new FileWriter(fileName);
			PrintWriter printWriter = new PrintWriter(save);
			for (Student std : stdRoster) {
				printWriter.printf("%s,%s,%s,%s%n", std.getID(), std.getName(), std.getStanding(), std.getMajor());
			}
			printWriter.close();
		}
		catch (IOException e) {
			System.out.println("Error opening file");
		}
	}

}
