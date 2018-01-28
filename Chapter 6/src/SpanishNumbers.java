/**
 * Spanish Numbers
 * @author 2020_maxwell_phillips
 *
 */
import java.util.Scanner;
public class SpanishNumbers {
	
	/**
	 * displayNum()
	 * Displays the translation of a number into Spanish.
	 * Pre:
	 * @param num: parameter for the number to translate.
	 * Post: Returns a string of the Spanish name for the number.
	 */
	public static String displayNum(int num) {
		String result = "";
		switch (num) {
		case 1: result = ("uno"); break;
		case 2: result = ("dos"); break;
		case 3: result = ("tres"); break;
		case 4: result = ("cuartro"); break;
		case 5: result = ("cinco"); break;
		case 6: result = ("seis"); break;
		case 7: result = ("siete"); break;
		case 8: result = ("ocho"); break;
		case 9: result = ("nueve"); break;
		case 10: result = ("diez"); break;
		}
		return result;
	}
	
	public static void main(String[] args) {
		//Variables
		int userInput;

		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number that you wish to be translated: ");
		userInput = input.nextInt();
		input.close();

		System.out.println("The translation is: "+displayNum(userInput));
	}

}
