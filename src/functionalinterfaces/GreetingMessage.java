package functionalinterfaces;

public class GreetingMessage {
	public void display()
	{
		Greeting morning = (message) ->
		{
			System.out.println("Good morning " + (message));
		};
		morning.greet("Brian");
		
		Greeting evening = (message) ->
		{
			System.out.println("Good evening " + (message));
		};
		
		evening.greet("Andy");
		
		Greeting birthday = (message) ->
		{
			System.out.println("Happy Birthday " + (message));
		};
		
		birthday.greet("Tommy");
	}
	
	public static void main(String[] args) {
		GreetingMessage gm = new GreetingMessage();
		gm.display();
	}
}
