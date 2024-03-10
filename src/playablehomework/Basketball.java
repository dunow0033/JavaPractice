package playablehomework;

public class Basketball implements Playable {

		@Override
		public void play() {
			System.out.println("Playing some basketball!!");	
		}
		
		public static void main(String args[]) {
			Basketball basketball = new Basketball();
			
			basketball.play();
		}
	}
