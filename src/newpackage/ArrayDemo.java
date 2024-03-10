package newpackage;

import java.util.Scanner;

public class ArrayDemo {
	
	private String[] names;
	private int[] nums;
	private int sum, next  = 0;
	private Scanner sc;
	
	public ArrayDemo()
	{
		names = new String[4];
		nums = new int[10];
		
		sc = new Scanner(System.in);
		
		for(int i = 0; i < names.length; i++)
		{
			names[i] = "jones" + i;
		}
	}
	public void hello()
	{
		for(int x = 0; x < names.length; x++)
		{
			System.out.println("Enter value");
			names[x] = sc.next();
		}
	}
	public void accept()
	{
		for(int x=0;x<names.length;x++)
		{
			System.out.println("Enter value");
			names[x]=sc.next();
		}
	}
	public void numbers()
	{
		
		for(int i = 0; i < nums.length; i++)
		{
			System.out.print("Please enter the next number:  ");
			next = sc.nextInt();
			sum += next;
			System.out.println("Sum so far:  " + sum);
		}
	}
	public void display()
	{
		for(String s:names)
		{
			System.out.println("Value of name is " + s);
		}
	}
	
	public static void main(String[] args) {
		ArrayDemo arrd=new ArrayDemo();
		arrd.numbers();
//		arrd.accept();
//		arrd.display();
		
		
//		int numArray[] = new int[10];
//		for(int i = 0; i < numArray.length; i++)
//		{
//			numArray[i] = i * 2;
//		}
//		
//		int sum = 0;
//		
//		for(int i = 0; i < numArray.length; i++)
//		{
//			sum += numArray[i];
//		}
//		
//		System.out.println(sum);
	}
}
