package inheritance2;

import java.util.Scanner;

public class Member {

	private String name;
	private int age;
	private String phoneNumber;
	private String address;
	private double salary;
	
	protected Scanner sc;
	
	public Member() {
		sc = new Scanner(System.in);
	}
	
	public void accept()
	{
		System.out.print("Enter name:  ");
		name = sc.next();
		
		System.out.print("Enter age:  ");
		age = sc.nextInt();
		
		System.out.print("Enter phone number:  ");
		phoneNumber = sc.next();
		
		System.out.print("Enter address:  ");
		address = sc.next();
		
		System.out.print("Enter salary:  ");
		salary = sc.nextDouble();
	}
	
	public void display()
	{
		System.out.println("Name is " + getName());
		System.out.println("Name is " + getAge());
		System.out.println("Name is " + getPhoneNumber());
		System.out.println("Name is " + getAddress());
	}
	

	private String getName() {
		return name;
	}



	private void setName(String name) {
		this.name = name;
	}



	private int getAge() {
		return age;
	}



	private void setAge(int age) {
		this.age = age;
	}



	private String getPhoneNumber() {
		return phoneNumber;
	}



	private void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}



	private String getAddress() {
		return address;
	}



	private void setAddress(String address) {
		this.address = address;
	}



	private double getSalary() {
		return salary;
	}



	private void setSalary(double salary) {
		this.salary = salary;
	}



	public void printSalary()
	{
		System.out.println(name + "'s salary is " + getSalary());
	}
}
