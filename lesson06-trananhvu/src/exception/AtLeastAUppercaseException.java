package exception;

public class AtLeastAUppercaseException extends RuntimeException {
    public AtLeastAUppercaseException() {
        this("Mật khẩu phải chứa ít nhất 1 chữ cái viết hoa!!!");
    }
    public AtLeastAUppercaseException(String message) {
        super(message);
    }
}
