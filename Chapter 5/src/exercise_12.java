/**
 * Necklace
 * Maxwell Phillips
 * 5 November 2017
 * Creates a pretty necklace.
 */
import java.util.Scanner;
import java.lang.String;
public class exercise_12 {

	public static void main(String[] args) {
		//variables
		int num1;
		int num2;
		int num3;
		int endNum1;
		int endNum2;

		//Get input
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number from 1 to 9: ");
		num1 = input.nextInt();
		System.out.println("Enter another number from 1 to 9: ");
		num2 = input.nextInt();
		input.close();
				
		
		System.out.println("\n");
		
		System.out.print(num1+" ");
		System.out.print(num2+" ");

		endNum1 = num1;
		endNum2 = num2;
		
		do {
			
			num3 = (num1 + num2) % 10;
			num1 = num2;
			num2 = num3;
			System.out.print(num2+" ");
		} while (num1 != endNum1 || num2 != endNum2);
	}
}
