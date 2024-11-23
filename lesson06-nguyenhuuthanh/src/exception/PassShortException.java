package exception;

public class PassShortException extends Exception{
	
	public PassShortException() {
		this("Mật khẩu quá ngắn");
	}
	public PassShortException(String mess) {
		super(mess);
	}

}
