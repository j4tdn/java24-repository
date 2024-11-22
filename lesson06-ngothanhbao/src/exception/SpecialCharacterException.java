package exception;

public class SpecialCharacterException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5570638137962309543L;
	
	public SpecialCharacterException() {
		this("Invalid Special Character Exception");
	}
	
	public SpecialCharacterException(String message) {
		super(message);
	}
	
}
