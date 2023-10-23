package assg6_mirandaj20;
/**
 * @author Anthony Miranda
 * Class containing all of the information and methods for one student
 */
import java.util.*;

public class Student implements Comparable<Student>{

	private String id;
	private String name;
	private String standing;
	private String major;
	
	/**
	 * Default constructor initializing String variables
	 * @param id
	 * @param name
	 * @param standing
	 * @param major
	 */
	public Student(String id, String name, String standing, String major) {
		this.id = id;
		this.name = name;
		this.standing = standing;
		this.major = major;
	}
	
	/**
	 * Obtains current student ID
	 * @return id
	 */
	public String getID() {
		
		return id;
	}
	
	/**
	 * Obtains current student Name
	 * @return name
	 */
	public String getName() {
		
		return name;
	}
	
	/**
	 * Obtains current student standing
	 * @return standing
	 */
	public String getStanding() {
		
		return standing;
	}
	
	/**
	 * Obtains current student major
	 * @return major
	 */
	public String getMajor() {
		
		return major;
	}
	
	/**
	 * sets current major of student
	 */
	public void setMajor() {
		
		this.major = major;
	}
	
	/**
	 * Returns string formatting id, name, standing, and major to the initial file format
	 * @return String
	 */
	@Override
	public String toString() {
		
		return id + " " + name + " " + standing + " " + major;
		
	}
	
	/**
	 * Checks to make sure obj is not null
	 * Checks that instance is of same type as object
	 * @return true, false
	 */
	@Override
	public boolean equals(Object obj) {

		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			
			return false;
		}
		Student other = (Student) obj;
		if (!Objects.equals(this.id, other.id)) {
			return false;
		}
		return true;
	}
	
	@Override
	public int compareTo(Student A) {
		
		return this.id.compareTo(A.id);
	}
}
