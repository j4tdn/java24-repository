package exception;

public class PrefixEmailException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4112207688843507721L;
	
	public PrefixEmailException() {
		this("Invalid Prefix Email");
	}
	
	public PrefixEmailException(String message) {
		super(message);
	}
	
}
