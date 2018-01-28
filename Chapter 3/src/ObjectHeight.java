/**
 * ObjectHeight.java
 * @author 2020_maxwell_phillips
 * 12 September 2017
 * Find the height of a dropped object at a 
 * given time during its decent.
 */
//Import thing-a-ma-bobs
import java.text.NumberFormat;
import java.util.Scanner;

public class ObjectHeight {

	public static void main(String[] args) {
		//Declare variables
		double height;
		double time;
		NumberFormat decimal = NumberFormat.getNumberInstance();
		
		//Open scanner and prompt user for time less than 4.5 seconds
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a time less than 4.5 seconds: ");
		time = input.nextFloat();
		
		//Close scanner
		input.close();
		
		//Calculate height of object h=100-4.9*t^2
		height = 100.0-4.9*Math.pow(time, 2.0);
		
		//Print the height of the object.
		System.out.println("The height of the object is: "+decimal.format(height)+" meters.");
		
	}

}
