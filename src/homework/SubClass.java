package homework;

public class SubClass extends ClassA {

	@Override
	void a_method() {
		System.out.println("This is abstract method");
	}
	
	public static void main(String args[]) {
		SubClass sub = new SubClass();
		
		sub.a_method();
		
		sub.nonAbstractMethod();
	}
}
