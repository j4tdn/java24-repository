package exception;

public class AlphabeticCharacterException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -16727565894758480L;
	
	public AlphabeticCharacterException() {
		this("Invalid Alphabetic");
	}
	
	public AlphabeticCharacterException(String message) {
		super(message);
	}
	
}
