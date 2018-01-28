/**
 * Prime Numbers 1a
 * Maxwell Phillips
 * 3 November 2017
 * A program to determine if a number is prime.
 */
import java.util.Scanner;
public class exercise1a {

	public static void main(String[] args) {
		//variables
		int n;
		boolean isPrime = true;
		
		
		//Get input
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer number: ");
		n = input.nextInt();
		input.close();
		
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
		//Output
		if (isPrime == true) {
			System.out.println("Prime!");
		} else {
			System.out.println("Composite!");
		}

	}
}