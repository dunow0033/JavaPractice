package streampractice;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import functionalinterfaces.Employee;

import java.util.ArrayList;
import java.util.Arrays;

public class Streampractice {
	
	private List<Employee> emplist;
	private List<Integer> intList;
	
	public Streampractice()
	{
		intList = Arrays.asList(12, 32, 31, 97, 14);
		
		emplist = new ArrayList<>();
		emplist.add(new Employee(1,"Vanshita",90000));
		emplist.add(new Employee(2,"Naman",80000));
		emplist.add(new Employee(3,"Mark",40000));
		emplist.add(new Employee(4,"John",234234));
	}

	 public static void main(String[] args) {
		 
		 Streampractice sp = new Streampractice();
		 	
		 sp.calculateSquare();
		 
		 List<Integer> numbers = Arrays.asList(2, 3, 4, 5);

		 //Stream.of(numbers).forEach(System.out::println);
	      
	      //List<Integer> empList = Arrays.asList(numbers);
	      //empList.stream();
	      
	      List<Integer> ls = numbers.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
	      
	      //System.out.println("Printing the list after stream operation : " + ls);
	      
	      sp.incrementSalary();
	 }
	 
	 
	 
	 public void calculateSquare()
	 {
		intList.stream().map(data -> (data * data)).forEach(num ->
		{
			System.out.println("Square is " + num);
		});
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
			
			emplist.stream().map(data -> data.getSalary() + 2000).findFirst().ifPresent(System.out::println);	
			
//			emplist.stream().map(data -> data.getSalary() + 2000).forEach(val ->
//			{
//				System.out.println("incremented salary is " + val);
//			});
		}
}
