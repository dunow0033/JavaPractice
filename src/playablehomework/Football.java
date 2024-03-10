package playablehomework;

public class Football implements Playable {

	@Override
	public void play() {
		System.out.println("Playing some football!!");
		
	}
	
	public static void main(String args[]) {
		Football football = new Football();
		
		football.play();
	}
	
}
