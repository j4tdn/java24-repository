package exception;

public class MatchWithAccountException extends RuntimeException {
    public MatchWithAccountException() {
        this("Mật khẩu không được trùng quá 3 kí tự với tài khoản!!!");
    }

    public MatchWithAccountException(String message) {
        super(message);
    }
}
