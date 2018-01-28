/**
 * Grade
 * Maxwell Phillips
 * 28 September 2017
 * A program to determine the letter grade of a certain score.
 */
import java.util.Scanner;
public class Grade {

	public static void main(String[] args) {
		//variable
		int percentage;

		//input
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the percentage: ");
		percentage = input.nextInt();
		input.close();
		
		//Calculate and print results
		if (percentage >= 90){
			System.out.println("The corresponding letter grade is: A");
		}
		if (percentage >= 80 && percentage <= 89){
			System.out.println("The corresponding letter grade is: B");
		}
		if (percentage >= 70 && percentage <= 79){
			System.out.println("The corresponding letter grade is: C");
		}
		if (percentage >= 60 && percentage <= 69){
			System.out.println("The corresponding letter grade is: D");
		}
		if (percentage <=  59){
			System.out.println("The corresponding letter grade is: F");
		}
	}

}
