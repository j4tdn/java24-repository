package exception;

public class InvalidAmountNumber extends Exception{
	
	private static final long serialVersionUID = 1L;

	public InvalidAmountNumber() {
		this("Invalid amount of number (At least 1 number) !!");
	}
	
	public InvalidAmountNumber(String message) {
		super(message);
	}
	
}
