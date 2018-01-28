/**
 * Prime Numbers 3
 * Maxwell Phillips
 * 30 November 2017
 * A program to determine if a number is prime.
 */
import java.util.Scanner;
public class Exercise3 {
	/**
	 * Method to determine if a int is prime or or not.
	 * Pre:
	 * @param n: Requires a integer number, n.
	 * @return: boolean isPrime.
	 * Post: Returns whether or not the value is prime, in the form of a boolean.
	 */
	public static boolean isPrime(int n) {
		boolean isPrime = true;
		//Determine if number is prime or not
				if (n%2==0) { //Is it divisible by 2, and therefor even? If so, isPrime is false.
					isPrime = false;
				} else {
					for(int i=2; i<=n/2; i++) {
						if (n%i==0) {
							isPrime = false;
						}
					}
				}
				return(isPrime);
	}
	public static void main(String[] args) {
		//variables
		int num;
		
		//Get input
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer number: ");
		num = input.nextInt();
		input.close();
		
		//Output
		if (isPrime(num)) {
			System.out.println("Prime!");
		} else {
			System.out.println("Composite!");
		}

	}
}