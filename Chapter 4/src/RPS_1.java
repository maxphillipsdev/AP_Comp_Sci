/*
 * RPS.java from Chapter 4
 * Chapter 4 Case Study
 * Lawrenceville Press
 * August 21, 2011
 */

 import java.util.Scanner;
 import java.lang.Math;

 /**
 * Plays Rock Paper Scissors against one player.
 */
 public class RPS_1 {

	public static void main(String[] args) {
		final int ROCK = 1, PAPER = 2, SCISSORS = 3;
		int playerThrow, computerThrow;
		Scanner input = new Scanner(System.in);

		/* prompt player for throw and read number typed */
		System.out.print("Enter your throw (1=Rock, 2=Paper, 3=Scissors): ");
		playerThrow = input.nextInt();
		input.close();

		/* Generate computer throw */
		computerThrow = (int)(3 * Math.random() + 1);	/* random int between 1 and 3 */

		/* Inform player of throws */
		System.out.print("Player throws ");
		switch (playerThrow) {
			case ROCK: System.out.println("ROCK."); break;
			case PAPER: System.out.println("PAPER."); break;
			case SCISSORS: System.out.println("SCISSORS."); break;
		}
		System.out.print("Computer throws ");
		switch (computerThrow) {
			case ROCK: System.out.println("ROCK."); break;
			case PAPER: System.out.println("PAPER."); break;
			case SCISSORS: System.out.println("SCISSORS."); break;
		}

		/* Determine winner */
		if (playerThrow == ROCK && computerThrow == ROCK) {
			System.out.println("It's a draw!");
		} else if (playerThrow == ROCK && computerThrow == PAPER) {
			System.out.println("Computer wins!");
		} else if (playerThrow == ROCK && computerThrow == SCISSORS) {
			System.out.println("Player wins!");
		}

		if (playerThrow == PAPER && computerThrow == ROCK) {
			System.out.println("Player wins!");
		} else if (playerThrow == PAPER && computerThrow == PAPER) {
			System.out.println("It's a draw!");
		} else if (playerThrow == PAPER && computerThrow == SCISSORS) {
			System.out.println("Computer wins!");
		}

		if (playerThrow == SCISSORS && computerThrow == ROCK) {
			System.out.println("Computer wins!");
		} else if (playerThrow == SCISSORS && computerThrow == PAPER) {
			System.out.println("Player wins!");
		} else if (playerThrow == SCISSORS && computerThrow == SCISSORS) {
			System.out.println("It's a draw!");
		}
	}
}
