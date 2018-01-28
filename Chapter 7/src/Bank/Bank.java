/*
 * Bank.java from Chapter 8
 * Simulates a bank and its cusomters.
 * Lawrenceville Press
 * June 10, 2005
 */
 
 /**
 * A bank where accounts can be opened and customers can 
 * make transactions.
 */
package Bank;
 import java.util.Scanner;
 import java.text.NumberFormat;
 import java.lang.String;
  
 public class Bank {

	public static void main(String[] args) {
		Account munozAccount = new Account(250, "Maria", "Munoz", "110 Glades Road", "Mytown", "FL", "33445");
		Scanner input = new Scanner(System.in);
		double data;
		NumberFormat money = NumberFormat.getCurrencyInstance();
		
		System.out.println(munozAccount);
		
		System.out.print("Enter deposit amount: ");
		data = input.nextDouble();
		munozAccount.deposit(data);
		System.out.println("Balance is: " + money.format(munozAccount.getBalance()));

		System.out.print("Enter withdrawal amount: ");
		data = input.nextDouble();
		munozAccount.withdrawal(data);
		System.out.println("Balance is: " + money.format(munozAccount.getBalance()));	
		//----------------
		System.out.println("Do you wish to change the adderss? [0 for yes, 1 for no]");
		data = input.nextDouble();
		
		if (data == 0) {
			
			System.out.println("Please enter a new address with the format street,city,st,z");
			System.out.println("Enter your new address. Remember to seperate with commas: ");
			String newAddress = input.nextLine();
			
			//Split string up
			String parts[] = newAddress.split(",");
			munozAccount.changeAddress(parts[0],parts[1],parts[2],parts[3]);
			
		} else if (data == 1) {
			System.out.println("Exiting...");
		} else {
			System.out.println("Please run again and enter a value of 0 or 1 to select your preference.");
		}
		input.close();
	}
}