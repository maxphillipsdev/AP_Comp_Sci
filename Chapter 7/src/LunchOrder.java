/**
 * Lunch Order
 * Maxwell Phillips
 * 1 March 2018
 * Gets a lunch order
 */
import java.util.Scanner;
import java.text.NumberFormat;
public class LunchOrder {

	public static void main(String[] args) {
		//Variables
		double totalCost = 0;
		int userInput = 0;
		
		//Init objects
		Scanner input = new Scanner(System.in);
		NumberFormat money = NumberFormat.getCurrencyInstance();
		
		Food hamburger = new Food("hamburgers", 1.85,9,33,1);
		Food salad = new Food("salads", 2.00,1,11,5);
		Food frenchFries = new Food("french fries", 1.30,11,36,4);
		Food soda = new Food("sodas", 0.95,0,38,0);

		//Iterate over all the food objects
		Food[] foods = {hamburger, salad, frenchFries, soda}; //List of foods
		
		for (Food f : foods) { //for each food f in foods
			
			System.out.print("\nEnter number of "+f.name+": "); //Ask for user input
			userInput = input.nextInt();
			
			System.out.print("\n"+f.getNutritionalInfo()); //Print nutrition info
			totalCost += (userInput * f.getPrice()); //Add price to total cost
			System.out.println(totalCost);
			
		}
		//Print total cost
		System.out.print("\nYou order comes to: "+money.format(totalCost));
		input.close();

	}

}
