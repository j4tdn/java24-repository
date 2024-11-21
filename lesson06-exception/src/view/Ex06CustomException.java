package view;

import exception.InvalidAgeException;

public class Ex06CustomException {

	public static void main(String[] args) {
		// Khi try catch với:

		// + runtime exception: catch bất kỳ runtime exception nào mà ko quan tâm đến
		// code trong TRY

		// + compile exception(Ngoại trừ Exception): chỉ được phép catch compile
		// exception khi
		// khối try gọi đến 1 hàm mà trong hàm đó có throw ra compile exception,
		// vì thế mà throws được khai báo ở ngay tên hàm để báo hiệu cần được xử lí
		// trong try-catch

		try {
			System.out.println("Validate 12 --> " + validate(12));
		} catch (InvalidAgeException e) {
			System.out.println("exp --> message: " + e.getMessage());
		}
	}

	private static boolean validate(int age) throws InvalidAgeException {

		if (age < 16) {
			throw new InvalidAgeException("Age " + age + " Please Enter");
		}
		return true;
	}
}
