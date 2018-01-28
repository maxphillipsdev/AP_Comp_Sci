//Random Num
import java.util.Scanner; 
import java.lang.Math;
public class randomNum {

	public static void main(String[] args) {
		// Variables
		int lowerRange;
		int upperRange;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter the lower range number: ");
		lowerRange = input.nextInt();
		System.out.print("\nPlease enter the upper range number: ");
		upperRange = input.nextInt();
		//Print
		System.out.println((upperRange - lowerRange + 1 )* Math.random() + lowerRange);
	}

}
