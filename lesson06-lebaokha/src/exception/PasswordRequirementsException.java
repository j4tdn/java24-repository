package exception;

public class PasswordRequirementsException extends RuntimeException {

	private static final long serialVersionUID = 7958996799520147906L;

	public PasswordRequirementsException() {
		this("Mật khẩu chưa đúng yêu cầu!!!");
	}

	public PasswordRequirementsException(String message) {
		super(message);
	}
}
