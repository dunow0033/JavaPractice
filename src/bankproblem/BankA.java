package bankproblem;

public class BankA extends Bank {
	
	private int balance;
	
	public BankA(int balance) {
		this.balance = balance;
	}

	@Override
	public double getBalance() {
		// TODO Auto-generated method stub
		return balance;
	}
	
	public static void main(String args[]) {
		BankA bankA = new BankA(100);
		
		System.out.println(bankA.getBalance());
	}
	
}
