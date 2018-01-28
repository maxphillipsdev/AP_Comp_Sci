//Hurricane
import java.util.Scanner;
public class Hurricane {

	public static void main(String[] args) {
		// variables
		int cat;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter a category of hurricane: ");
		cat = input.nextInt();
		input.close();
		System.out.println("Wind Speeds(mph, kt, km/hr):\n");
		switch (cat) {
		case 1: System.out.println("74-95mph, 64-82kt, 119-153km/hr"); break;
		case 2: System.out.println("96-110mph, 83-95kt, 154-177km/hr"); break;
		case 3: System.out.println("111-130mph, 96-113kt, 178-209km/hr"); break;
		case 4: System.out.println("131-155mph, 114-135kt, 210-249km/hr"); break;
		case 5: System.out.println("Greater than 155mph, 135kt, or 249km/hr"); break;

		}
	}

}
