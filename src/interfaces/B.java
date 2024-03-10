package interfaces;

public class B extends Marks {
	
	private int mark1;
	private int mark2;
	private int mark3;
	private int mark4;
	
	public B(int mark1, int mark2, int mark3, int mark4) {
		this.mark1 = mark1;
		this.mark2 = mark2;
		this.mark3 = mark3;
		this.mark4 = mark4;
	}
	
	@Override
	public double getPercentage() {
		return (mark1 + mark2 + mark3 + mark4)/400*100;
	}
	
	public static void main(String args[]) {
		B b = new B(91, 94, 95, 97);
		
		System.out.println(b.getPercentage());
	}
}
