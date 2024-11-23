package exception;

public class NoLowerException extends Exception{
	public NoLowerException() {
		this("Mật khẩu k có kí tự thường");
	}
	
	public NoLowerException(String message) {
		super(message);
	}
}
