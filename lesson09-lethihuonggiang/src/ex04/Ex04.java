package ex04;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Ex04 {

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);

        System.out.print("Nhập tài khoản: ");
        String username = ip.nextLine();

        while (true) {
            System.out.print("Mật khẩu: ");
            String password = ip.nextLine();

            if (isValidPassword(password, username)) {
                System.out.println("Đăng ký tài khoản thành công!");
                break; 
            } else {
                System.out.println("Đăng ký lại");
            }
        }

        ip.close();
    }

    // Anh đọc qua cách làm thì thấy sai
    // Chưa xử lý được
    private static boolean isValidPassword(String password, String username) {
    	// Tên một số hàm chưa ổn lắm em hi, nên là 1 cụm động từ
        return isLength(password) && 
               containsDigit(password) && 
               containsUppercase(password) && 
               specialCharacter(password) && 
               isNotTooSimilar(password, username);
    }

    private static boolean isNotTooSimilar(String password, String username) {
		// TODO Auto-generated method stub
		return false;
	}

	private static boolean containsDigit(String password) {
		// TODO Auto-generated method stub
		return false;
	}

	private static boolean isLength(String password) {
        return password.length() >= 8;
    }

    private static boolean numberDigit(String password) {
        return Pattern.compile("[0-9]").matcher(password).find();
    }

    private static boolean containsUppercase(String password) {
        return Pattern.compile("[A-Z]").matcher(password).find();
    }

    private static boolean specialCharacter(String password) {
        return Pattern.compile("[~!@#$%^&*]").matcher(password).find();
    }

    private static boolean quantity(String password, String username) {
        int matchingChars = 0;
        for (char c : username.toCharArray()) {
            if (password.contains(String.valueOf(c))) {
                matchingChars++;
            }
        }
        return matchingChars <= 3;
    }
}