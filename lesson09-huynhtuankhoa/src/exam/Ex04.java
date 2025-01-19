package exam;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		do {
			try {
				System.out.println("Enter username: ");
				String username = sc.nextLine();
				System.out.println("Enter password: ");
				String password = sc.nextLine();
				
				// A feedback trường hợp tổng quát
				// Em nên viết chung 1 hàm kiểu validate(...) rồi xử lý bên trong đó sẽ đẹp hơn
				validatePassLength(password);
				validateSpecialChar(password);
				validateSimilar(username, password);
				System.out.println("Register successfully");
				break;
			} catch (RegisterException e) {
				System.out.println("Error --> " + e.getMessage());
			}
		} while (true);
		
	}
	
	public static void validatePassLength(String pass) throws RegisterException {
		if (pass.length() < 8) {
			throw new RegisterException("The length of password must be equal or larger than 8");
		}
	}
	
	public static void validateSpecialChar(String pass) throws RegisterException {
		// Idea e làm phủ định tốt nhưng sẽ bị sót với trường hợp các kí tự không nằm trong
		// tập [a-zA-Z0-9], e nên tạo mảng chứa kí tự đặt biệt rồi xử lý đơn giản hơn 
		// không còn dùng reges cũng được
		if (pass.matches("[a-zA-Z0-9]+")) {
			throw new RegisterException("Password must have at least one speacial char");
		}
	}
	
	public static void validateSimilar(String name, String pass) throws RegisterException {
		int count = 0;
		for (int i = 0; i < name.length(); i++) {
			for (int j = 0; j < pass.length(); j++) {
				if (name.charAt(i) == pass.charAt(j)) {
					count++;
				}
				if (count > 3) {
					throw new RegisterException("Username cannot be similar over 3 characters with password");
				}
			}
		}
	}
} 

// Em nên tách ra 1 class cho sạch code
class RegisterException extends Exception {
	public RegisterException(String message) {
		super(message);
	}
}
