/**
 * MyPOW
 * Maxwell Phillips
 * 29 September 2017
 * A program to calculate and compare a power formula and the built in function.
 */
import java.lang.Math;
import java.util.Scanner;
public class MyPOW {

	public static void main(String[] args) {
		//variables
		double x;
		double y;
		double formResult;
		double otherResult;
		
		//get input
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a value for X: ");
		x = input.nextDouble();
		
		System.out.print("\nEnter a value for Y: ");
		y = input.nextDouble();
		input.close();
		//Calculate
		formResult = Math.exp((y*Math.log(x)));
		otherResult = Math.pow(x, y);
		
		System.out.println("The result from using the formula is: "+ formResult);
		System.out.println("The result from using Math pow() is: "+ otherResult);
		
		
	}

}
