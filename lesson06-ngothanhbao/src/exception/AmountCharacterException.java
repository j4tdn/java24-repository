package exception;

public class AmountCharacterException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6958962213383562438L;
	
	public AmountCharacterException() {
		this("Invalid Number");
	}
	
	public AmountCharacterException(String message) {
		super(message);
	}
	
}
