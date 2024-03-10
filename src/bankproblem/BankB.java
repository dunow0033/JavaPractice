package bankproblem;

public class BankB extends Bank {

	private int balance;
	
	public BankB(int balance) {
		this.balance = balance;
	}
	
	@Override
	public double getBalance() {
		// TODO Auto-generated method stub
		return balance;
	}
	
	public static void main(String args[]) {
		BankB bankB = new BankB(150);
		
		System.out.println(bankB.getBalance());
	}
}
