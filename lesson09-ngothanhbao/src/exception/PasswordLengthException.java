package exception;

public class PasswordLengthException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5622571341779075598L;
	
	public PasswordLengthException() {
		this("Password length is not enough!!!");
	}
	
	public PasswordLengthException(String message) {
		super(message);
	}
	
}
