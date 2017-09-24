//Perfect Square
import java.util.Scanner;
import java.lang.Math;
public class PerfectSquare {

	public static void main(String[] args) {
		//Variables
		int userInt;
		double result;
		double initValue;
		//Input
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter a integer: ");
		userInt = input.nextInt();
		//Calculate
		initValue = (double)userInt;
		result = Math.sqrt((double)userInt);
		result = Math.pow(result, 2.0);
		if(result == initValue) {
			System.out.println("Perfect Square!");
		} else {
			System.out.println("Not a very perfect square!");
		}
	}

}
