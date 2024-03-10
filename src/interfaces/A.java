package interfaces;

public class A extends Marks {
	
	private int mark1;
	private int mark2;
	private int mark3;
	
	public A(int mark1, int mark2, int mark3) {
		this.mark1 = mark1;
		this.mark2 = mark2;
		this.mark3 = mark3;
	}
	
	@Override
	public double getPercentage() {
		return (mark1 + mark2 + mark3)/300*100;
	}
	
	public static void main(String args[]) {
		A a = new A(99, 84, 85);
		
		System.out.println(a.getPercentage());
	}
}
