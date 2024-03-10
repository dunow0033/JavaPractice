package inheritance;

class A2
{
	public void show()
	{
		System.out.println("in A show");
	}
	
	public void config()
	{
		System.out.println("in A Config");
	}
}

class B2 extends A2
{
	@Override
	public void show()
	{
		System.out.println("in B show");
	}	
}


public class OverrideDemo {
	public static void main(String args[])
	{
		B2 obj = new B2();
		obj.show();
		obj.config();
	}
}
