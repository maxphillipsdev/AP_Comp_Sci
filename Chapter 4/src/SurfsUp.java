//SurfsUp
import java.util.Scanner;
public class SurfsUp {

	public static void main(String[] args) {
		// Variables
		int waveHeight;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter wave height: ");
		waveHeight = input.nextInt();
		input.close();
		if (waveHeight >= 6) {
			System.out.println("Great day for surfing!");
		}
		if (waveHeight >= 3 && waveHeight <= 6) {
			System.out.println("Go body boarding!");
		}
		if (waveHeight <= 3 && waveHeight >= 0) {
			System.out.println("Go for a swim!");

		}
	}

}
