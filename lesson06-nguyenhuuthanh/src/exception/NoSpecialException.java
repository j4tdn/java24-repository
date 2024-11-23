package exception;

public class NoSpecialException extends Exception {
	public NoSpecialException() {
		this("Mật khẩu không có ký tự đặt biệt");
		
	}
	public NoSpecialException(String message) {
		super(message);
	}
}
