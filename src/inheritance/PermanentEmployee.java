package inheritance;

public class PermanentEmployee extends Employee{
	private double salary;
	
	@Override
	public void accept()
	{
		super.accept();
		System.out.println("Enter Salary ");
		salary=sc.nextDouble();
	}
	
	@Override
	public void display()
	{
		super.display();
		System.out.println("Salary is " + salary);
	}
	
	public static void main(String[] args) {
		System.out.println("Calling Details for Employee class");
		Employee emp=new PermanentEmployee();
		emp.accept();
		emp.display();
		System.out.println("Calling details for Permanent Employee ");
		PermanentEmployee pemp=new PermanentEmployee();
		pemp.accept();
		pemp.display();
	}

	@Override
	public void calculateSalary() {
		System.out.println("Calculating salary for permanent employee");
		
	}
}
