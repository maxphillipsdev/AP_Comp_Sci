package GradesApp;

/**
 * 
 */

import java.util.*;
public class GradeBook {
	
	Random r = new Random();
	private static int[][] grades = new int[12][5];
	Scanner input = new Scanner(System.in);
	public GradeBook() {
		
		
		
			for (int k = 0; k < grades[0].length; k++) {
				grades[0][k] = k;
			
		
		//Randomize the grades
		for (int i = 1; i < grades.length; i++) {
			
			grades[i][0] = i;
			
			
			
			for (int j = 1; j < grades[i].length; j++) {
				grades[i][j] = r.nextInt(100 - 0 + 1);
			}
		}
			}
	}
	
	public void showGrades() {
		for (int i = 0; i < grades.length; i++) {
			for (int j = 0; j < grades[i].length; j++) {
				System.out.print(grades[i][j]+", ");
			}
			System.out.print("\n");
		}
		
	}
	
	public void getGrades() {
		for (int i = 1; i < grades.length; i++) {
			for (int j = 1; j < grades[i].length; j++) {
				System.out.print("Enter grade: ");
				grades[i][j] = input.nextInt();
			}
			System.out.print("\n");
		}
		
	}
		
	
	public int studentAvg(int studentID) {
		int avgGrade = 0;
	//	for (int i = 0; i < grades.length; i++) {
			for (int k = 1; k < grades[studentID].length; k++) {
				avgGrade += grades[studentID][k];
			}
			avgGrade /= grades[studentID].length;
	//	}
		
		return avgGrade;
	}
	
	public int testAvg(int testID) {
		int avgGrade = 0;
		for (int i = 1; i < grades[testID].length; i++) {
			for (int k = 1; k < grades[1].length; k++) {
				avgGrade += grades[testID][k];
			}
		}
		
		return (int)(avgGrade * (.01*grades[1].length));
	}
	
	
	
	
}
