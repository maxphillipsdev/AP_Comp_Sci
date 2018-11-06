/**
 * Disk class.
 */
public class Disk extends Circle implements Comparable<Disk>{
	private double thickness;
		
	/**
	 * constructor
	 * pre: none
	 * post: A Disk object has been created with radius r
	 * and thickness t.
	 */
	public Disk(double r, double t) {
		super(r);
		thickness = t;
	}
	/**
	 * Interface for comparable
	 */
	public int compareTo(Disk obj) {
		
		if (this.thickness == obj.thickness && this.getRadius() == obj.getRadius()) {
			return 0;
		} else if ((this.thickness + this.getRadius()) > (obj.thickness+obj.getRadius())) {
			return 1;
		} else if ((this.thickness + this.getRadius()) < (obj.thickness+obj.getRadius())) {
			return -1;
		} else {
			return 0;
		}
	}


	/** 
	 * Changes the thickness of the disc.
	 * pre: none
	 * post: Thickness has been changed.
	 */
	public void setThickness(double newThickness) {
	 	thickness = newThickness;
	}


	/** 
	 * Returns the thickness of the disc.
	 * pre: none
	 * post: The thickness of the disc has been returned.
	 */
	public double getThickness() {
	 	return(thickness);
	}
	
	
	/**
	 * Returns the volume of the disc.
	 * pre: none
	 * post: The volume of the disc has been returned.
	 */
	public double volume() {
		double v;
		
		v = super.area() * thickness;
		return(v);
	}

	
	/** 
	 * Determines if the object is equal to another
	 * Disk object.
	 * pre: none
	 * post: true has been returned if the objects have 
	 * the same radii and thickness. false has 
	 * been returned otherwise.
	 */
	public boolean equals(Object obj) {
		Disk testObj = (Disk)obj;
		
	 	if (testObj.getRadius() == super.getRadius() && 
	 		testObj.getThickness() == thickness) {
			return(true);
		} else {
			return(false);
		}
	}


	/** 
	 * Returns a String that represents the Disk object.
	 * pre: none
	 * post: A string representing the Disk object has 
	 * been returned.
	 */
	public String toString() {
		String diskString;

		diskString = "The disk has radius " + super.getRadius() +
					 " and thickness " + thickness + ".";
	 	return(diskString);
	}
}