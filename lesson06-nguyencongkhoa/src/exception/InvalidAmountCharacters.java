package exception;

public class InvalidAmountCharacters extends Exception{

	private static final long serialVersionUID = -5711466689549173143L;

	public InvalidAmountCharacters() {
		this("Invalid amount of characters (Range: [8-256]) !!");
	}
	
	public InvalidAmountCharacters(String message) {
		super(message);
	}
	
}
