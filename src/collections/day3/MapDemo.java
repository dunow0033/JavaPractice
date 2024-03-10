package collections.day3;

import java.util.*;

public class MapDemo {
	
	private Map<Integer, String> mapd;
	
	private Scanner sc;
	
	public MapDemo()
	{
		mapd = new HashMap<>();
	}
	
	public void insert()
	{
		mapd.put(1, "Spring Framework");
		mapd.put(2, "Hibernate Framework");
		mapd.put(3, "Core Java");
		mapd.put(4, "Linux");
	}
	
	public void display()
	{
		
		Set<Map.Entry<Integer, String>> mapset = mapd.entrySet();
		Set<Integer> keyset = mapd.keySet();
		Collection<String> set = mapd.values();
		
		for(String s:set)
		{
			System.out.println(s);
		}
		
		System.out.println();
		
		for(Integer i : keyset)
		{
			System.out.println(i);
		}
		
		for(Map.Entry<Integer, String> mapd : mapset)
		{
			System.out.println("Key of entry is " + mapd.getKey());
			System.out.println("Value of entry is " + mapd.getValue());
		}
		
//		for(Map.Entry<Integer, String> mapd:mapset)
//		{
//			System.out.println("Key of entry is " + mapd.getKey());
//			String val = mapd.getValue();
//			System.out.println("Value is " + val);
//		}
	}
	
	public void search()
	{
		System.out.println("Enter the key for which you want to search the records");
		int key = sc.nextInt();
		String value = mapd.get(key);
//		System.out.println("Enter the key for which you want to search for record");
//		int key = sc.nextInt();
//		String value = mapd.get(key);
//		System.out.println("Value against key is " + value);
	}
	public static void main(String args[])
	{
		MapDemo mapobj = new MapDemo();
		mapobj.insert();
		mapobj.display();
		//mapobj.search();
	}
}
