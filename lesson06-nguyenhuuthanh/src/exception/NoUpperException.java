package exception;

public class NoUpperException extends Exception {
	public NoUpperException() {
		this("Mật khẩu không có ký tự hoa");
	}
	public NoUpperException(String message) {
		super(message);
	}
}
