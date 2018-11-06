/**
 * Food Class
 * Maxwell Phillips
 * 1 March 2018
 * A class to represent a food object
 */
public class Food {
	
	//Declare local variables
	String name;
	double price;
	int fat,carbs,fiber;
	
	/**
	 * Constructor
	 * Pre: String name, double price, int fat, int carbs, int fiber
	 * Post: Initializes a food object instance with passed parameters
	 */
	public Food(String name, double price, int fat, int carbs, int fiber){
		this.name = name;
		this.price = price;
		this.fat = fat;
		this.carbs = carbs;
		this.fiber = fiber;
	}
	
	/*
	 * getPrice method
	 * Pre: none
	 * Post: returns double for price of food instance
	 */
	public double getPrice() {
		return price;
	}
	
	/*
	 * getNutritionalInfo method
	 * Pre: none
	 * Post: returns string of nutritional info for food instance
	 */
	public String getNutritionalInfo() {
		return "Each "+name+" has "+fat+"g of fat, "+carbs+"g of carbs, and "+fiber+"g of fiber.";
	}
}
