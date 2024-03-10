package exceptions;

import java.util.Scanner;

public class InvalidAmountDemo {
	
	private double balance;
	private double amount;
	private Scanner sc;
	
	public InvalidAmountDemo(double balance)
	{
		this.balance = balance;
		sc = new Scanner(System.in);
	}
	
	public void enterAmount() throws InvalidAmountException 
	{
		System.out.println("Enter Amount ");
		amount = sc.nextDouble();
		
		if(amount > balance)
		{
			throw new InvalidAmountException();
		}
	}
	public static void main(String[] args) throws InvalidAmountException {
		Scanner sc1 = new Scanner(System.in);
		
		System.out.print("Enter the balance in your account:  ");
		double balance = sc1.nextDouble();
		
		InvalidAmountDemo amount = new InvalidAmountDemo(balance);
		amount.enterAmount();
		
		sc1.close();
	}
}
