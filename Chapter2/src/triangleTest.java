
/**
 * triangleTest.java
 * @author 2020_maxwell_phillips
 * AP Computer Science
 * 1 September 2017
 */
public class triangleTest {

	/**
	 * Algorithm:
	 * 1. Format() print the top line
	 * 2. Use println() to make a new line
	 * With each row, bring the first line closer 
	 * to the edge by 1 space and the other line further away by 2 spaces
	 * 3. Repeat this for each of the rows
	 * 4. On the final row, print five lines, the first with a spacing of 4 spaces 
	 * and the rest with just one space.
	 */
	public static void main(String[] args) {
		System.out.format("%8s","|");
		System.out.println("");
		System.out.format("%7s %1s","|","|");
		System.out.println("");
		System.out.format("%6s %3s","|","|");
		System.out.println("");
		System.out.format("%5s %5s","|","|");
		System.out.println("");
		System.out.format("%4s %1s %1s %1s %1s","|","|","|","|","|");



	}

}
