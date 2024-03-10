package collections.day2;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo {

	public static void main(String args[])
	{
		Map<String, Integer> students = new Hashtable<>();
		
		students.put("Navin", 56);
		students.put("Harsh", 23);
		students.put("Sushil", 67);
		students.put("Kiran", 56);
		students.put("Kiran4", 567);
		students.put("Kiran", 561);
		
		System.out.println(students);
		
		System.out.println(students.keySet());
		
		for(String key : students.keySet())
		{
			System.out.println(key + " : " + students.get(key));
		}
	}
}
