/*
 * University.java
 * Chapter 8 Exercise 1
 * Lawrenceville Press
 * June 24, 2011
 */

 import java.util.Scanner;

 /**
  * An application to test the UEmployee, Faculty, and Staff classes.
  */
 public class University {

	/* Returns a selected instrument.
	 * pre: none
	 * post: An instrument object has been returned.
	 */
	public static UEmployee assignEmployee() {
		String empStatus, name, dept, title;
		String response, ignore;
		Double salary;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the employee's first and last name: ");
		name = input.nextLine();
		System.out.print("Enter the employee's salary: ");
		salary = input.nextDouble();
		ignore = input.nextLine();	//needed after reading a numeric
		System.out.print("Is the employee faculty or staff (F/S)? ");
		response = input.nextLine();
		if (response.equalsIgnoreCase("F")) {
			System.out.print("Enter the employee's department: ");
			dept = input.nextLine();
			return(new Faculty(name, salary, dept));
		} else {
			System.out.print("Enter the employee's title: ");
			title = input.nextLine();
			return(new Staff(name, salary, title));
		}
	}


	public static void main(String[] args) {
		UEmployee emp1, emp2, emp3;
		Scanner input = new Scanner(System.in);

		/* create employees */
		emp1 = assignEmployee();
		emp2 = assignEmployee();
		emp3 = assignEmployee();
		System.out.println("University employees:");
		System.out.println(emp1);
		System.out.println(emp2);
		System.out.println(emp3);
		input.close();
	}
}