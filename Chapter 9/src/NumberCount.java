import java.util.Scanner;
import org.apache.commons.lang3.StringUtils;
public class NumberCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String num;
		int[] occurances;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number: ");
		num = input.next();
				
		for (char c : num.toCharArray()) {
			int count = StringUtils.countMatches(num, c);
		}
		System.out.println((int)c+" : "+count);
	}

}
