package exceptions;

import java.util.*;
public class MultiExceptionDemo {
	int arr[];
	private Scanner sc;
	public MultiExceptionDemo()
	{
		sc=new Scanner(System.in);
		arr=new int[5];
	}
	public void accept()
	{
		for(int x=0;x<arr.length;x++)
		{
			System.out.println("Enter any number ");
			arr[x]=sc.nextInt();
		}
	}
	public void divide()
	{
		try
		{
			System.out.println("Enter index number for first number");
			int index1=sc.nextInt();
			System.out.println("Enter  index number for second number");
			int index2=sc.nextInt();
			double result=arr[index1]/arr[index2];
			System.out.println("Result is "+result);
		}
		catch(ArithmeticException ex)
		{
			System.out.println("Trying to divide number by zero");
		}
		catch(ArrayIndexOutOfBoundsException ex)
		{
			System.out.println("Trying to access beyond limit");
		}
		catch(Exception ex)
		{
			System.out.println("Any type of exception caught");
		}
	}
	public static void main(String[] args) {
		MultiExceptionDemo multi=new MultiExceptionDemo();
		multi.accept();
		multi.divide();
	} 
	
	

}
