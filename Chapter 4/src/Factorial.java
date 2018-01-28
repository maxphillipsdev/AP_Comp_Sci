/**
 * Factorial
 * @author 2020_maxwell_phillips
 *
 */
import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		// variables
		int userInput;
		int result = 1;
		//get input
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a integer: ");
		userInput = input.nextInt();
		input.close();
		
		//calculate factorial
		for (int i = 1; i <= userInput; i++) {
			result = result*i;
			//System.out.println(result);

		}
		//Print factorial
		System.out.println("The factorial is: "+result);
	}

}
