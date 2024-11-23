package utils;

public class UpcaseException extends RuntimeException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1468346102552896506L;

	public UpcaseException() {
		// TODO Auto-generated constructor stub
		this("mat khau phai chua it nhat 1 ky tu hoa!");
	}

	public UpcaseException(String message) {
		super(message);
	}
	
	
	
}
