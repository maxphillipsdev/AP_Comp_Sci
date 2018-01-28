/**
 * MathTutor
 * Maxwell Phillips
 * 28 September 2017
 * A program to act as a random number generating math tutor.
 */

 import java.util.Scanner;
 import java.lang.Math;

public class MathTutor {
	public static void main(String[] args) {
		//variables
		int userAnswer;
		int answer;
		int num1 = (int) ((10 - 1 + 1) * Math.random() + 1);
		int num2 = (int) ((10 - 1 + 1) * Math.random() + 1);
		int operator = (int) ((3 - 0 + 1) * Math.random());
		Scanner input = new Scanner(System.in);
		// addition
		if (operator == 0) {
			System.out.print("What is " + num1 + "+" + num2 + "?\n");
			userAnswer = input.nextInt();
			//Calculate answer
			answer = num1 + num2;
			if (userAnswer == answer){
				System.out.println("Correct!");
			} else {
				System.out.println("Incorrect!");
			}
		}

		// subtraction
		if (operator == 1) {
			System.out.print("What is " + num1 + "-" + num2 + "?\n");
			userAnswer = input.nextInt();
			//Calculate answer
			answer = num1 - num2;
			if (userAnswer == answer){
				System.out.println("Correct!");
			} else {
				System.out.println("Incorrect!");
			}
		}

		// multiplication
		if (operator == 2) {
			System.out.print("What is " + num1 + "*" + num2 + "?\n");
			userAnswer = input.nextInt();
			//Calculate answer
			answer = num1 * num2;
			if (userAnswer == answer){
				System.out.println("Correct!");
			} else {
				System.out.println("Incorrect!");
			}
		}

		// division
		if (operator == 3) {
			System.out.print("What is " + num1 + "/" + num2 + "?\n");
			userAnswer = input.nextInt();
			//Calculate answer
			answer = num1 / num2;
			if (userAnswer == answer){
				System.out.println("Correct!");
			} else {
				System.out.println("Incorrect!");
			}
		}
		input.close();
	}

}
