/**
 * 
 * @author 2020_maxwell_phillips
 *
 */
import java.util.Scanner;
import java.lang.Math;
import java.text.NumberFormat;
public class Exponentian {
	
	/**
	 * powerOf()
	 * returns a to the power of b.
	 * Pre:
	 * @param a: value for the base number.
	 * @param b: value for the exponent number.
	 * @return: returns the result.
	 * Post: Returns the result of a^b.
	 */
	public static double powerOf(double a, double b) {
		return(Math.pow(a, b));
	}
	public static void main(String[] args) {
		// variables
		double base;
		double power;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a base number: ");
		base = input.nextDouble();
		System.out.println("Enter a number as a power: ");
		power = input.nextDouble();
		input.close();
		
		NumberFormat num = NumberFormat.getNumberInstance();
		
		System.out.println("The result of "+base+" to the power of "+power+" is: "+num.format(powerOf(base,power)));

	}

}
