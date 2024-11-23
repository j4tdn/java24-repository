package exception;

public class InvalidAmountSpecialCharacter extends Exception{

	private static final long serialVersionUID = 2698776428465771683L;

	public InvalidAmountSpecialCharacter() {
		this("Invalid amount of special character (At least 1 number special character) !!");
	}
	
	public InvalidAmountSpecialCharacter(String message) {
		super(message);
	}
	
}
