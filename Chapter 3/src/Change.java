/**
 * Change.java
 * @author 2020_maxwell_phillips
 * 12 September 2017
 * A program to calculate the amount of each coin needed to give change for a amount of money.
 */
//Import scanner
import java.util.Scanner;

public class Change {
	public static void main(String[] args) {
		//Declare variables
		int change;
		
		//Create input scanner
		Scanner input = new Scanner(System.in);
		
		//Ask for amount of change
		System.out.print("Enter the change in cents: ");
		change = input.nextInt();
		//Close the input stream
		input.close();
		
		//Print amount of quarters made from the change and lower to the remainder with modulus
		System.out.println("Quarters: "+change/25);
		change = change%25;
		//Print amount of dimes made from the change and lower to the remainder with modulus
		System.out.println("Dimes: "+change/10);
		change = change%10;
		//Print amount of nickels made from the change and lower to the remainder with modulus
		System.out.println("Nickels: "+change/5);
		change = change%5;
		//Print amount of pennies made from the change and lower to the remainder with modulus
		System.out.println("Pennies: "+change/1);
		change = change%1;
	}

}
