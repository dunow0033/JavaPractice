package functionalinterfaces;

public class AddCalculator implements Calculator {
	
	@Override
	public void calculate(int x, int y) {
		System.out.println("Addition is " + (x + y));
	}
}
