/**
 * Prime Numbers 1a
 * @author 2020_maxwell_phillips
 *
 */
import java.util.*;
import java.lang.Math;
public class exercise3a {

	public static void main(String[] args) {
		//variables and set hashmap
		int n;
		boolean isPrime = true;
		Map nums = new HashMap();
		
		//Get input
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer number: ");
		n = input.nextInt();
		input.close();
		
		//Fill hashmap
		for (int k = 2; k<n; k++) { //NOTE: Maybe l<n should be l<=n?
			nums.put(k, true);
		}
		for (int i = 2; i<=Math.sqrt(n); i++) {
			if ((boolean) nums.get(i) == true) {
				int l = 0;
				for (int j = (int) (Math.pow(i, 2)+l*i); j<=n;) {
					nums.put(j, false);
					isPrime = false;
				}
			}
		}
		
		if (isPrime == true) {
			System.out.println("Prime!");
		} else {
			System.out.println("Composite!");
		}

	}
}