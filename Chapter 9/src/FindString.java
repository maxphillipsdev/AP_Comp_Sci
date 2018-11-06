/*
 * FindNum.java from Chapter 10
 * Finds the position of the number entered by the user.
 * Lawrenceville Press
 * June 10, 2005
 */
 
 /**
  * Searches an array for a number.
  */
 
 import java.util.Scanner;
  
 public class FindString {

	public static void main(String[] args) {
		final int MAX = 20;
		String[] stringArray = new String[MAX];
		Scanner input = new Scanner(System.in);		
		String string;
		int location;
		
		/* fill array with user entered strings */
		for (int i = 0; i < stringArray.length;i++) {
			System.out.println("Please enter a string to add to array: ");
			stringArray[i] = input.next();
		}
		
		/* prompt user for a string to search for */
		System.out.print("Enter a string to search for: ");
		string = input.next();
		
		/* Search for number and notify user of number location */
		location = Search.linear(stringArray, string);
		if (location == -1) {
			System.out.println("Sorry, string not found in array.");
		} else {
			System.out.println("First occurrence is element " + location);
		}
	}
}