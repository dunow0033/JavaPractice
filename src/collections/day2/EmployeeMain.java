package collections.day2;

import java.util.*;

public class EmployeeMain {
	private Scanner sc;
	private List<Employee> emplist;
	
	public EmployeeMain()
	{
		sc=new Scanner(System.in);
		emplist=new ArrayList<>();
	}
	public void insertDetails()
	{
		System.out.println("Enter for how many employees u wnt to accept details");
		int noofemployee=sc.nextInt();
		
		for(int x=1;x <= noofemployee;x++)
		{
			Employee e=new Employee();
			System.out.println("Enter employee id ");
			e.setEmpid(sc.nextInt());
			System.out.println("Enter Employee Name ");
			e.setEmpname(sc.next());
			System.out.println("Enter Salary ");
			e.setSalary(sc.nextDouble());
			emplist.add(e);
		}
	}
	
	public void update()
	{
		Employee eupdate=null;
		System.out.println("Enter employee id which u want to update");
		int employeeid=sc.nextInt();
		for(Employee e:emplist)
		{
			if(e.getEmpid()==employeeid)
			{
				System.out.println("Enter new salary ");
				e.setSalary(sc.nextDouble());
				eupdate=e;
			}
		}
		
	}
	public void menu()
	{
		String choice="y";
		int option;
		
		while(choice.equals("y"))
		{
			System.out.println("1. Insert employee details ");
			System.out.println("2.  Delete Employee Details ");
			System.out.println("3.  Update Employee Details ");
			System.out.println("4.  View Employee Details ");
			System.out.println("5.  Exit");
			option=sc.nextInt();
			switch(option)
			{
			case 1:
				insertDetails();
				break;
			case 2:
					deleteDetails();
					break;
			case 3:
					update();
					break;
			case 4:
					display();
					break;
			case 5:
					System.exit(0);
					
			}
			System.out.println("Do u want to continue");
			choice=sc.next();
		}
			
		}
	
	public void deleteDetails()
	{
		Employee edelete=null;
		System.out.println("Enter employee id which u want to delete");
		int empid=sc.nextInt();
		for(Employee e:emplist)
		{
			if(e.getEmpid()==empid)
			{
				edelete=e;
			}
			
		}
		emplist.remove(edelete);
	}
	public void display()
	{
		for(Employee emp:emplist)
		{
			System.out.println("Emp name is " + emp.getEmpname());
			System.out.println("Salary is " + emp.getSalary());
		}
	}
	public static void main(String[] args) {
		EmployeeMain emain=new EmployeeMain();
		emain.insertDetails();
		emain.display();
		System.out.println("Calling delete");
		emain.deleteDetails();
		emain.display();
	}

}
