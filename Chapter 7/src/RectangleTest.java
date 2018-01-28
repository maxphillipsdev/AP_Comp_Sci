import java.util.Scanner;
public class RectangleTest {

	public static void main(String[] args) {
		
		double length;
		double width;
		Scanner input = new Scanner(System.in); //open input stream
		
		//Get values
		System.out.println("length: ");
		length = input.nextDouble();
		System.out.println("width: ");
		width = input.nextDouble();
		input.close();
		
		Rectangle rectangleOne = new Rectangle(length, width);
		Rectangle rectangleTwo = new Rectangle();

	}

}
