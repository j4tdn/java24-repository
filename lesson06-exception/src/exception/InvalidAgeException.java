package exception;

public class InvalidAgeException extends RuntimeException {
    public InvalidAgeException() {
        this("Invalid age");
    }

    public InvalidAgeException(String message) {
        super(message);
    }
}
