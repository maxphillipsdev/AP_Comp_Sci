/**
 * Pythagorean Triple
 * @author Maxwell Phillips
 * 5 Decmeber 2017
 * A program to display all pythag triples with values of A and B less than 100.
 */
public class Exercise6 {

	public static void main(String[] args) {
		//variables
		int a, b;
		int c = 0;
		int k = 2;
		
		//Calculate!
		while (c < 100) {
			for (int i = 1; i < k; ++i) {
				a = k*k - i*i;
				b = 2*i*k;
				c = k*k + i*i;
				
				if (c > 100) {
					break;
				}
				System.out.println(a +" "+ b +" "+ c);
				k++;
			}
		}
	}

}
