/**
 * TrigFunctions
 * Maxwell Phillips
 * 2 October 2017
 * It finds some trig functions and shows them.
 */
import java.lang.Math;
import java.util.Scanner;
import java.text.NumberFormat;
public class TrigFunctions {

	public static void main(String[] args) {
		// variables
		double siney;
		double cosiney;
		double tagenty;
		double angleDegree;
		double angleRadians;

		//Prompt for input
		Scanner input = new Scanner(System.in);
		NumberFormat number = NumberFormat.getNumberInstance();
		System.out.print("Enter an angle in degrees please: ");
		angleDegree = input.nextDouble();
		input.close();

		//Calculate things
		angleRadians = Math.toRadians(angleDegree);
		siney = Math.sin(angleRadians);
		cosiney = Math.cos(angleRadians);
		tagenty = Math.tan(angleRadians);

		//Display things
		System.out.println("Sine: " + number.format(siney));
		System.out.println("Cos: " + number.format(cosiney));
		System.out.println("Tan: " + number.format(tagenty));

	}
}
