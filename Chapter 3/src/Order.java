/**
 * Order.java
 * @author 2020_maxwell_phillips
 * 14 September 2017
 * Calculate the payment amount for a restraunt and the change needed.
 */
//Import Packages
import java.text.NumberFormat;
import java.util.Scanner;
public class Order {

	public static void main(String[] args) {
		//Declare variables
		double burger = 1.69;
		double fries = 1.09;
		double sodas = 0.99;

		double burgerNumber;
		double friesNumber;
		double sodasNumber;

		double totalBeforeTax;
		double tax;
		double finalTotal;

		double amountTendered;
		double change;

		NumberFormat money = NumberFormat.getCurrencyInstance();

		//Open scanner and prompt user for amount of each dish
		Scanner input = new Scanner(System.in);

		//Get dishes
		System.out.print("Enter the number of burgers: ");
		burgerNumber = input.nextDouble();
		System.out.print("\nEnter the number of fries: ");
		friesNumber = input.nextDouble();
		System.out.print("\nEnter the number of sodas: ");
		sodasNumber = input.nextDouble();

		//Calculate costs
		totalBeforeTax = burger*burgerNumber+fries*friesNumber+sodas*sodasNumber;
		tax = 6.5/100*totalBeforeTax;
		finalTotal = totalBeforeTax + tax;
		//Print the costs
		System.out.print("\nTotal before tax: "+money.format(totalBeforeTax));
		System.out.print("\nTax: "+money.format(tax));
		System.out.print("\nFinal Total: "+money.format(finalTotal));

		//Ask for amount tendered
		System.out.print("\nEnter amount tendered: ");
		amountTendered = input.nextDouble();
		//Calculate change and print it
		change = amountTendered - finalTotal;
		System.out.println("Change: "+money.format(change));
		//Close input stream
		input.close();

	}

}
