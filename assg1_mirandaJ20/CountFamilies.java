// Anthony Miranda
package assg1_mirandaJ20;

import java.util.Scanner;

public class CountFamilies {

	public static void main(String[] args) {
		
		//User is asked for number of families
		System.out.println("Please enter the number of families:");
		
		Scanner scannerKbd = new Scanner(System.in);
		
		//Variables and Array created to store data used throughout program
		int numOfFamilies = scannerKbd.nextInt();
		int families[];
		int income;
		int maxIncome = 0;
		int lowerIncome = 0;
		
		//Creates and Array of size pertaining to the number of families entered
		families = new int[numOfFamilies];

		//For loop to store incomes entered by user
		for (int i = 0; i < numOfFamilies; i++)
		{
			System.out.println("Enter an income: ");
			income = scannerKbd.nextInt();
			families[i] = income;
			
			//Updates maxIncome variable as incomes are entered
			if (income > maxIncome)
			{
				maxIncome = income;
			}
		}
		
		//Maximum income is displayed and so are the families making less than 10% of max income family
		System.out.println("The maximum income is: " + maxIncome);
		
		System.out.println("The incomes of families making less than 10% of the maximum are:");
		
		for (int i = 0; i < numOfFamilies; i++)
		{
			if (maxIncome * .1 > families[i])
			{
				System.out.println(families[i]);
				lowerIncome++;
			}
		}
		
		//lowerIncome variable is used as a counter for families under specified income
		System.out.println("for a total of " + lowerIncome + " families");
	}

}
