package exception;

public class InvalidStringException extends Exception {

	private static final long serialVersionUID = 1L;
	
	public InvalidStringException() {
		this("String không hợp lệ (phải có dấu, và khoảng cách)");
		
	
	}

	public InvalidStringException(String string) {
		super(string);
	
	}
	
	}

