package exception;

public class PatternException extends Exception{
	public PatternException () {
		this("Pattern Systax Exception");
	}
	
	public PatternException (String message) {
		super(message);
	}
}
