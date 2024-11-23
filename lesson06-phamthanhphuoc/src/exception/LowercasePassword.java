package exception;

public class LowercasePassword extends RuntimeException {
	 public LowercasePassword() {
	        this("Mật khẩu phải chứa ít nhất 1 chữ cái viết thường!!!");
	    }
	    public LowercasePassword(String message) {
	        super(message);
	    }
}
