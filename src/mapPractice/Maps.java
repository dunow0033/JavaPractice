package mapPractice;

import java.util.*;

public class Maps {

	public static void main(String[] args)
	{
		String result = null;
		Map<String, Integer> hm = new HashMap<String, Integer>();
		
		hm.put("a", 100);
		hm.put("b", 200);
		hm.put("c", 300);
		hm.put("d", 800);
		
		Map<String, Integer> hm2 = new HashMap<String, Integer>();
		
		hm2.put("a", 200);
		hm2.put("b", 200);
		hm2.put("c", 300);
		hm2.put("d", 800);
		
		for(Map.Entry<String, Integer> me : hm.entrySet())
		{
			System.out.print(me.getKey() + ":  ");
			System.out.println(me.getValue());
		}
		
		for(Map.Entry<String, Integer> entry : hm.entrySet()) 
		{
			if(entry.getValue() == 200) {
				 result = entry.getKey();
			}
		}
		
		System.out.println(hm.equals(hm2));
		
		System.out.println(result);
		System.out.println(hm.get("d"));
		
		System.out.println(hm.containsValue(200));
		
		System.out.println(hm.entrySet());
		
		System.out.println(hm.keySet());
		
		System.out.println(hm.values());
		
		System.out.println(hm.isEmpty());
		
		hm.remove("b");
		
		System.out.println(hm.entrySet());
		
		hm.putAll(hm2);
		
		System.out.println(hm.entrySet());
	}
}
