/**
 * Group Assignment
 * Maxwell Phillips
 * 14 November 2017
 * A program created to categorize people into groups based on their last names
 */
import java.util.Scanner;
import java.lang.String;
public class test5 {

	public static void main(String[] args) {
		//Declare variables
		String firstName;
		String lastName;
		String group = null;
		String inital;
		char initalChar;

		//Get input
		Scanner input = new Scanner(System.in);

		System.out.print("Enter your first name: "); //Get first name
		firstName = input.next();
		System.out.println("Enter your last name: "); //Get last name
		lastName = input.next();
		input.close();
		
		//Trim the names for trailing spaces and get the inital...
		firstName = firstName.trim();
		lastName = lastName.trim();
		inital = lastName.toUpperCase();
		initalChar = inital.charAt(0);
		
		//Check for which group they are in...
		
		//Group 1
		for (char group1 = 'A'; group1 <= 'I'; group1++) {
			if (initalChar == group1) {
				group = "Group 1";
			}
		}
		
		//Group 2
		for (char group2 = 'J'; group2 <= 'S'; group2++) {
			if (initalChar == group2) {
				group = "Group 2";
			}
		}
		
		//Group 3
		for (char group3 = 'T'; group3 <= 'Z'; group3++) {
			if (initalChar == group3) {
				group = "Group 3";
			}
		}
		
		//Output result
		System.out.println(firstName + " " + lastName + " is assigned to " + group);
	}

}
