package exception;

public class UppercasePassword extends RuntimeException {
	public UppercasePassword() {
		this("Mật khẩu phải có ít nhất 1 chữ viết hoa!!");
	}
	private UppercasePassword(String message) {
		super(message);
	}

}