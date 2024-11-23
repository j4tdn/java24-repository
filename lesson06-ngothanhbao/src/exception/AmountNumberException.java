package exception;

public class AmountNumberException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3921199787473843907L;
	
	public AmountNumberException() {
		this("Invalid Number Amount");
	}
	
	public AmountNumberException(String message) {
		super(message);
	}
	
	
}
