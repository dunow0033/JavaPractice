package exceptions;

public class InvalidAmountException extends Exception {
	
//	public InvalidAmountException(String string)
//	{
//		super(string);
//	}
	
	@Override
	public String getMessage()
	{
		return "Trying to enter invalid amount";
	}
}
