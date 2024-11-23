package view;

public class Ex06CustomException {

	public static void main(String[] args) {
		try {
			System.out.println("Validate 18 --> " + validate(18));
		} catch (Exception e) {
			System.out.println("exp1 --> message: " + e.getMessage());
		}
		
		
		try {
			System.out.println("Validate 12 -->");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	private static void validate(int age) {
		if(age<16) {
			throw new InvalidAgeException();
		}
		return true;
	}
}
