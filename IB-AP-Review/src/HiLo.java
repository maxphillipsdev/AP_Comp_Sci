/**
 * HiLo main class
 * @author Maxwell Phillips
 *
 */
import java.util.Scanner;
import java.util.Random;
public class HiLo {

	public static void main(String[] args) {
				
		Scanner input = new Scanner(System.in);
		int currentPoints = 1000;
		boolean playing = true;
		int bet;
		int choice;
		int value;
		
		
		while (playing == true) {
			
			//Print instructions
			System.out.print("\n---High Low Game---");
			System.out.println("\n");
			System.out.println("Numbers 1 through 6 are low.\nNumbers 7 through 13 are high.\nYou have "+currentPoints+" points.");
			System.out.println("\nEnter points to risk: ");
			
			bet = input.nextInt(); //Store bet
			
			if (bet > currentPoints) {
				System.out.println("You have insufficent points to do that!");
				break;
			}
			
			System.out.println("\nPredict (1=High, 0=Low) : ");
			choice = input.nextInt();
			
			Random r = new Random();
			value = r.nextInt((13-1)+1)+1;
			System.out.println("Number is "+value);
			if (value >= 1 && value <= 6) {
				if (choice == 0) {
					System.out.println("You win!");
					currentPoints = bet * 2;
				} else if (choice == 1){
					System.out.println("You lose.");
					currentPoints -= bet;
				}
			}
			if (value >= 8 && value <= 13) {
				if (choice == 1) {
					System.out.println("You win!");
					currentPoints += bet * 2;
				} else  if (choice == 0){
					System.out.println("You lose.");
					currentPoints -= bet;
				}
			}
			if (value == 7) {
				System.out.println("You lose.");
				currentPoints -= bet;
				
			}
			if (currentPoints <= 0) {
				System.out.println("You are out of points!");
				System.out.println("Final score: "+currentPoints); playing = false; break;
			} else {
				System.out.println("Play again?");
				switch (input.next()) {
				case "y": playing = true; break;
				case "n": System.out.println("Final score: "+currentPoints); playing = false; break;
				}
			}
		}
		input.close();
	}
	

}
