import java.util.Scanner;

public class InterestCalculator {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please input your balance:  ");
		
		double balance = sc.nextDouble();
		
		if(balance > 50000 && balance < 100000) {
			System.out.println("Your interest rate is 7%, and your new balance will be " + balance * 1.07);
		}
		else if(balance > 100000) {
			System.out.println("Your interest rate is 6%, and your new balance will be " + balance * 1.06);
		}
		
		sc.close();
	}
}
