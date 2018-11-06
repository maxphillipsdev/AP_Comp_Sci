/**
 * Staff
 * @author Maxwell Phillips
 * 6 March 2018
 * Object representing a staff member at university.
 */
public class Staff extends UEmployee 
{
	//Variables
	private String title = "";
	
	public Staff(String name, double salary, String title) 
	{
		//Set up variables
		this.setName(name);
		this.setSalary(salary);
		this.setTitle(title);
		
	}
	
	/**
	 * getTitle()
	 * pre: none
	 * post: returns string title
	 */
	public String getTitle() 
	{
		return title;
	}
	
	/**
	 * setTitle()
	 * pre: string title
	 * post: changes value of title
	 */
	public void setTitle(String title) 
	{
		this.title = title;
	}
	
}
