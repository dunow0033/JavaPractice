package playablehomework;

public class Volleyball implements Playable {

		@Override
		public void play() {
			System.out.println("Playing some volleyball!!");	
		}
		
		public static void main(String args[]) {
			Volleyball volleyball = new Volleyball();
			
			volleyball.play();
		}
	}

