package inheritance2;

public class Employee extends Member {

	private String specialization;
	
	@Override
	public void accept()
	{
		super.accept();
		System.out.print("Enter Specialization:  ");
		specialization = sc.next();
	}
	
	@Override
	public void printSalary() {
		super.printSalary();
	}
	
	@Override
	public void display() {
		super.display();
		System.out.println("Specialization is " + specialization);
	}
	
	public static void main(String args[])
	{
		Employee emp = new Employee();
		
		emp.accept();
		
		emp.display();
		
		emp.printSalary();
	}
}
