import java.util.Scanner;

public class ThreeSubjects {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please enter the mark for the first subject:  ");
		
		double firstMark = sc.nextDouble();
		
		System.out.print("Please enter the mark for the second subject:  ");
		
		double secondMark = sc.nextDouble();
		
		System.out.print("Please enter the mark for the third subject:  ");
		
		double thirdMark = sc.nextDouble();
		
		System.out.println("Total marks:  " + (int)(firstMark + secondMark + thirdMark));
		
		System.out.println("Percentage:  " + (firstMark + secondMark + thirdMark) / 300 * 100);
		
		sc.close();
	}
}
