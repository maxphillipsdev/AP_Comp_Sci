import java.lang.Math;
public class Coin {
	
	private int faceUp;
	
	/*
	 * Constructor
	 * pre: none
	 * post: A coin object initalized.
	 */
	public Coin() {
		faceUp = 0;
	}
	
	/*
	 * Returns the face that is currently showing on coin.
	 * Pre: none.
	 * Post: return faceUp.
	 */
	public int showFace() {
		return(faceUp);
	}
	/*
	 * Sets a random int value between 1 and 0 for faceUp.
	 * Pre: none.
	 * Post: Value of faceUp modified.
	 */
	public void flipCoin() {
		faceUp = (int)(0.5 + Math.random());
	}
	

}
