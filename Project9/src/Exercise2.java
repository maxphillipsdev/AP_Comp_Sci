import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Generated Numbers
 * @author Maxwell Phillips
 * 25 March 2018
 * A program to generate a set of 101 numbers based on their index's digits.
 */
public class Exercise2 {

	public static void main(String[] args) {
	
	//Variables
	int[] nums = new int[102];
	int num = 0;
	int sum = 0;
	int remainder;
	
		for (int i = 0; i <= 101; i++) { //For item in the array...
			//Reset variables
			num = i + 1  ;
			sum = 0;
	        while (num > 0) {
	            sum = sum + num % 10;
	            num = num / 10;
	        }
			
			nums[i] = sum; //Set the array item as the generated number
			System.out.println("Index "+i+" : "+nums[i]);
		}

	}

}
