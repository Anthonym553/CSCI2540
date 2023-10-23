package assg6_mirandaj20;
/**
 * @author Anthony Miranda
 * RosterApplication class
 * Contains the main method which reads data from input file, displays menu options, and performs various tasks that the user selects
 */
import java.util.*;

public class RosterApplication {

	public static void main(String[] args) {
		// TODO Auto-generated constructor stub
		Roster roster = new Roster();
		String ID, name, standing, major;
		
		String fileName = "assg6_roster.txt";
		
		//Calls loadData method to load file input and then displays menu options to user
		roster.loadData(fileName);
		
		System.out.println("Choose an option (Enter Single Digit.)");
		System.out.println("1.  Display the roster");
		System.out.println("2.  Search for a student by id");
		System.out.println("3.  Add a new student");
		System.out.println("4.  Remove a student");
		System.out.println("5.  Seach for students by major");
		System.out.println("6.  Sort and save to file");
		System.out.println("7.  Save to file");
		System.out.println("8.  Exit");
		
		Scanner kbd1 = new Scanner(System.in);
		Scanner kbd2 = new Scanner(System.in);
		char choice = kbd1.next().charAt(0);
		
		
		while (choice != '8') {
			switch (choice) {
			
			//Displays current roster loaded
			case '1':
			
				roster.displayRoster();
				
				break;
			
			//Displays the complete information of the student with the ID chose
			//If ID is not found, a message is displayed
			case '2':
				System.out.println("Enter ID to search");
				ID = kbd2.next();
				System.out.println();
				
				if (roster.searchForStudent(ID) != null) {
					System.out.println("ID found");
					System.out.println(roster.searchForStudent(ID));
				}
				else {
					System.out.println("Student with ID entered not found");
				}
				
				break;
			
			//Adds new student with info inputted if ID entered is not already within roster
			case '3':
				System.out.println("Enter new student ID: ");
				ID = kbd2.nextLine();
				roster.searchForStudent(ID);
				if (roster.searchForStudent(ID) == null) {
					System.out.println("Enter new student name: ");
					name = kbd2.nextLine();
					System.out.println("Enter new student standing: ");
					standing = kbd2.nextLine();
					System.out.println("Enter new student major: ");
					major = kbd2.nextLine();
					
					roster.addStudent(ID, name, standing, major);
				}
				else if (roster.searchForStudent(ID) != null) {
					System.out.println("No new student will be added");
				}
				
				break;
			
			//Removes a student with entered ID if found. If not found, user is prompted	
			case '4':
				System.out.println("Enter student ID to be removed: ");
				ID = kbd2.next();
				if (roster.removeStudent(ID)) {
					System.out.println("Student removed from roster");
				}
				
				break;
			//Searches for students by major and displays ID and Name of students	
			//Got correct format to work (id, name) but I keep getting it to display duplicates and can't figure out why	
			case '5':
				System.out.println("Enter major to search: ");
				major = kbd2.nextLine();
				if (roster.getStudentsByMajor(major).size() != 0) {
					System.out.println("Students with major " + major);
					for (Student std : roster.getStudentsByMajor(major)) {
						System.out.println(std.getID() + " " + std.getName());
					}
				}
				else {
					System.out.println("There is no students with the major chosen within the roster");
				}
				
				break;
				
			//Sorts and saves roster to file	
			case '6':
				roster.Sort();
				roster.Save();
				System.out.println("Roster sorted and saved to file.");
				
				break;
			
			//Saves roster to file	
			case '7':
				roster.Save();
				System.out.println("Roster has been saved to file");
				
				break;
			
			//If single digit input is not valid, user is prompted such	
			default:
				System.out.println("Choice not valid");
				break;
			}
			
			System.out.println();
			
			//ask user to press enter to continue
			System.out.println("Press enter to continue");
			Scanner keyIn = new Scanner(System.in);
			keyIn.nextLine();
			
			System.out.println("Choose an option.");
			System.out.println("1.  Display the roster");
			System.out.println("2.  Search for a student by id");
			System.out.println("3.  Add a new student");
			System.out.println("4.  Remove a student");
			System.out.println("5.  Search for students by major");
			System.out.println("6.  Sort and save to file");
			System.out.println("7.  Save to file");
			System.out.println("8.  Exit");
			
			System.out.println();
			
			choice = kbd1.next().charAt(0);
		}
		kbd1.close();
		kbd2.close();
		
		//After choosing exit option, the roster is saved to file and program terminates
		roster.Save();
		System.out.println("Roster Saved to file... exiting program");
		System.exit(0);
	}

}
