/**
 * Pizza Cost Calculator
 * Maxwell Phillips
 * 26 September 2017
 * A program to calculate the cost of a pizza, dependent on it's diameter.
 */
//Import packages
import java.text.NumberFormat;
import java.util.Scanner;
public class test3 {

	public static void main(String[] args) {
		//Declare variables and NumberFormat
		double diameter;
		double totalCost;
		double materialCost;
		double rentCost = 1.00;
		double laborCost = 0.75;
		NumberFormat money = NumberFormat.getCurrencyInstance();
		
		//Get user input for diameter of pizza
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the diameter of the pizza in inches: ");
		diameter = input.nextDouble();
		input.close();
		
		//Calculate the cost of the pizza
		materialCost = .05 * diameter * diameter;
		totalCost = materialCost + rentCost + laborCost;
		
		//Print out the cost of the pizza
		System.out.println("The cost of making the pizza is: "+ money.format(totalCost));

	}

}
