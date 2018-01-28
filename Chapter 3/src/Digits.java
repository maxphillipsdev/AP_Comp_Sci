/**
 * 
 * @author 2020_maxwell_phillips
 *
 */
import java.util.Scanner;

public class Digits {
	public static void main(String[] args) {
		
		// Declare Variables
		int number;
		int hundreds;
		int tens;
		int ones;
		Scanner input = new Scanner(System.in);
		
		//Get input from user
		System.out.print("Please enter the three digit number: ");
		number = input.nextInt();
		input.close();
		//Calculate
		hundreds = number / 100;
		ones = number % 10;
		tens = hundreds % 100 + 1;
		
		// Print
		System.out.print("hundreds: " + hundreds);	
		System.out.print("\ntens: " + tens);	
		System.out.print("\nones: " + ones);
		

	}

}
