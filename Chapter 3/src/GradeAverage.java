/**
 * Grade Average
 * @author 2020_maxwell_phillips
 *
 */
import java.util.Scanner;
import java.text.NumberFormat;
public class GradeAverage {
	public static void main(String[] args) {
		//Declare Variables
		
		/**
		int gradeOne;
		int gradeTwo;
		int gradeThree;
		int gradeFour;
		int gradeFive;
		*/
		
		int totalGrade = 0;
		double average;
		NumberFormat percent = NumberFormat.getPercentInstance();
		//Open Scanner
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter the first grade: ");
		totalGrade += input.nextInt();
		System.out.println("The total grade enter so far is: "+totalGrade);
		System.out.println("Please enter the second grade: ");
		totalGrade += input.nextInt();
		System.out.println("The total grade enter so far is: "+totalGrade);
		System.out.println("Please enter the third grade: ");
		totalGrade += input.nextInt();
		System.out.println("The total grade enter so far is: "+totalGrade);
		System.out.println("Please enter the four grade: ");
		totalGrade += input.nextInt();
		System.out.println("The total grade enter so far is: "+totalGrade);
		System.out.println("Please enter the fifth grade: ");
		totalGrade += input.nextInt();
		System.out.println("The total grade enter so far is: "+totalGrade);
		//Close Scanner
		input.close();
		
		//Calculate average
		
		//average = (double)gradeOne + (double)gradeTwo + (double)gradeThree + (double)gradeFour + (double)gradeFive;
		average = totalGrade/5.0;
		
		//Print average
		System.out.println("The average of the grades is: " + percent.format(average/100));
	}

}
