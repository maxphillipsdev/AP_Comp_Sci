/*
 * Piggy Bank class
 * Maxwell Phillips
 * A class to represent a Piggy Bank
 */
public class PiggyBank {
	
	//Declare variables
	private int pennies = 0, nickels = 0, dimes = 0, quarters = 0;
	private double change = 0.00;

	/*
	 * Method to get the total change in the piggy bank
	 * Pre: none
	 * Post: double of the total change value
	 */
	public double getTotalChange() 
	{
		change = (pennies*.01)+(nickels*.05)+(dimes*.1)+(quarters*.25);
		return change;
	}
	
	/*
	 * Method to add a penny to the piggy bank
	 * Pre: none
	 * Post: Returns nothing, but adds another coin
	 */
	public void addPenny()
	{
		pennies++;
	}
	
	/*
	 * Method to add a nickel to the piggy bank
	 * Pre: none
	 * Post: Returns nothing, but adds another coin
	 */
	public void addNickel () 
	{
		nickels++;
	}
	
	/*
	 * Method to add a dime to the piggy bank
	 * Pre: none
	 * Post: Returns nothing, but adds another coin
	 */
	public void addDime() 
	{
		dimes++;
	}
	
	/*
	 * Method to add a quarter to the piggy bank
	 * Pre: none
	 * Post: Returns nothing, but adds another coin
	 */
	public void addQuarters() 
	{
		quarters++;
	}
	
	/*
	 * Empties the piggy bank
	 * Pre: none
	 * Post: resets all the coin values to 0 and resets the change as well
	 */
	public void emptyBank() 
	{
		pennies = 0;
		nickels = 0;
		dimes = 0;
		quarters = 0;
		change = 0.0;
	}
}
