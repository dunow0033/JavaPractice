package functionalinterfaces;

import java.util.*;

public class ListDemo {
	private List<String> liststr;
	
	public ListDemo()
	{
		liststr = new ArrayList<>();
	}
	
	public void insert()
	{
		liststr.add("welcome");
		liststr.add("java");
		liststr.add("spring");
		liststr.add("hibernate");
		liststr.add("java");
	}
	
	public void oldWay()
	{
		for(String s:liststr)
		{
			if(s.equals("java"))
			{
				System.out.println("String is " + s);
			}
		}
	}
	
	
	public void newWay()
	{
		liststr.stream().filter(str -> (str.equals("java"))).forEach(x ->
		{
			System.out.println("Value is " + x);
		});
	}
	
	public static void main(String[] args)
	{
		ListDemo listd = new ListDemo();
		listd.insert();
		listd.oldWay();
		listd.newWay();
	}
}
