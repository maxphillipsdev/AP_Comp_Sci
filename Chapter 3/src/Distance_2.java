/**
 * 
 * @author 2020_maxwell_phillips
 *
 */
import java.util.Scanner;

public class Distance_2 {
	public static void main(String[] args) {
		
		// Declare Variables
		double firstSegment;
		double secondSegment;
		double thirdSegment;
		
		Scanner input = new Scanner(System.in);
		
		//Get input from user
		System.out.print("Please enter the length of the first segment: ");
		firstSegment = input.nextDouble();
		System.out.print("Please enter the length of the second segment: ");
		secondSegment = input.nextDouble();
		System.out.print("Please enter the length of the third segment: ");
		thirdSegment = input.nextDouble();
		// Calculate total distance
		double distance = firstSegment + secondSegment + thirdSegment;
		
		// Print total distance
		System.out.print("The total distance of the three segment was: " + distance);	
	}

}
