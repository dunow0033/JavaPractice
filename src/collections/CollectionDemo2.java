package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Collection;

public class CollectionDemo2 {
	
	private static Collection<Integer> linkedList;
	private static Collection<String> arrayList;
	private static Collection<String> stack;
	
	public CollectionDemo2()
	{
		linkedList = new LinkedList<>();
		arrayList = new ArrayList<>();
		stack = new Stack<>();
	}
	
	public void insert()
	{
		linkedList.add(23);
		linkedList.add(53);
		linkedList.add(43);
		linkedList.add(21);
		
		arrayList.add("hello");
		arrayList.add("hello2");
		arrayList.add("hello45");
		arrayList.add("hello23");
	}
	
	public void display()
	{
		for(Integer l:linkedList)
		{
			System.out.println(l);
		}
		
		System.out.println();
		
		for(String s:arrayList)
		{
			System.out.println(s);
		}
	}
	
	public static void main(String args[])
	{
//		CollectionDemo2 cd = new CollectionDemo2();
//		cd.insert();
//		cd.display();
//		
//		System.out.println(cd.linkedList.contains(456));
		
		LinkedList ll1 = new LinkedList();
		ll1.add("string");
		ll1.add("string2");
		ll1.add("string3");
		ll1.add("string4");
		
		for(Object s:ll1)
		{
			System.out.println(s);
		}
		
		System.out.println();
		
		ll1.addFirst("string3");
		ll1.removeLast();
		
		for(Object s:ll1)
		{
			System.out.println(s);
		}
		
		System.out.println();
		
		ll1.addFirst("string3");
		
		for(Object s:ll1)
		{
			System.out.println(s);
		}
		
		System.out.println();
		
		ll1.addLast(67);
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		al.add(56);
		al.add(102);
		al.add(321);
		
		ll1.addAll(al);
		
		for(Object s:ll1)
		{
			System.out.println(s);
		}
		
		ll1.addLast(567);
		
		System.out.println();
		
		for(Object s:ll1)
		{
			System.out.println(s);
		}
		
		ll1.add(3, 10567);
		
		System.out.println();
		
		for(Object s:ll1)
		{
			System.out.println(s);
		}
		
		System.out.println();
		
		System.out.println(ll1.get(5));
		
		System.out.println();
		
		for(Object s:ll1)
		{
			System.out.println(s);
		}
	}
}
