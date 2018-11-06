/* 
 * Personal Account
 * Maxwell Phillips
 * 2 March 2018
 * A class for a personal bank account.
 */
public class PersonalAcct extends Account {

	/*
	 * Personal Account Constructor
	 * Pre: values for opening an account.
	 * Post: Passes those values to the new account and checks that that it meets the minimum balance.
	 */
	public PersonalAcct(double bal, String fName, String lName, String str, String city, String st, String zip) {
		super(bal, fName, lName, str, city, st, zip);
		if (bal < 100.0) {
 			System.out.println("NOTE: $2 have been deducted for being below minimum balance!");
			this.withdrawal(2.00);			
		}
	}
	
	/** 
	 * Overridden method for withdrawls from personal accounts
	 * A withdrawal is made from the account if there is enough money.
	 * pre: double amount for money
	 * post: The balance has been decreased by the amount withdrawn.
	 */
	public void withdrawal(double amt) {
	 	if (amt <= this.getBalance()) {
	 		super.withdrawal(amt);
	 		
	 		if (this.getBalance() < 100.0) {
	 			System.out.println("NOTE: $2 have been deducted for being below minimum balance!");
				super.withdrawal(2.00);			
			}
	 	} else {
	 		System.out.println("Not enough money in account.");
	 	}
	}
}