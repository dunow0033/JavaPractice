package inheritance2;

public class Manager extends Member{
	
	private String department;
	
	@Override
	public void accept()
	{
		super.accept();
		System.out.print("Enter Department:  ");
		department = sc.next();
	}
	
	@Override
	public void printSalary() {
		super.printSalary();
	}
	
	@Override
	public void display() {
		super.display();
		System.out.println("Department is " + department);
	}
	
	public static void main(String args[])
	{
		Manager mngr = new Manager();
		
		
		mngr.accept();
		
		mngr.display();
		
		mngr.printSalary();
	}
}
