package exception;

public class CharacterPassword extends RuntimeException {
	public CharacterPassword() {
		this("Mật khẩu phải chứa ít nhất 1 ký tự đặt biệt");
	}
	private CharacterPassword(String message) {
		super(message);
	}

}
