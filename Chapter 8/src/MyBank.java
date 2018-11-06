/*
 * MyBank.java
 * Chapter 8 Exercise 1
 * Lawrenceville Press
 * June 24, 2011
 */
 import java.util.Scanner;
 import java.text.NumberFormat;

 /**
  * An application to test the Account, PersonalAcct, and BusinessAcct classes.
  */
 public class MyBank {

	public static void main(String[] args) {


		PersonalAcct munozAccount = new PersonalAcct(250, "Maria", "Munoz", "110 Glades Road", "Mytown", "FL", "33445");
		BusinessAcct pizzaAccount = new BusinessAcct(600, "Antonio", "Oliverio", "5 Main Street", "Mytown", "FL", "33445");
		Scanner input = new Scanner(System.in);
		double data;
		NumberFormat money = NumberFormat.getCurrencyInstance();

		System.out.println(munozAccount);
		System.out.println(pizzaAccount);

		System.out.print("Enter Munoz deposit amount: ");
		data = input.nextDouble();
		munozAccount.deposit(data);
		System.out.println("Balance is: " + money.format(munozAccount.getBalance()));

		System.out.print("Enter Munoz withdrawal amount: ");
		data = input.nextDouble();
		munozAccount.withdrawal(data);
		System.out.println("Balance is: " + money.format(munozAccount.getBalance()));

		System.out.print("Enter Pizza deposit amount: ");
		data = input.nextDouble();
		pizzaAccount.deposit(data);
		System.out.println("Balance is: " + money.format(pizzaAccount.getBalance()));

		System.out.print("Enter Pizza withdrawal amount: ");
		data = input.nextDouble();
		pizzaAccount.withdrawal(data);
		System.out.println("Balance is: " + money.format(pizzaAccount.getBalance()));
		input.close();


	}
}
