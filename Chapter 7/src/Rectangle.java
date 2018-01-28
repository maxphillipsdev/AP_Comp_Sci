public class Rectangle {
	
	//Member Variables
	private double length;
	private double width;
	
	/**
	 * constructor
	 * pre: none
	 * post: initialize the rectangle with a length and width of 1 each
	 */
	public Rectangle() {
		length = 1;
		width = 1;
	}

	/**
	 * constructor
	 * pre: double l for length and w for width
	 * post: initialize the rectangle with a length and width as set
	 */
	public Rectangle(double l, double w) {
		length = l;
		width = w;
	}
	
	/**
	 * get length
	 * pre: none
	 * post return the length of the rectangle
	 */
	public double getLength() {
		return(length);
	}
	
	/**
	 * get width
	 * pre: none
	 * post return the width of the rectangle
	 */
	public double getWidth() {
		return(width);
	}
	
	/**
	 * sets the length of the rectangle
	 * pre: double l is length
	 * post: sets the length to l
	 */
	public void setLength(double l) {
		length = l;
	}
	
	/**
	 * sets the width of the rectangle
	 * pre: double w is width
	 * post: sets the width to w
	 */
	public void setWidth(double w) {
		width = w;
	}
	/**
	 * prints the area formula for the shape
	 * pre: none
	 * post: prints formula to console
	 */
	public static void displayAreaFormula() {
		System.out.println("The area formula for a rectangle is A=l*w");
	}

}
