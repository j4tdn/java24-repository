package exception;

public class InvalidAgeException extends Exception {

	private static final long serialVersionUID = -8639637553249410321L;
	public InvalidAgeException() {
		this("Age required is not valid !!!");
	}
	public InvalidAgeException(String  message) {
		super(message);
	}
	
	

}
