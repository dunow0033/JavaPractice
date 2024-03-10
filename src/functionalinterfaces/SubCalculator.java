package functionalinterfaces;

public class SubCalculator implements Calculator {
	
	@Override
	public void calculate(int x, int y) {
		System.out.println("Difference is " + (x - y));
	}

}
