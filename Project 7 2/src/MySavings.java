/**
 * My Savings App
 * Maxwell Phillips
 * A program to calculate one's savings and add and widthdrawl from them
 */
import java.util.Scanner;
import java.text.NumberFormat;
public class MySavings {
	
	public static void main(String[] args) {
		//variables
		int userInput = 0;
		
		//Instantiate classes
		Scanner input = new Scanner(System.in);
		PiggyBank bank = new PiggyBank();
		NumberFormat formatter = NumberFormat.getCurrencyInstance();
		
		System.out.println(bank.getTotalChange());
		//Start input loop
		while (userInput != -1)
		{
			System.out.println("1. Show total in bank.");
			System.out.println("2. Add a penny.");
			System.out.println("3. Add a nickel.");
			System.out.println("4. Add a dime.");
			System.out.println("5. Add a quarter.");
			System.out.println("6. Empty piggy bank.");
			System.out.println("Enter -1 to quit.");
					
			System.out.println("Enter your choice: ");
			userInput = input.nextInt();
					
					//Determine user choice
					switch (userInput)
					{
					case 1: System.out.println("The total amount of change in your piggy bank is: "+ formatter.format(bank.getTotalChange())); break;
					case 2: System.out.println("Added a penny!"); bank.addPenny(); break;
					case 3: System.out.println("Added a nickel!"); bank.addNickel(); break;
					case 4: System.out.println("Added a dime!"); bank.addDime(); break;
					case 5: System.out.println("Added a quarter!"); bank.addQuarters(); break;
					case 6: System.out.println("Emptied piggy bank!"); bank.emptyBank(); break;
					case -1: userInput = -1;
					}
					System.out.println(""); //Empty line
				}
		input.close();
	}

}
