package exception;

public class InvalidEmail extends RuntimeException {
	public InvalidEmail() {
		this("Email không hợp lệ, vui lòng nhập đúng định dạng email!!");
	}
	public InvalidEmail(String message) {
		super(message);
	}
}
