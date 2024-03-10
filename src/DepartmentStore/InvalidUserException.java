package DepartmentStore;

public class InvalidUserException extends Exception{
	public String getMessage()
	{
		return "Invalid User!!!User cannot find in records";
	}

}
