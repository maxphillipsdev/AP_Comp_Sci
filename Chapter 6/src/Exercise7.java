/**
 * Perfect Integers Program
 * @author Maxwell Phillips
 * 30 November 2017
 * A program to determine if a given number is perfect.
 */
import java.util.Scanner;
public class Exercise7 {
	/**
	 * Determine if a given int is a perfect number.
	 * Pre:
	 * @param n: Requires a given int, n.
	 * @return: Returns true if n is a perfect number.
	 * Post: Will return as a boolean value if the int given (n) is a perfect number.
	 */
	public static boolean isPerfectNum(int n) {
		int total = 0;
		for (int i = 1; i < n; i++) {
				if(n%i==0) {
					//System.out.println(i);
					total += i;
				}
		}
		if (total == n) {
			return(true);
		} else {
			return(false);
		}
		
	}
	public static void main(String[] args) {
		//Variables
		int num;
		//Get user input
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a integer number: ");
		num = input.nextInt();
		input.close();
		
		//Determine if num is perfect and print result.
		if (isPerfectNum(num)) {
			System.out.println(num+" is a perfect number!");
		} else {
			System.out.println(num+" is not a perfect number!");
		}
	}

}
