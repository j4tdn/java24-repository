package view;

import exception.InvalidAgeException;

public class Ex06CustomException {
	
	/* Khi try catch với
	 + runtime exc: catch bất kỳ RE nào mà ko quan tâm đến code trong khối try
	 
	 + compile exc (ngoại trừ Exception): chỉ được phép catch CE nếu trong khối try đang dùng code/
	 hàm nào đó yêu cầu xử lý catch exc thì mới được phép
	 
	 */
	
	public static void main(String[] args) {
		//phải try catch chỗ này luôn vì nó compile
		//System.out.println("validate 18 --> " + validate(18));
		
		//khi try catch cho runtime thì ok, EXC thì phải có hàm hay code gì đó xử lí liên quan đến exc đó
		try {
			System.out.println("validate 15 --> " + validate(15));
		} catch (InvalidAgeException e) {
			System.out.println("exc --> message: " + e.getMessage());
		}
		
		System.out.println("...");
	}
	
	// trong hàm throw compile mà kh throws là kh dc
	private static boolean validate(int age) throws InvalidAgeException {
		if (age < 16) {
			throw new InvalidAgeException("Age " + age + "   is invalid, please re-enter !!");
		}
		return true;
	}
	
}
