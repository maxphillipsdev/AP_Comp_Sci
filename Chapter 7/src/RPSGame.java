/**
 * Models a game of RPS
 */
 
import java.util.Random;
 
public class RPSGame {
	public static final int ROCK = 1, PAPER = 2, SCISSORS = 3;
	private int compThrow;
	private int playerWins = 0, computerWins = 0;
	
	/**
	 * constructor
	 * pre: none
	 * post: RPSGame object created. Computer throw generated.
	 */
	public RPSGame() {
	 	Random rand = new Random();
	 	
	 	compThrow = rand.nextInt(3) + 1;		//random integer between 1 and 3
	 	playerWins = 0;
	 	computerWins = 0;
	}
	

	/**
	 * Computer's throw is generated (1 for ROCK, 2 for PAPER, 3 for SCISSORS).
	 * pre: none
	 * post: Computer's throw generated.
	 */
	 public void makeCompThrow(){
	 	Random rand = new Random();
	 	
	 	compThrow = rand.nextInt(3) + 1;		//random integer between 1 and 3
	 }
	 
	 
	/** 
	 * Returns the computer's throw.
	 * pre: none
	 * post: Computer's throw has been returned.
	 */
	public int getCompThrow() {
		return(compThrow);
	}
	

	/**
	 * Determines the winner of the round.
	 * pre: playerThrow is the integer 1, 2, or 3.
	 * post: Displays a message indicating throws. Compares player's throw 
	 * to computer's throw and displays a message indicating the winner.
	 */
	 public void announceWinner(int playerThrow) {
	 	
		/* Inform player of throws */
		System.out.print("You throw ");
		switch (playerThrow) {
			case ROCK: System.out.println("ROCK."); break;
			case PAPER: System.out.println("PAPER."); break;
			case SCISSORS: System.out.println("SCISSORS."); break;
		}
		System.out.print("Computer throws ");
		switch (compThrow) {
			case ROCK: System.out.println("ROCK."); break;
			case PAPER: System.out.println("PAPER."); break;
			case SCISSORS: System.out.println("SCISSORS."); break;
		}

	 	/* Determine and annouce winner */
		if (playerThrow == ROCK && compThrow == ROCK) {
			System.out.println("It's a draw!");
		} else if (playerThrow == ROCK && compThrow == PAPER) {
			System.out.println("Computer wins!");
			computerWins += 1;
		} else if (playerThrow == ROCK && compThrow == SCISSORS) {
			System.out.println("You win!");
			playerWins += 1;
		}
		
		if (playerThrow == PAPER && compThrow == ROCK) {
			System.out.println("You win!");
			playerWins += 1;
		} else if (playerThrow == PAPER && compThrow == PAPER) {
			System.out.println("It's a draw!");
		} else if (playerThrow == PAPER && compThrow == SCISSORS) {
			System.out.println("Computer wins!");
			computerWins +=1;
		}

		if (playerThrow == SCISSORS && compThrow == ROCK) {
			System.out.println("Computer wins!");
			computerWins += 1;
		} else if (playerThrow == SCISSORS && compThrow == PAPER) {
			System.out.println("You win!");
			playerWins += 1;
		} else if (playerThrow == SCISSORS && compThrow == SCISSORS) {
			System.out.println("It's a draw!");
		}
	 }
		 

	/** 
	 * Displays the overall winner.
	 * pre: none
	 * post: Computer and player wins compared and 
	 * an overall winner announced.
	 */
	public void bigWinner() {
		if (computerWins > playerWins){
			System.out.println("Computer wins!");
		} else if (playerWins > computerWins){
			System.out.println("You win!");
		} else {
			System.out.println("It's a draw!");
		}
	}

}