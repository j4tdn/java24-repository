package exception;

public class AtLeastALowercaseException extends RuntimeException {
    public AtLeastALowercaseException() {
        this("Mật khẩu phải chứa ít nhất 1 chữ cái viết thường!!!");
    }
    public AtLeastALowercaseException(String message) {
        super(message);
    }
}
