import java.util.Scanner;
public class NumDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int userInput;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		userInput = input.nextInt();
		input.close();
		
		System.out.println(numDigits(userInput/10));
	}
	
	public static int numDigits(int n) {
		if (n == 0) {
			return 1;
		} else {
			return numDigits(n/10) + 1;
		}
	}

}
