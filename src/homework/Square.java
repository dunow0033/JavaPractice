package homework;

public class Square extends Rectangle {
	
	@Override
	public void printText() {
		System.out.println("Square is a rectangle");
	}
	
	public static void main(String args[]) {
		Shape shape = new Square();
		
		shape.printText();
		
		Rectangle rectangle = new Square();
		
		rectangle.printText();
		
		Shape circle = new Circle();
		
		circle.printText();
	}
}
