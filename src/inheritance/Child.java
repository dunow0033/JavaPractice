package inheritance;

public class Child extends Base {
	public Child()
	{
		//super();//it will call the constructor of super class.
		System.out.println("Child class constructor");
	}
	public Child(int x)
	{
		System.out.println("This is child class constructor"+x);
	}
	
	public void printOut() {
		System.out.println("helo");
	}
	
	public static void main(String[] args) {
		Child c1=new Child();
		Child ch2=new Child(30);
		Base b1 = new Base();
		
		c1.printOut();
		b1.printOut();
	}
}
