package exceptions;

import java.util.*;

public class ArithDemo {
	private Scanner sc;
	int number1,number2;
	public ArithDemo()
	{
		sc=new Scanner(System.in);
	}
	public void accept()
	{
		System.out.println("Enter Number 1");
		number1 = sc.nextInt();
		System.out.println("Enter Number 2");
		number2 = sc.nextInt();
		
	}
	public void divide()
	{
		try
		{
			double result=number1/number2;
			System.out.println("Result is "+result);


		}
		catch(ArithmeticException ex)
		{
			System.out.println("Trying to divide number by zero");
		}
	}
	public static void main(String[] args) {
		ArithDemo arobj=new ArithDemo();
		arobj.accept();
		arobj.divide();
	}

}
