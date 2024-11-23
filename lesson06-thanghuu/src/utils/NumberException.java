package utils;

public class NumberException extends RuntimeException{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2493646556749876026L;

	public NumberException() {
		// TODO Auto-generated constructor stub
		this("Vui long nhap dung gia tri so");
	}

	public NumberException(String message) {
		super(message);
	}
	
	
	
}
