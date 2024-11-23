package utils;

public class LengthException extends RuntimeException{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6645699795954356314L;

	public LengthException() {
		this("Mat khau phai co do dai 8-256 ky tu!!!");
	}
	
	public LengthException(String message) {
		super(message);
	}
}
