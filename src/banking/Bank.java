package banking;

import java.util.Scanner;

/**
 * Represents a bank for managing customers and their bank accounts.
 * @author FaisalDawod
 */
public class Bank {
	public static void main(String[] args ) {
		
		// Creates new instance of Bank class
		Bank bank = new Bank();
		
		// Calls the run method in the bank class
		bank.run();
	}
	
	/**
	 * Runs the program by initializing and managing, bank accounts and customers.
	 */
	public void run() {
		System.out.println("Welcome to the Bank! What is your name?");
		
		// Create scanner to get user input
		Scanner scanner = new Scanner(System.in);
		
		// Get the next token (word), which is the customer's name
		String name = scanner.next();
		
		System.out.println("Hello " + name + "! We are creating checking and savings accounts for you.");
		
		// Create customer with given name
		Customer customer = new Customer(name);
		
		// Get address
		System.out.println("What is your address?");
		
		// Get the next token (word), which is customer's address
		String address = scanner.next();
		
		// Set the customer's address
		customer.setAddress(address);
		
		// Create a checking account for customer
		BankAccount checkingAccount = new BankAccount("checking", customer);
		
		// Create a saving account for customer
		BankAccount savingsAccount = new BankAccount("savings", customer);
		
		// Gets and prints the customer info associated with the checking account
		System.out.println(); // Blank Line
		System.out.println("Customer Info: ");
		System.out.println(checkingAccount.getCustomerInfo());
		
		// Get and prints account info for a checking account
		System.out.println("Checking account: ");
		System.out.println(checkingAccount.getAccountInfo());
		
		// Get and prints account info for a savings account
		System.out.println("Savings account: ");
		System.out.println(savingsAccount.getAccountInfo());
		
		// Deposits
		
		// Info checking
		System.out.println(); // Blank Line
		System.out.println("Amount (decimal) to deposit into your checking account?");
		double amount = scanner.nextDouble(); // Get next token (double)
		checkingAccount.deposit(amount); // Deposit into checking account
		
		// Info savings
		System.out.println(); // Blank Line
		System.out.println("Amount (decimal) to deposit into your savings account?");
		amount = scanner.nextDouble(); // Get next token (double)
		savingsAccount.deposit(amount); // Deposit into savings account
		
		// Print new balances
		System.out.println(checkingAccount.getAccountInfo());
		System.out.println(savingsAccount.getAccountInfo());
		
		// Withdrawals
		
		// From checking
		System.out.println(); // Blank Line
		System.out.println("Amount (decimal) to withdraw from your checking account?");
		amount = scanner.nextDouble(); // Get next token as a double
		
		try {
			checkingAccount.withDraw(amount); // Withdraw from checking
		} catch (Exception e) {
			// e.printStackTrace();
			// Prints custom error message from withDraw method
			System.out.println(e.getMessage());
		}
		
		// From savings
		System.out.println(); // Blank Line
		System.out.println("Amount (decimal) to withdraw from your savings account?");
		amount = scanner.nextDouble(); // Get next token as a double
		
		try {
			savingsAccount.withDraw(amount); // Withdraw from savings
		} catch (Exception e) {
			// e.printStackTrace();
			// Prints custom error message from withDraw method
			System.out.println(e.getMessage());
		}
		
		// Print new balances
		System.out.println(checkingAccount.getAccountInfo());
		System.out.println(savingsAccount.getAccountInfo());
		
		scanner.close();
	}
}
