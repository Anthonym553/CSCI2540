/**
 * @author Anthony Miranda
 * @author Ben Johnson
 */
package activity6;

import java.util.Scanner;

public class RecursionPractice {
	
	public static void main(String[] args) {
		
		
		System.out.println("Enter Character: ");
		Scanner scannerKeyboard = new Scanner(System.in);
		char ch = scannerKeyboard.next().charAt(0);
		
		System.out.println("Enter String to search: ");
		Scanner scannerKbd = new Scanner(System.in);
		String str = scannerKbd.next();
		
		System.out.println(search(ch, str));
		scannerKbd.close();
		scannerKeyboard.close();

	}

	public static int search(char ch, String str) {
		if ((str == null) || (str.equals(""))) {
			return -1;
		}
		else if (ch == str.charAt(0)) {
			return 0;
		}
		else {
			if(search(ch,str.substring(1)) == -1) {
				return -1;
			}
				else return search(ch, str.substring(1))+1;
		}
	}

}
