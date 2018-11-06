/*
 * TestDisk.java
 * A simple application for testing the Disk class.
 * Lawrenceville Press
 * June 10, 2005
 */
 
 /**
  * The Disk class is tested.
  */
 public class TestDisk {

	public static void main(String[] args) {
		Disk saucer = new Disk(10, 0.02);
				
		System.out.println("Disk radius: " + saucer.getRadius());
		System.out.println("Disk surface area: " + saucer.area());
		System.out.println("Disk volume: " + saucer.volume());
		
		Disk plate1 = new Disk(12, 0.06);
		Disk plate2 = new Disk(12, 0.07);
		if (plate1.compareTo(plate2) == 0) {
			System.out.println("Objects are equal.");
		} else if (plate1.compareTo(plate2) == -1){
			System.out.println("Plate1 is less than Plate2.");
		} else if (plate1.compareTo(plate2) == 1) {
			System.out.println("Plate1 is greater than Plate2.");
		}
		System.out.println(plate1);
		System.out.println(plate2);
	}
}