/**
 * Package Check
 * Maxwell Phillips
 * 28 September 2017
 * A program to determine if a package of given dimentions meets the requriments for delivery
 */
import java.util.Scanner;
public class PackageCheck {
	public static void main(String[] args) {
	//Declare variables
		double weight;
		double size;
		double size_limit = 100000;
		double weight_limit = 27;
	
		double l;
		double w;
		double h;
	
		//Prompt
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter package weight in kilograms: ");
		weight = input.nextDouble();
		
		System.out.print("Enter package length in kilograms: ");
		l = input.nextDouble();

		System.out.print("Enter package width in kilograms: ");
		w = input.nextDouble();
		
		System.out.print("Enter package height in kilograms: ");
		h = input.nextDouble();
		
		//Calculate size
		size = l*w*h;
		
		//Check weights
		if (size > size_limit && weight > weight_limit) {
			System.out.println("Too large and too heavy!");
		} else {
			if (size > size_limit) {
				System.out.println("Too large!");
			}
			if (weight > weight_limit) {
				System.out.println("Too heavy!");
			}
			//Package okay
			if (size < size_limit && weight < weight_limit) {
				System.out.println("All good! Package is okay to ship.");
			}

		}
		
		input.close();
	}
	

}
