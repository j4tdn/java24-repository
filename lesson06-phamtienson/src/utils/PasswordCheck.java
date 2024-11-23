package utils;

public class PasswordCheck {
	
	public void validate( String password) throws Exception{
		if (password.length() < 8) {
			throw new Exception("Mật khẩu phải chứa ít nhất 8 kí tự!");
		}
		if (password.length() > 256) {
			throw new Exception("Mật khẩu không vượt quá 256 kí tự!");
		}
		if (!password.matches(".*[a-z].*")) {
			throw new Exception("Mật khẩu phải có ít nhất 1 chữ cái thường");
		}
		if (!password.matches(".*[A-Z].*")) {
			throw new Exception("Mật khẩu phải có ít nhất 1 chữ cái in hoa");
		}
		if (!password.matches(".*\\d.*")) {
			throw new Exception("Mật khẩu phải chứa ít nhất một chữ số");
		}
		if (!password.matches(".*[~!@#$%^&*()\\\\-_=+\\\\[\\\\]{}|;:,.<>/?].*")) {
			throw new Exception("Mật khẩu phải chứa ít nhất một kí tự đặc biệt");
		}
	}

}
