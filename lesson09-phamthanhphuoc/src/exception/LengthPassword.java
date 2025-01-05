package exception;

public class LengthPassword extends RuntimeException  {
	  public LengthPassword( ) {
	        this("Mật khẩu phải có độ dài >= 8");
	    }

	    public LengthPassword(String message) {
	        super(message);
	    }
}