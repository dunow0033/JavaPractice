package bankhomework;

public class SavingsAccount implements Account {
	
	private double balance;

	@Override
	public void deposit(double amount) {
		balance += amount;
	}

	@Override
	public void withdraw(double amount) {
		balance -= amount;
	}

	@Override
	public double calculateInterest() {
		return 0.05 * balance;
	}

	@Override
	public double viewBalance() {
		return balance;
	}

	//other unique methods
	public void unique() {
		System.out.println("Unique method");
	}
}
