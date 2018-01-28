/**
 * Prime Numbers 2a
 * Maxwell Phillips
 * 3 November 2017
 * A program to determine the prime numbers between two numbers.
 */
import java.util.Scanner;
public class exercise2a {

	public static void main(String[] args) {
		//variables
		int num1;
		int num2;
		boolean isPrime = true;
		
		//Get input
		Scanner input = new Scanner(System.in);
		
		//Get num1
		System.out.print("Enter an integer number for the lower range: ");
		num1 = input.nextInt();
		
		//Get num2
		System.out.print("Enter an integer number for the higher range: ");
		num2 = input.nextInt();
		
		input.close();
				
		//Iterate over each number within range, inclusive.
		for (int i = num1; i <= num2; i++) {
			isPrime = true;
				for (int k = 2; k<i; k++) { //Iterate over each number from 0 to i 
					if (i % k == 0) { //Check each number from 0 to i and if i%k == 0, then break.
						isPrime = false; //i is not prime!
						break;
					}
				}
			if (isPrime == true) {
				System.out.println(i+" is prime!");
			}
		}
	}
}