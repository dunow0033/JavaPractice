package bankproblem;

public class BankC extends Bank {

	private int balance;
	
	public BankC(int balance) {
		this.balance = balance;
	}
	
	@Override
	public double getBalance() {
		// TODO Auto-generated method stub
		return balance;
	}
	
	public static void main(String args[]) {
		BankC bankC = new BankC(200);
		
		System.out.println(bankC.getBalance());
	}
}
