package functionalinterfaces;

public class CalculatorLambda {
	public void display()
	{
		Calculator subobj = (x, y) ->
		{
			System.out.println("Subtraction is " + (x - y));
		};
		
		subobj.calculate(70, 20);
	}
	
	public static void main(String[] args) {
		CalculatorLambda clamb = new CalculatorLambda();
		
		clamb.display();
		
		Calculator add = (num1, num2) ->
		{
			System.out.println("Addition is " + (num1 + num2));
		};
		add.calculate(20, 30);
	}
}
