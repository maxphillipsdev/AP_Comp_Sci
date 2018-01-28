/**
 * Monogram
 * Maxwell Phillips
 * 6 November 2017
 * Creates a monogram from your names.
 */
import java.util.Scanner;
import java.lang.String;
public class exercise18 {

	public static void main(String[] args) {
		// variables
		String firstName;
		String middleInital;
		String lastName;
		
		//Get input
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your first name: ");
		firstName = input.next();// First
		System.out.print("Enter your middle inital: ");
		middleInital = input.next();// Second
		System.out.print("Enter your last name: ");
		lastName = input.next();// Last
		input.close();
		
		//Generate monogram
		System.out.println("Your monogram is: ");
		
		//First inital
		firstName = firstName.trim();
		firstName = firstName.toLowerCase();
		firstName = firstName.substring(0,1);
		System.out.print(firstName);
		
		//Last Inital
		lastName = lastName.trim();
		lastName = lastName.toUpperCase();
		lastName = lastName.substring(0,1);
		System.out.print(lastName);

		//Middle Inital
		middleInital = middleInital.trim();
		middleInital = middleInital.toLowerCase();
		middleInital = middleInital.substring(0,1);
		System.out.print(middleInital);

	}

}
