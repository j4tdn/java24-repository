package exception;

public class DateSyntaxException extends Exception{
	public DateSyntaxException() {
		this("Date Syntax Exception");
	}
	
	public DateSyntaxException (String message) {
		super(message);
	}
}
