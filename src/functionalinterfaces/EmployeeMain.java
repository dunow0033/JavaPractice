package functionalinterfaces;

import java.util.*;

public class EmployeeMain {
	
	private List<Employee> emplist;
	
	public EmployeeMain()
	{
		emplist = new ArrayList<>();
		emplist.add(new Employee(1,"Vanshita",90000));
		emplist.add(new Employee(2,"Naman",80000));
		emplist.add(new Employee(3,"Mark",40000));
		emplist.add(new Employee(4,"John",234234));
	}
	
	public void retreiveBySalary()
	{
		emplist.stream().filter(emp -> emp.getSalary() > 50000).forEach(e->
		{
			System.out.println("employee name is "+e.getEmpname());
			System.out.println("Employee Salary is "+e.getSalary());
		});
	}
	
	public void incrementSalary() {
		
		emplist.stream().map(data -> data.getSalary() + 2000).forEach(
			val ->
			{
				System.out.println("incremented salary is " + val);
			});
		
//		emplist.stream().forEach(obj ->
//		{
//			System.out.println(obj.getSalary() + 2000);
//		});
	}
		
		public void empSalary()
		{
			emplist.stream().map(data -> data.getSalary() + 2000).forEach(salary ->
			{	
				System.out.println("Extra salary is " + salary);
			});	
		}
		
//		emplist.stream().map(emp -> emp.setSalary(emp.getSalary() + 2000);
//			return emp;
//		}).forEach(System.out::println);
	
	public static void main(String[] args) {
		EmployeeMain eobj=new EmployeeMain();
		eobj.retreiveBySalary();
		
		eobj.incrementSalary();
	}
}
