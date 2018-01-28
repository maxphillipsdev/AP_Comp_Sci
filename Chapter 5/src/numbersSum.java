/**
 * numbersSums
 * @author 2020_maxwell_phillips
 *
 */
import java.util.Scanner;
public class numbersSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int userNum;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a value: ");
		userNum = input.nextInt();
		input.close();
		int i = 1;
		while (i <= userNum) {
			System.out.println(i);
			i++;
		}
	}

}
