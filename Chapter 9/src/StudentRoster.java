import java.util.Scanner;
public class StudentRoster {

	public static void main(String[] args) {
		
		String[] students;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number of students: ");
		students = new String[input.nextInt()];
		
		for (int i = 1; i <= students.length; i++) {
			System.out.println("Enter a name: ");
			students[i] = input.next();
		}
		System.out.println(students.toString());
		input.close();
	}

}
