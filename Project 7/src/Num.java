/**
 * Num Class
 * Maxwell Phillips
 * A class to take in and return information about an integer.
 */
public class Num
{
	//Number to be passed in
	private int number;
	
	/*
	 * Constructor
	 * pre: int n
	 * post: Num instance created. Stores int n
	 * can be used to call functions on n
	 */
	public Num(int n)
	{
		//store n
		number = n;
	}
	
	/*
	 * Method
	 * pre: none
	 * post: returns whole number
	 */
	public int getWholeNumber() 
	{
		return number;
		
	}
	
	/*
	 * Method
	 * pre: none
	 * post: returns ones place of number
	 */
	public int getOnesPlace()
	{
		return number % 10;
	}
	
	/*
	 * Method
	 * pre: none
	 * post: returns tens place of number
	 */
	public int getTensPlace()
	{
		return number % 100 / 10;
	}
	
	/*
	 * Method
	 * pre: none
	 * post: returns hundreds place of number
	 */
	public int getHundredsPlace()
	{
		return number % 100 / 100;
	}
}
