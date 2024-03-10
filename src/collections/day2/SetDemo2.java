package collections.day2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo2 {
	
	
	
	public static void main(String args[]) {
		
		Set<Integer> nums = new TreeSet<Integer>();
		Set<Integer> nums2 = new HashSet<Integer>();
		
		nums.add(62);
		nums.add(51);
		nums.add(48);
		nums.add(27);
		nums.add(62);
		
		for(int n : nums)
		{
			System.out.println(n);
		}
		System.out.println();
		
		Iterator<Integer> values = nums.iterator();
		
		while(values.hasNext())
			System.out.println(values.next());
	}
}
