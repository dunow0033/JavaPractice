package interfaces3;

interface A
{
	int age = 43;
	String area = "Indy";
	
	void show();
	void config();
}

class B implements A, X
{

	@Override
	public void show() {
		System.out.println("in show");
	}

	@Override
	public void config() {
		System.out.println("in config");
		
	}

	@Override
	public void run() {
		System.out.println("running..");
	}
}

interface X
{
	void run();
}

interface Y extends X
{
	void run();
}

public class DemoClass {
	public static void main(String args[])
	{
		A obj = new B();
		obj.show();
		obj.config();
		
		X obj1 = new B();
		obj1.run();
		
		System.out.println(A.area);
	}
}
