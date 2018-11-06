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
 import java.util.Random;
  
 public class FindNum {

	public static void main(String[] args) {
		final int MAX = 20;
		int[] numArray = new int[MAX];
		Random rand = new Random();
		Scanner input = new Scanner(System.in);		
		int num, location;
		
		/* fill array with random numbers */
		for (int i = 0; i < numArray.length;i ++) {
			numArray[i] = rand.nextInt(MAX);
		}

		/* prompt user for a number to search for */
		System.out.print("Enter a number between 0 and " + MAX + ": ");
		num = input.nextInt();
		
		/* Search for number and notify user of number location */
		location = Search.linear(numArray, num);
		if (location == -1) {
			System.out.println("Sorry, number not found in array.");
		} else {
			System.out.println("First occurrence is element " + location);
		}
	}
}