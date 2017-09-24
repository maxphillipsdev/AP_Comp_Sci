/**
 * Sleep.java
 * @author 2020_maxwell_phillips
 * 14 September 2017
 * Calculate the number of hours of your life that have been spent sleeping.
 */
//Import Packages
import java.text.NumberFormat;
import java.util.Scanner;
public class Sleep {
	public static void main(String[] args) {
		//Declare variables
		int birthYear;
		int birthMonth;
		int birthDay;

		int todayYear;
		int todayMonth;
		int todayDay;

		int daysAlive;
		int hrsSlept;

		NumberFormat integer = NumberFormat.getNumberInstance();

		//Open scanner and prompt user for birth date
		Scanner input = new Scanner(System.in);

		//Get birth date
		System.out.println("Enter your birthdate: ");
		System.out.println("Year: ");
		birthYear = input.nextInt();
		System.out.println("Month: ");
		birthMonth = input.nextInt();
		System.out.println("Day: ");
		birthDay = input.nextInt();

		//Get today's date
		System.out.println("Enter today's date: ");
		System.out.println("Year: ");
		todayYear = input.nextInt();
		System.out.println("Month: ");
		todayMonth = input.nextInt();
		System.out.println("Day: ");
		todayDay = input.nextInt();
		//Close scanner
		input.close();

		//Calculate nights slept
		daysAlive = 365*(todayYear-birthYear)+30*(todayMonth-birthMonth)+(todayDay-birthDay);
		//Calculate hours slept
		hrsSlept = daysAlive * 8;

		//Print the days alive and hrs slept
		System.out.println("You have been alive for "+integer.format(daysAlive)+" days.");
		System.out.println("You have been asleept for "+integer.format(hrsSlept)+" hours.");

	}

}
