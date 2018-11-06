/*
 * CountLetters.java from Chapter 10
 * Count the occurences of letters in a string.
 * Lawrenceville Press
 * June 10, 2005
 */
 
 /**
  * The occurences of letters in a string are counted.
  */
 
import java.util.Scanner;
  
public class count_letters {

	public static void main(String[] args) {
		final int LOW = 'A';		//smallest possible value
		final int HIGH = 'Z';		//highest possible value
		int[] letterCounts = new int[HIGH - LOW + 1];
		Scanner input = new Scanner(System.in);		
		String phrase;
		char[] wordLetters;
		int offset;		//array index
		
		/* prompt user for a word */
		System.out.print("Enter a phrase: ");
		phrase = input.nextLine();
		
		/* convert word to char array and count letter occurrences */
		phrase = phrase.toUpperCase();
		phrase = phrase.trim();
		phrase = phrase.replaceAll("\\s+", "");
		wordLetters = phrase.toCharArray();
		for (int letter = 0; letter < wordLetters.length; letter++) {
			offset = wordLetters[letter] - LOW; 
			letterCounts[offset] += 1;
		}
		
		/* show letter occurrences */
		for (int i = LOW; i <= HIGH; i++) {
			System.out.println((char)i + ": " + letterCounts[i - LOW]);
		}
	}
}
