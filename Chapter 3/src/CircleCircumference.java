import java.util.Scanner;
import java.text.NumberFormat;
public class CircleCircumference {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double radius;
		final double pi = Math.PI;
		double result;
		NumberFormat decimal = NumberFormat.getNumberInstance();
		
		System.out.print("Please enter a value for the radius: ");
		radius = input.nextDouble();
		input.close();
		if (radius < 0) {
			System.out.println("Negative radii are illegal!");
		} else {
		result = 2.0*pi*radius;
		System.out.println("The circumference of the circle is: "+decimal.format(result));
		}
		
	}

}
