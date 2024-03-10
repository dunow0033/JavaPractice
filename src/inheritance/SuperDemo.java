package inheritance;

class A
{
	public A()
	{
		System.out.println("in A");
	}
	public A(int n)
	{
		System.out.println("in A int " + n);
	}
}

class B extends A
{
	public B()
	{
		System.out.println("in B");
	}
	public B(int n)
	{
		super(n);
		System.out.println("in B int " + n);
	}
}

public class SuperDemo 
{
	public static void main(String a[]) 
	{
		B obj = new B(5);
	}
}
