package collections.day2;

import java.util.Scanner;
import java.util.Set;
import java.util.*;

public class SetDemo {
	private Scanner sc;
	private Set<String> setdata;
	public SetDemo()
	{
		sc = new Scanner(System.in);
		setdata = new HashSet<>();
	}
	public void insert(){
		System.out.println("Enter no of string u want to add");
		
		int noofstring=sc.nextInt();
		
		for(int x = 1; x <= noofstring; x++)
		{
			System.out.println("Enter any string ");
			String str=sc.next();
			setdata.add(str);
		}
	}
	public void display()
	{
		for(String s:setdata)
		{
			System.out.println("String is " + s);
		}
	}
	public static void main(String[] args) {
		SetDemo setd=new SetDemo();
		
		List<Integer> nums = new ArrayList<Integer>();
		nums.add(62);
		nums.add(190);
		nums.add(123);
		nums.add(11);
		
		Iterator<Integer> values = nums.iterator();
		
		while(values.hasNext())
			System.out.println(values.next());
		
		nums.remove((Integer) 123);
		
		System.out.println();
		
		values = nums.iterator();
		
		while(values.hasNext())
			System.out.println(values.next());
		
//		setd.insert();
//		setd.display();
	}

}
