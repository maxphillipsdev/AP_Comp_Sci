/**
* Formal Greeting
* Maxwell Phillips
* 29 October 2017
* Makes a neat greeting that is rather formal.
 */
import java.lang.String;
import java.util.Scanner;
public class FormalGreeting {

	public static void main(String[] args) {
		//Declare variables
		String userInput;
		String name;
		String prefix = "";
		int seperatorIndex;
		int length;
		
		//Get input
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter your name with a prefix of Mr/Ms/Mrs/Miss: ");
		userInput = input.next();
		input.close();
		
		//Seperate parts of name
		userInput = userInput.trim();
		//Get length
		length = userInput.length();
		//Find full stop
		seperatorIndex = userInput.indexOf(".");
		//Check if the point was found, if so seperate out the name's prefix
		if (seperatorIndex != -1) {
			prefix = userInput.substring(0,seperatorIndex);
			}
		//Seperate out the actual name
		name = userInput.substring(seperatorIndex + 1, length);
		//Trim empty space
		name = name.trim();
		prefix = prefix.trim();
				
		//Say hello
		switch (prefix) {
			case "Mr": System.out.println("Hello, sir."); break;
			case "Ms": System.out.println("Hello, ma'am."); break;
			case "Mrs": System.out.println("Hello, ma'am."); break;
			case "Miss": System.out.println("Hello, ma'am."); break;
			case "": System.out.println("Hello, " + name + "."); break;
		}
		
	}

}
