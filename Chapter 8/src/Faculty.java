/**
 * Faculty
 * @author Maxwell Phillips
 * 6 March 2018
 * Object representing a faculty member at university.
 */
public class Faculty extends UEmployee 
{
	//Variables
	private String dept = "";
	
	public Faculty(String name, double salary, String dept) 
	{
		//Set up variables
		this.setName(name);
		this.setSalary(salary);
		this.setDept(dept);
		
	}
	
	/**
	 * getDept()
	 * pre: none
	 * post: returns string dept
	 */
	public String getDept() 
	{
		return dept;
	}
	
	/**
	 * setDept()
	 * pre: string dept
	 * post: changes value of dept
	 */
	public void setDept(String dept) 
	{
		this.dept = dept;
	}
	

}
