/**
 * Count Vowels
 * Maxwell Phillips
 * 6 November 2017
 * Counts the vowels.
 */
import java.util.Scanner;
import java.lang.String;

public class exercise20 {

	public static void main(String[] args) {
		//variables
		String inputString;
		int vowelNum = 0;
		char currentChar;
		char currentArrayChar;
		final char[] VOWELS = {'a','e','i','o','u'};
		//Get input
		Scanner input = new Scanner(System.in);
		System.out.print("Enter text: ");
		inputString = input.nextLine();
		inputString = inputString.trim();
		inputString = inputString.toLowerCase();
		input.close();

		//Find number of vowels
		for (int i = inputString.length() - 1; i >= 0; i--) {
			//Get current character
			currentChar = inputString.charAt(i);
			//For each vowel...
			for (int k = 0; k < VOWELS.length; k++) {
				//Get the current vowel
				currentArrayChar = VOWELS[k];
				//If the characters == the vowel
				if (currentChar == currentArrayChar) {
					//Increase vowelNum by 1
					vowelNum++;
				}
			}
		}
		System.out.println("The number of vowels in the phrase \""+inputString+"\" is "+vowelNum+".");
	}

}
