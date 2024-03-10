import java.util.Scanner;

public class MinMax {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int a, b, c;
		
		System.out.print("Enter your first number:  ");
		a = s.nextInt();
		System.out.print("Enter your second number:  ");
		b = s.nextInt();
		System.out.print("Enter your third number:  ");
		c = s.nextInt();
		
		System.out.println();
		System.out.println("Max of the numbers:  " + max(a, b, c));
		System.out.println("Min of the numbers:  " + min(a, b, c));
		
		s.close();
	}
	
	public static int max(int num1, int num2, int num3) {
		return Math.max(num1, Math.max(num2, num3));
	}
	
	public static int min(int num1, int num2, int num3) {
		return Math.min(num1, Math.min(num2, num3));
	}
}
