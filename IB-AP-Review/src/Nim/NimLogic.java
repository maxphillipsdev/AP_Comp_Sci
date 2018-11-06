package Nim;

import java.lang.Math;

public class NimLogic {

	public int totalStones;
	public int player1Stones = 0;
	public int player2Stones = 0;
	public boolean gameOver = false;
	
	public NimLogic() {
		beginGame();
	}
	
	public void p1Take(int stoneCount) {
		if (stoneCount <= totalStones && !gameOver) {
			totalStones -= stoneCount;
			player1Stones += stoneCount;
			
			if (totalStones ==  0) {
				System.out.println("Player 2 wins!");
				gameOver = true;
			}
			
		} else if (!gameOver){
			System.out.println("Invalid choice!");
		}
	}
	
	public void p2Take() {
		int stoneCount = (int)(Math.random() * ((3 - 1) + 1)) + 1;
		if (!gameOver) {
			totalStones -= stoneCount;
			player2Stones += stoneCount;

			if (totalStones ==  0) {
				System.out.println("Player 1 wins!");
				gameOver = true;
			}
			
		}
	}
	
	private void beginGame() {
		//determine starting stones
		totalStones = (int)(Math.random() * ((30 - 15) + 1)) + 15;

	}
}
