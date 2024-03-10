package interfaces;

public class Vendor implements Details{
	@Override
	public void acceptDetails() {
		System.out.println("Accepting details of vendor"+x);
		
	}
	
	@Override
	public void acceptEducationDetails() {
		System.out.println("Accepting education details of vendor"+x);
		
	}
}
