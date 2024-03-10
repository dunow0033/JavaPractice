package exceptions;

import java.util.*;
public class AgeDemo {
	private int age;
	private Scanner sc;
	
	public AgeDemo()
	{
		sc=new Scanner(System.in);
	}
	public void acceptAge()
	{
		System.out.println("Enter Age ");
		age=sc.nextInt();
		if(age<18)
		{
			throw new InvalidAgeException();
		}
	}
	public static void main(String[] args) {
		AgeDemo aged=new AgeDemo();
		aged.acceptAge();
	}
}
