package functionalinterfaces;

public class AppMain {
	public static void main(String[] args) {
		AddCalculator addobj = new AddCalculator();
		addobj.calculate(90, 20);
		AddCalculator subobj = new AddCalculator();
		subobj.calculate(70, 20);
	}
}
