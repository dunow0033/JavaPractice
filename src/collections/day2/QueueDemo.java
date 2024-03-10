package collections.day2;

import java.util.*;

public class QueueDemo {
	
	private Queue<String> queuestr;
	
	private LinkedList<Integer> intList = new LinkedList<Integer>();
	
	public QueueDemo()
	{
		queuestr = new LinkedList<String>();
	}
	
	public void display()
	{
		queuestr.offer("data");
		queuestr.add("spring");
		intList.addAll(Arrays.asList(12, 23, 21, 45, 321, 19));
		System.out.println(intList);
		
		for(int a : intList)
		{
			System.out.println(a);
		}
		
		System.out.println("Size: " + intList.size());
		
		for(int i = 0; i < intList.size(); i++)
		{
			System.out.println("element " + intList.get(i));
		}
		
		System.out.println("Is Empty: " + intList.isEmpty());
		Object[] intArray = intList.toArray();
		
		for(int i = 0; i < intArray.length; i++)
		{
			System.out.println(intArray[i]);
		}
		
		intList.add(1002);
		
		for(int i = 0; i < intList.size(); i++)
		{
			System.out.println("element " + intList.get(i));
		}
		
		intList.remove(Integer.valueOf(1002));
		
		for(int i = 0; i < intList.size(); i++)
		{
			System.out.println("element 1 " + intList.get(i));
		}
		
//		intList.retainAll(Arrays.asList(12, 23, 21));
//		
//		for(int a : intList)
//		{
//			System.out.println("kept:  " + a);
//		}
		
		//if the size of queue is limited add will give exception
		System.out.println(queuestr);
		System.out.println("retrieve data");
		System.out.println("value " + queuestr.element());
		System.out.println("next value " + queuestr.peek());
		//difference between peek and element is element will give
		//exception if no data is there, both of them check, but do not remove
		//the head of the queue.
		queuestr.remove();
		queuestr.poll();
		System.out.println(queuestr);
	}
	
	public static void main(String[] args)
	{
		QueueDemo qd = new QueueDemo();
		qd.display();
	}
}
