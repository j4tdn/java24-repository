package exception;

public class LengthPassword extends RuntimeException  {
	  public LengthPassword( ) {
	        this("Mật khẩu phải có độ dài từ 8-256 kí tự!!!");
	    }

	    public LengthPassword(String message) {
	        super(message);
	    }
}
