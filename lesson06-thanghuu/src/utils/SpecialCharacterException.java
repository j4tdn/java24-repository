package utils;

public class SpecialCharacterException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5064574103408542975L;

	public SpecialCharacterException() {
		// TODO Auto-generated constructor stub
		this("Mat khau yeu cau phai co 1 ky tu dac biet!");
	}

	public SpecialCharacterException(String message) {
		super(message);
	}
	
	
	
}
