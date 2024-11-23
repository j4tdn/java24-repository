package utils;

public class LowercaseException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4962084121808667813L;

	public LowercaseException() {
		// TODO Auto-generated constructor stub
		this("Mat khau phai chua it nhat 1 chu cai viet thuong!");
	}

	public LowercaseException(String message) {
		super(message);
	}
	
	
}
