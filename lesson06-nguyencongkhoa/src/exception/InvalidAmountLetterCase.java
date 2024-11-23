package exception;

public class InvalidAmountLetterCase extends Exception{

	private static final long serialVersionUID = 3353025912407749356L;

	public InvalidAmountLetterCase() {
		this("Invalid amount of letter case (At least 1 lowercase && 1 uppercase alphabetic character) !!");
	}
	
	public InvalidAmountLetterCase(String message) {
		super(message);
	}
	
}
