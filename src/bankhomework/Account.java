package bankhomework;

public interface Account {
	void deposit(double amount);
	
	void withdraw(double amount);
	
	double calculateInterest();
	
	double viewBalance();
}
