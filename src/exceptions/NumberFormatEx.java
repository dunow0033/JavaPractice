package exceptions;

import java.util.Scanner;

public class NumberFormatEx {
	
	private Scanner sc;
	int number = 0;
	
	public NumberFormatEx()
	{
		sc=new Scanner(System.in);
	}
	
	public void accept()
	{
		System.out.println("Enter any number ");
		
		try {
			number = Integer.parseInt(sc.next());
		}
		catch(NumberFormatException e)
		{
			System.out.println("Incorrect format inputted");
		}
	}
	public void display()
	{
		System.out.println("Here is your number:  " + number);
	}
	
	public static void main(String args[])
	{
		NumberFormatEx numberFormatEx = new NumberFormatEx();
        numberFormatEx.accept();
        numberFormatEx.display();
	}
}
