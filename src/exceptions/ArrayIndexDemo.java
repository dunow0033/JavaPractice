package exceptions;

public class ArrayIndexDemo {
	int arr[];
	public ArrayIndexDemo()
	{
		arr=new int[] {20,10,12,0};
	}
	public void display()
	{
		for(int x=0;x<=arr.length;x++)
		{
			System.out.println("Value is "+arr[x]);
		}
	}
	public static void main(String[] args) {
		ArrayIndexDemo arrind=new ArrayIndexDemo();
		
		try {
			arrind.display();
		} 
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array index out of bounds exception caught");
		}
	}

}
