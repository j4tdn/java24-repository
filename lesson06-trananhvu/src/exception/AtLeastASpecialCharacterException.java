package exception;

public class AtLeastASpecialCharacterException extends RuntimeException{
    public AtLeastASpecialCharacterException() {
        this("Mật khẩu phải chứa ít nhất 1 kí tự đặc biệt");
    }
    public AtLeastASpecialCharacterException(String message) {
        super(message);
    }
}
