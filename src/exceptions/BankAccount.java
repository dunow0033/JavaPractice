package exceptions;

import java.util.*;

public class BankAccount {
	private Scanner sc;
	double amount;
	double balance=50000;
	public BankAccount()
	{
		sc = new Scanner(System.in);
	}
	public void acceptAmount() throws InvalidAmountException
	{
		System.out.println("Enter Amount");
		amount=sc.nextDouble();
		try
		{
		if(amount > balance)
		{
			throw new InvalidAmountException();
		}
		}
		catch(InvalidAmountException ex)
		{
			System.out.println(ex.getMessage());
		}
	}
	public static void main(String[] args) {
		BankAccount bankobj=new BankAccount();
		try {
			bankobj.acceptAmount();
		}
		catch(InvalidAmountException e)
		{
			System.out.println("Invalid amount entered");
		}
	}

}
