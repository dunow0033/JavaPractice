import java.util.Scanner;

public class HelloWorld {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please enter your number:  ");
		int num = sc.nextInt();
		
		System.out.println("The square of your number is " + Math.pow(num, 2));
		
		sc.close();
	}
}
