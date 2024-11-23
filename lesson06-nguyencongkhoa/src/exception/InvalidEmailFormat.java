package exception;

public class InvalidEmailFormat extends Exception{

	private static final long serialVersionUID = 5051414773020738893L;
	
	public InvalidEmailFormat() {
		this("Invalid format email (username@domain.com)");
	}
	
	public InvalidEmailFormat(String message) {
		super(message);
	}
	
}
