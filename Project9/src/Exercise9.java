/**
 * Count Consonants
 * @author Maxwell Phillips
 * 27 March 2018
 * A program to count the consonants in a string.
 */
import java.util.Scanner;
import java.lang.String;
public class Exercise9 {

	public static void main(String[] args) {
		//Variables
		String userInput;
		final char[] cons = {'B', 'C', 'D', 'F', 'G', 'H', 'J', 'K', 'L', 'M', 'N', 'P', 'Q', 'R', 'S', 'T', 'V', 'X', 'Z', 'Y', 'W'};		
		int totalCons = 0;
		
		//Get input
		Scanner input = new Scanner(System.in);
		System.out.print("Enter text: ");
		userInput = input.nextLine();
		input.close();
		
		//Count consonants
		userInput = userInput.trim(); // Trims it
		userInput = userInput.toUpperCase(); //Sets to upper case
		//System.out.println("-"+userInput);
		for (char s : userInput.toCharArray()) { //For each char in the input
			//System.out.println("--Processing "+s+"...");
			for (char c : cons) { //Iterate over all the consonants
				if (s == c) { //If the current char is a match/consonant
					//System.out.println("----"+s+" is a match to "+c);
					totalCons++;
					break;
				}
			}
		}
		System.out.println("The number of consonants in your string is: "+totalCons); //Print result
	}

}
