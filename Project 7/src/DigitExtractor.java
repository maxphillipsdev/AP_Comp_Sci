/*
 * Digit Extractor
 * Maxwell Phillips
 * Extracts digits from a number entered by the user.
 */
import java.util.Scanner;
public class DigitExtractor
{

	public static void main(String[] args)
	{
		//Declare variables
		int userInput;
		String userChoice = "";
		
		//Get input
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer number: ");
		userInput = input.nextInt();
		
		Num numClass = new Num(userInput); //Instantiate Num object
		
		//Start input loop
		while (userChoice != "Q")
		{
			System.out.println("show (W)hole number.");
			System.out.println("show (O)nes place.");
			System.out.println("show (T)ens place.");
			System.out.println("show (H)undreds place.");
			System.out.println("(Q)uit.");
			
			System.out.println("Enter your choice: ");
			userChoice = input.next();
			
			//Determine user choice
			switch (userChoice)
			{
			case "W": System.out.println("The whole number is: " + numClass.getWholeNumber()); break;
			case "O": System.out.println("The ones place is: " + numClass.getOnesPlace()); break;
			case "T": System.out.println("The tens place is: " + numClass.getTensPlace()); break;
			case "H": System.out.println("The hundreds place is: " + numClass.getHundredsPlace()); break;
			case "Q": userChoice = "Q";
			}
			System.out.println(""); //Empty line
		}

	}

}
