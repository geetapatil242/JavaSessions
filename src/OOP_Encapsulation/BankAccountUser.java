package OOP_Encapsulation;

public class BankAccountUser {

	public static void main(String[] args) {
		BankAccount user = new BankAccount();
		user.setOwner("Aditi");
		user.setAccountNumber("1214");
		user.setBalance(2000);
		
		user.deposit(1000);
		user.printStatement();
		user.withdraw(100);
		user.printStatement();

	}

}
