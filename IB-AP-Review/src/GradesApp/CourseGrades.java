package GradesApp;

import java.util.*;
public class CourseGrades {

	static GradeBook book;

	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		boolean keepRunning = true;
		book = new GradeBook();
		int selection;
		Scanner input = new Scanner(System.in);

		while (keepRunning == true) {
			
			System.out.println("Make a selection: \n0 = show grades, \n1 = get grades from user, \n2 = show test avg, \n3 = show student avg:  ");
			selection = input.nextInt();
			
			switch (selection) {
				case 0: book.showGrades(); break;
				case 1: book.getGrades(); break;
				case 2: System.out.println("Test ID (1-4): "); System.out.println("test avg is: "+book.testAvg(input.nextInt())); break;
				case 3: System.out.println("Student ID (0-11): "); System.out.println("student avg is: "+book.studentAvg(input.nextInt())); break;
			}
		}
		
	}
 
}
