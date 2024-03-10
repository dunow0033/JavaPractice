import java.util.Scanner;

public class TenPercentOff {
	public static void main(String[] args) {
		
		int total, quantity;
		
		System.out.print("Enter the quantity:  ");
		
		Scanner s = new Scanner(System.in);
		
		quantity = s.nextInt();
		
		total = calculateTotal(quantity);
		
		System.out.println("Quantity purchased:  " + quantity);
		System.out.println("Total paid:  " + total);
		
		s.close();
	}
	
	public static int calculateTotal(int quantity) {
		int total = quantity * 100;
		
		if(quantity > 1000) {
			total -= (total / 10);
		}
		
		return total;
	}
}
