//stages
import java.util.Scanner;
public class stages {

	public static void main(String[] args) {
		// Variables
		int age;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an age: ");
		age = input.nextInt();
		input.close();
		if (age <= 5) {
			System.out.println("Toddler");
		} else {
			if (age <= 10) {
			System.out.println("Child");
			} else {
				if (age <= 12) {
					System.out.println("Pre-teen");
				} else {
					if (age > 12 && age < 18) {
						System.out.println("Teen");
					} else {
						if (age > 18) {
							System.out.println("Adult");
						}
					}
				}
			}
		}
	}

}
