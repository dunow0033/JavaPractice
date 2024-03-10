package inheritance;

import java.util.Scanner;

public class TempEmployee extends Employee{
	private double contractAmount;
	private int contractPeriod;
	private Scanner sc;
	
	public TempEmployee()
	{
		sc=new Scanner(System.in);
	}
	
	public void accept()
	{
		super.accept();
		sc = new Scanner(System.in);
		System.out.println("Enter Contract amount");
		contractAmount=sc.nextDouble();
		System.out.println("Enter contract period");
		contractPeriod=sc.nextInt();
	}
	
	public void display()
	{
		super.display();
		System.out.println("Contract amount is "+contractAmount);
		System.out.println("Contract period is "+contractPeriod);
		
	}
	public static void main(String[] args) {
		Employee eobj=null;
		System.out.println("for permanent employee");
		eobj=new PermanentEmployee();
		eobj.accept();
		eobj.display();
		eobj.calculateSalary();
		System.out.println("For contract employee ");
		eobj=new TempEmployee();
		eobj.accept();
		eobj.display();
		eobj.calculateSalary();
		
	}
	
	@Override
	public void calculateSalary() {
		System.out.println("Calculating salary for temp employee");
	}

}
