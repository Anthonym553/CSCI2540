package assg6_mirandaj20;
/**
 * @author Anthony Miranda
 * Roster Interface with various methods created to be used with other classes
 */
import java.util.*;


public interface RosterInterface {
	
	
	/**
	 * Method loads data containing all students from input file
	 * @param fileName
	 */
	public abstract void loadData(String fileName);
	
	/**
	 * Method displays the complete info of all students within roster
	 */
	public abstract void displayRoster();
	
	/**
	 * Method returns the student object if found, or null if not found
	 * @param id
	 */
	public abstract Student searchForStudent(String id);
	
	/**
	 * If id is already in roster, message is printed informing user
	 * Method returns a boolean value
	 * If the student is added, it returns true; otherwise it returns false
	 * @param id
	 * @param name
	 * @param standing
	 * @param major
	 */
	public abstract boolean addStudent(String id, String name, String standing, String major);
	
	/**
	 * Method should remove the student from the roster if the id is found.
	 * Otherwise, message will be printed
	 * Returns a boolean value. If the student is removed, it returns true; otherwise it returns false
	 * @param id
	 */
	public abstract boolean removeStudent(String id);
	
	/**
	 * Returns an ArrayList object with all the students with the given major
	 * If there is no student with the given major, the size of the ArrayList will be zero
	 * @param major
	 */
	public abstract ArrayList<Student> getStudentsByMajor(String major);
	
	/**
	 * Sorts all the students by their id
	 */
	public abstract void Sort();
	
	/**
	 * Method writes the student roster back to the file if the data has been changed
	 * Same file is used for both reading and writing
	 */
	public abstract void Save();

}
