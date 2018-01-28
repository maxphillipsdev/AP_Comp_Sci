/**
 * Account Setup
 * @author 2020_maxwell_phillips
 *
 */
import java.lang.String;
import java.util.Scanner;
public class accountSetup {

	public static void main(String[] args) {
		// variables
		String username;
		String password = "";
		int passLength = 0;
		
		//open scanner and get input
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a user name: ");
		username = input.nextLine();
		
		while (passLength < 8) {
			System.out.println("Enter a password that is at least 8 characters: ");
			password = input.nextLine();
			passLength = password.length();
		}
		
		input.close();
		
		//convert to lowercase
		username = username.toLowerCase();
		password = password.toLowerCase();
		
		System.out.println("Your user name is "+username+" and your password is "+password);
	}

}
