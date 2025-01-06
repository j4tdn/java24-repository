package exception;

public class PasswordFormatException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8193937250880988922L;
	
	public PasswordFormatException() {
		this("Password is not accessible ");
	}
	
	public PasswordFormatException(String message) {
		super(message);
	}
	
}
