package collections;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {
	
	private Collection<String> collectiondata;
	
	public CollectionDemo()
	{
		collectiondata = new ArrayList<>();
	}
	
	public void insert()
	{
		collectiondata.add("Java");
		collectiondata.add("Spring Framework");
		collectiondata.add("Hibernate");
		collectiondata.add("Mysql");
	}
	
	public void display()
	{
		for(String s:collectiondata)
		{
			System.out.println("Data is " + s);
		}
	}
	
	public void deletedata()
	{
		collectiondata.remove("Mysql");
	}
	
	public static void main(String args[])
	{
		CollectionDemo cd = new CollectionDemo();
		cd.insert();
		cd.display();
		System.out.println("AFter removing");
		cd.deletedata();
		cd.display();
		
		System.out.println(cd.collectiondata.contains("Java"));
	}
}
