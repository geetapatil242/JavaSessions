package ConstructorsConcept;

public class BankAccount {
	String accountNumber;
	double balance;

	public BankAccount(String accountNumber, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	public double deposit(double d) {
		this.balance = balance + d;
		return balance;

	}

	public double withdraw(double w) {
		this.balance = balance - w;
		return balance;

	}

	public double getBalance() {
		return balance;
	}

	public double setBalance(double balance) {
		this.balance = balance;
		return balance;
	}

	public static void main(String[] args) {
		BankAccount bc = new BankAccount("Priya", 20000.0);
		double newBalance = bc.deposit(2000.0);
		System.out.println(newBalance);
		double newBalance2 = bc.withdraw(1000.0);
		System.out.println(newBalance2);
		// using setter method
		bc.setBalance(bc.deposit(400));
		double currentBal = bc.getBalance();
		System.out.println(currentBal);
		double nb = bc.setBalance(bc.withdraw(200));
		System.out.println(nb);

	}

}

//Assignment 5:
//
//Create a Java class named "BankAccount" with the following instance variables:
//
//accountNumber (String)
//
//balance (double)
//
//Create a constructor for the BankAccount class that takes in the accountNumber and balance as parameters and initializes the instance variables.
//
//Create a method in the BankAccount class named "deposit" that takes in a double value as a parameter and adds it to the balance instance variable.
//
//Create a method in the BankAccount class named "withdraw" that takes in a double value as a parameter and subtracts it from the balance instance variable.
//
//Create a main method that creates an instance of the BankAccount class using the constructor and performs multiple deposits and withdrawals using the deposit and withdraw methods. Print out the updated balance after each transaction.
