package lesson06_nguyenhuynhnhatduy;

import java.util.Scanner;

public class Ex02 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int max = 5;
	int min = 0;
	
	while(min<max) {
		try {
			System.out.println("Enter create your password ");
			String pass = sc.nextLine();
			checkPassword(pass);
		} catch (Exception e) {
			System.out.println("error" + e.getMessage());
			min++;
			if(min == max) {
				System.out.println("Re-enter up to 5 times.");
			}
		}
	}
	
}

public static boolean checkPassword(String password) throws Exception {
	if(password.length() <8 || password.length() >256) {
		throw new Exception("Password must is more long than 8 character and less 256 character. Please enter again");
		
	}
	if(!password.matches(".*[a-z]*.")) {
		throw new Exception("Password has must least one lowercase character. Please enter again");

	}
	if(!password.matches(".*[A-Z]*.")) {
		throw new Exception("Password has must least one uppercase character. Please enter again");

	}
	if(!password.matches(".*[1-9]*.")) {
		throw new Exception("Password has must least one numer. Please enter again");

	}
	if (!password.matches(".*[!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>/?].*")) {
	    throw new Exception("Password must contain at least one special character. Please enter again.");
	}

	
	return true   ;
	
}
}
