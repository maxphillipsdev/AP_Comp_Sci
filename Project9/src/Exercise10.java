/**
 * Coder
 * @author Maxwell Phillips
 * 27 March 2018
 * A program to encode a string in modified unicode.
 */
import java.util.Scanner;
public class Exercise10 {

	public static void main(String[] args) {
		//variables
		String userInput;
		char[] chars;
		
		
		//Get input
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string: ");
		userInput = input.nextLine();
		input.close();
		//Convert to unicode
		chars = new char[userInput.length()];
		chars = userInput.toCharArray();
		
		System.out.println("Encoded message: ");
		for (char c : chars) {
			if (c != ' ') {
				c = (char) (c + 2);
			}
			System.out.print(c);
		}
	}

}
