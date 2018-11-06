/**
 * EvenAndOdds
 * @author Maxwell Phillips
 * 16 April 2018
 * AP Computer Science
 */
import java.lang.Math;
public class Test {

	public static void main(String[] args) {
		// variables
		int[] nums = new int[20];
		
		//Populate array with the random numbers from 0 to 99
		for (int i = 0; i < nums.length; i++) {
			nums[i] = (int) ((99 + 1)*Math.random() + 1);
		}
		
		//List odds
		System.out.print("ODD:\n");
		for (int num : nums) {
			if (num % 2 != 0) {
				System.out.print(" "+num+" ");
			}
		}
		
		//List evens
		System.out.print("\nEVEN:\n");
		for (int num : nums) {
			if (num % 2 == 0) {
				System.out.print(" "+num+" ");
			}
		}

	}

}
