package bankhomework;

public class CurrentAccount implements Account {
	
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
	public void overdraftProtection() {
		System.out.println("cover overdrafts");
	}

}
