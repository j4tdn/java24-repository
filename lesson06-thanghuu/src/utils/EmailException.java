package utils;

public class EmailException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 411411930348431732L;

	public EmailException() {
		// TODO Auto-generated constructor stub
		this("Vui long nhap dung dinh dang email!");
	}

	public EmailException(String message) {
		super(message);
	}
	
}
