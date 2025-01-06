package exception;

public class AtLeastANumberException extends RuntimeException {
    public AtLeastANumberException() {
        this("Mật khẩu phải chứa ít nhất 1 chữ số!!!");
    }
    public AtLeastANumberException(String message) {
        super(message);
    }
}