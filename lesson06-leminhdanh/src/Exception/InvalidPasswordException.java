package Exception;

public class InvalidPasswordException extends IllegalArgumentException {
	
	public InvalidPasswordException() {
		this("Password is no valid!!");
	}
	
	public InvalidPasswordException(String message) {
		super(message);
	}
}
