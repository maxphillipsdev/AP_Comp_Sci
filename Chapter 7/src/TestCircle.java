public class TestCircle {

	public static void main(String[] args) {
		
		Circle spot = new Circle();
		
		//System.out.println(spot.getRadius()); //Get the radius upon instantiation.
		
		spot.setRadius(3); //Change the value of the radius to 5.

		
		System.out.println ("Circle radius: " + spot.getRadius());
		System.out.println("Circle circumference: " + spot.circumference());
		

	}

}
