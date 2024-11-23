package exception;

public class Ex03CustomException {
	
	public static void main(String[] args) {
		
		try {
			System.out.println("validate 18 --> " + validate(18));
		} catch (InvalidAgeException e) {
			// TODO: handle exception
			System.out.println("exp --> mesage: " + e.getMessage());
		}
		
		try {
			System.out.println("validate 12 --> " + validate(12));
		} catch (InvalidAgeException e) {
			System.out.println("exp --> mesage: " + e.getMessage());
		}
		
	}
	
	private static boolean validate(int age) throws InvalidAgeException {
		if (age < 16) {
			throw new InvalidAgeException();
		}
		return true;
	}
	
}
