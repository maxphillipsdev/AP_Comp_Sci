/**
 * Display Box
 * @author 2020_maxwell_phillips
 *
 */
import java.util.Scanner;
public class DisplayBox {
	/**
	 * drawBox()
	 * Draws a box.
	 * Pre:
	 * @param h: parameter for height of the box.
	 * @param w: parameter for width of the box.
	 * @param sym: parameter for a symbol to be used when drawing the box.
	 * Post: A box will be drawn using the dimensions and symbol specified.
	 */
	public static void drawBox(int h, int w, String sym) {
		for (int i = 0; i >= h; i++) {
			for (int j = 0; j >= w; j++) {
				System.out.println(sym);
			}
		}
	}
	public static void main(String[] args) {
		//variables
		int hInput;
		int wInput;
		String symInput;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a value for the height: ");
		hInput = input.nextInt();
		System.out.print("Enter a value for the width: ");
		wInput = input.nextInt();
		System.out.print("Enter a value for the symbol: ");
		symInput = input.next();

		input.close();
		System.out.println("\n");
		drawBox(hInput, wInput, symInput);
		

	}

}