package exception;

public class InvalidAgeException extends Exception {
	
	// Trả lời vào lesson13 xử lí file
	// Liên quan đến cách lưu trữ dữ liệu xuống file, memory
	private static final long serialVersionUID = -8639637553249410321L;
	
	
	// ?? google để hiểu tại sao lại làm 2 hàm rườm rà như vậy
	public InvalidAgeException() {
		this("Age required is not valid");
	}
	
	public InvalidAgeException(String message) {
		super(message);
	}

}
