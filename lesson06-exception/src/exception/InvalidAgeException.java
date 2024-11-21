package exception;

import java.io.IOException;

public class InvalidAgeException extends IOException {

	// Trả lời vào lesson13 xử lý file
	// Liên quan đến cách lưu trữ dữ lliệu xuống file, memory
	private static final long serialVersionUID = -8639637553249410321L;

	public InvalidAgeException() {
		this("Age required is not valid !!");
	}

	public InvalidAgeException(String message) {
		super(message);
	}
}
