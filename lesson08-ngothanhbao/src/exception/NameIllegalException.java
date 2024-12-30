package exception;

public class NameIllegalException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1978198095344888310L;
	
	public NameIllegalException() {
		this("Name is not allowed");
	}

	public NameIllegalException(String message) {
		super(message);
	}
	
	
}
