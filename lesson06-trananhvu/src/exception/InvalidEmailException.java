package exception;

public class InvalidEmailException extends RuntimeException {
    public InvalidEmailException() {
        this("Email không hợp lệ!!!");
    }
    public InvalidEmailException(String message) {
        super(message);
    }
}
