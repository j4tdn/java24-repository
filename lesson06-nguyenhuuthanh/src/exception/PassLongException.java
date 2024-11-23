package exception;

public class PassLongException extends Exception{
	public PassLongException() {
		this("Mật khẩu quá dài");
	}
	public PassLongException(String mess) {
		super(mess);
	}

}
