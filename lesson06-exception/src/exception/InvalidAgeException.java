package exception;

public class InvalidAgeException extends Exception {

	// Trả lời vào lesson13 xử lý file
	// Liên quán đến cách lưu trữ dữ liệu xuống file, memory
	private static final long serialVersionUID = -8639637553249410321L;
	
	public InvalidAgeException() {
		this("Age required is not valid !!!");
	}
	
	public InvalidAgeException(String message) {
		super(message);
	}
	
}