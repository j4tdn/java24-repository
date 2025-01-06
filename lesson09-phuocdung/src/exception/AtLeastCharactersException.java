package exception;

public class AtLeastCharactersException extends RuntimeException {
	public AtLeastCharactersException() {
		this("Có ít nhất 1 chữ số, 1 kí tự in hoa, một kí tự đặc biệt (~!@#$%^&*) và tối thiểu 8 kí tự");
	}
	public AtLeastCharactersException(String message) {
		super(message);
	}

}
