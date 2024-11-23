package exception;

public class NumberPassword extends RuntimeException {
	
	public NumberPassword() {
		this("mật khẩu phải chứa ít nhất 1 chữ số !!!");
	}
	private NumberPassword(String massage) {
		super(massage);
	}

}
