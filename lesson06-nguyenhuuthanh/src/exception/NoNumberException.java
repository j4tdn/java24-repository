package exception;

public class NoNumberException extends Exception{
	public NoNumberException() {
		this("Mật khẩu không có số");
	}
	
	public NoNumberException(String message) {
		super(message);
	}

}
