package exception;

import java.io.IOException;

public class InvalidAgeException extends IOException {

	// Giải thích sau
	private static final long serialVersionUID = -4889672318420471801L;

	public InvalidAgeException() {
		this("Age required is not valid !!!");
		
	}
	
	public InvalidAgeException(String message) {
		super(message);
	}
	

}
