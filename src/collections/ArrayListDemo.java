package collections;

import java.util.Collection;
import java.util.ArrayList;

public class ArrayListDemo {
	
	private static Collection<String> arrayList;
	
	public static void main(String args[])
	{
		arrayList = new ArrayList<String>();
		
		arrayList.add("hi");
		arrayList.add("today");
		arrayList.add("now");
		
		System.out.println(arrayList);
		
		System.out.println();
		
		for(String s:arrayList)
		{
			System.out.println(s);
		}
	}
}
