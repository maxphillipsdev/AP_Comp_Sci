/**
 * Time Converter
 * @author 2020_maxwell_phillips
 *
 */
import java.util.Scanner;
public class TimeConverter {

	public static void main(String[] args) {
		// variables
		int choice;
		int userInput;
		
		//Open Scanner
		Scanner input = new Scanner(System.in);
		//Get user choice
		System.out.print("HRS-MIN(0), DAYS-HRS(1), MIN-HRS(2), HRS-DAYS(3): ");
		choice = input.nextInt();
		System.out.println(choice);
		//Get user value
		System.out.println("Enter in a value: ");
		userInput = input.nextInt();
		
		input.close();
		
		//Perform conversion
		switch (choice) {
		case 0: hrsToMin(userInput); break;
		case 1: hrsToMin(userInput); break;
		case 2: hrsToMin(userInput); break;
		case 3: hrsToMin(userInput); break;
		}

	}
	public static void hrsToMin(int value) { //hrs-min
		System.out.println("The conversion from HRS-MIN is: "+(value*60) + " minutes.");
	}
	public static void daysToHrs(int value) { //days-hrs
		System.out.println("The conversion from DAYS-HRS is: "+(value*24) + " hours.");
	}
	public static void minToHrs(int value) { //min-hrs
		System.out.println("The conversion from MIN-HRS is: "+(value/60) + " hours.");
	}
	public static void hrsToDays(int value) { //hrs-days
		System.out.println("The conversion from HRS-DAYS is: "+(value/24) + " days.");
	}

}
