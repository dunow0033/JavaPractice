package newpackage;

public class ArrayPractice {
	
	private static String names[];
	private static int nums[];
	
	public static void main(String[] args) {
		
		names = new String[5];
		nums = new int[4];
		
		int x = 1;
		
		for(;x < 5;)
		{
			System.out.println(x);
			x++;
		}
		
//		int nums2[] = new int[10];
//		
//		for(int i = 0; i < nums2.length; i++)
//		{
//			nums2[i] = 2 * i;
//		}
//		
//		for(int a:nums2)
//		{
//			System.out.println(a);
//		}
//		
//		for(int j = 0; j < names.length; j++)
//		{
//			names[j] = "ag" + j;
//		}
//		
//		for(int j = 0; j < nums.length; j++)
//		{
//			nums[j] = j;
//		}
//		
//		for(String s:names)
//		{
//			System.out.println(s);
//		}
//		
//		for(int i:nums)
//		{
//			System.out.println(i);
//		}
	}
}
