package homework;

public abstract class ClassA {
	
	public ClassA() {
		System.out.println("This is constructor of abstract class.");
	}
	
	abstract void a_method();
	
	public void nonAbstractMethod(){
		System.out.println("This is a normal method of abstract class.");
	}
}
