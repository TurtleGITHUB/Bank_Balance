// exercise on page 291

import java.util.Scanner;

public class BankBalance
{
	public static void main(String[] args)
	{
		// variables and constants
		double balance;
		int response;
		int year = 1;
		final double INT_RATE = 0.03;
		Scanner keyboard = new Scanner(System.in);

		// input phase
		System.out.print("Enter initial bank balance > ");
		balance = keyboard.nextDouble();
		

		System.out.println("Do you want to see next year's balance?");
		System.out.println("Enter 1 for yes");
		System.out.println(" or any other number for no >> ");
		response = keyboard.nextInt();
		
		// calculation and output phases

		while(response == 1)
		{
			balance = balance + balance * INT_RATE;
			System.out.println("After year " + year + " at " + INT_RATE + " interest rate, balance is $" + balance);
			year = year + 1;
			System.out.println("\nDo you want to see the balance " + "at the end of another year?");
			System.out.print("Enter 1 for yes");
			System.out.println(" or any other number for no >> ");
			response = keyboard.nextInt();
		}

		// final sign off message to indicate the program is exiting
		System.out.println("Have a great day!");
	}
}