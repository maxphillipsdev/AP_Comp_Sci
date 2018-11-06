/**
 * UEmployee
 * @author Maxwell Phillips
 * 6 March 2018
 * Object representing a university employee
 */

public class UEmployee 
{
	//Variables
	private String name = "";
	private double salary = 0.0;
	
	/**
	 * getName()
	 * pre: none
	 * post: returns string name
	 */
	public String getName() 
	{
		return name;
	}
	
	/**
	 * setName()
	 * pre: string name
	 * post: changes value of name
	 */
	public void setName(String name) 
	{
		this.name = name;
	}
	
	/**
	 * getSalary()
	 * pre: none
	 * post: returns double salary
	 */
	public double getSalary() 
	{
		return salary;
	}
	
	/**
	 * setSalary()
	 * pre: double salary
	 * post: changes value of salary
	 */
	public void setSalary(double salary) 
	{
		this.salary = salary;
	}
}
