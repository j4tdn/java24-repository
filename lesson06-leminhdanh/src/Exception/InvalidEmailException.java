package Exception;

public class InvalidEmailException extends IllegalArgumentException {
	
	public InvalidEmailException(String message) {
		super(message);
	}
	
}
