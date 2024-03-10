
import java.util.*;
public class MaximumDemo {
	private int number1;
	private int number2;
	private int number3;
	private Scanner sc;
	public void accept()
	{
		sc=new Scanner(System.in);
		System.out.println("Enter number 1");
		number1=sc.nextInt();
		System.out.println("Enter Number 2");
		number2=sc.nextInt();
		System.out.println("Enter Number 3");
		number3=sc.nextInt();
		
	}
	public void findMax()
	{
		if(number1>number2&&number1>number3)
		{
			System.out.println("Number 1 is maxiimum");
		}
		else
		if(number2>number1&&number2>number3)
		{
			System.out.println("Number 2 is maximum");
		}
		else
		{
			System.out.println("Number 3 is maximum");
		}
		
	}
	public static void main(String[] args) {
		MaximumDemo maxd=new MaximumDemo();
		maxd.accept();
		maxd.findMax();
	}

}