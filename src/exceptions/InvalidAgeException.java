package exceptions;

public class InvalidAgeException extends RuntimeException {
	
	@Override
	public String getMessage()
	{
		return "Trying to enter invalid age";
	}
}
