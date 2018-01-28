/**
 * Wholesale Egg Calculator
 * Maxwell Phillips
 * 12 October 2017
 * A program to determine the cost of a whole lot of eggs.
 */
import java.util.Scanner;
import java.text.NumberFormat;
public class test4 {

	public static void main(String[] args) {
		//Declare variables
		double totalCost;
		int eggCount;
		int dozenCount;
		int extraCount;
		double pricePerDozen;
		
		NumberFormat money = NumberFormat.getCurrencyInstance();
		
		//Get input
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of eggs: ");
		eggCount = input.nextInt();
		input.close();
		
		//Determine dozens
		dozenCount = eggCount/12;
		//Determine extras
		extraCount = eggCount%12;
		
		//Determine pricePerDozen
		if (dozenCount > 0 && dozenCount < 4) {
			pricePerDozen = .5;
		} else if (dozenCount >= 4 && dozenCount < 6) {
			pricePerDozen = .45;
		} else if (dozenCount >= 6 && dozenCount < 11) {
			pricePerDozen = .4;
		} else if (dozenCount >= 11) {
			pricePerDozen = .35;
		} else {
			System.out.println("Please enter a valid number of eggs!");
			pricePerDozen = 0;
		}
		
		//Determine totalCost
		totalCost = (dozenCount * pricePerDozen)+(extraCount * (pricePerDozen/12));
		
		//Print totalCost
		System.out.println("The bill is equal to: " + money.format(totalCost));
	}

}
