package exception;

public class RequireLengthException extends RuntimeException {
    public RequireLengthException( ) {
        this("Mật khẩu phải có độ dài từ 8-256 kí tự!!!");
    }

    public RequireLengthException(String message) {
        super(message);
    }
}
