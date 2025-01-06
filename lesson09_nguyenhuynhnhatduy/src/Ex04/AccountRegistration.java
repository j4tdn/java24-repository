package Ex04;

import java.util.Scanner;

public class AccountRegistration {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("----- Đăng ký tài khoản -----");

        System.out.print("Nhập tên tài khoản: ");
        String username = scanner.nextLine();

        boolean isPasswordValid = false;
        String password = "";

        while (!isPasswordValid) {
            try {
                System.out.print("Nhập mật khẩu: ");
                password = scanner.nextLine();

                
                validatePassword(username, password);

               
                isPasswordValid = true;

            } catch (Exception e) {
                
                System.out.println("Lỗi: " + e.getMessage());
            }
        }

        System.out.println("Đăng ký tài khoản thành công!");
        System.out.println("Tài khoản: " + username);
    }

    
    public static void validatePassword(String username, String password) throws Exception {
       
        if (password.length() < 8) {
            throw new Exception("Mật khẩu phải có độ dài >= 8 ký tự!");
        }

        
        if (!containsDigit(password)) {
            throw new Exception("Mật khẩu phải chứa ít nhất 1 chữ số!");
        }

       
        if (!containsUppercase(password)) {
            throw new Exception("Mật khẩu phải chứa ít nhất 1 chữ cái in hoa!");
        }

        
        if (!containsSpecialCharacter(password)) {
            throw new Exception("Mật khẩu phải chứa ít nhất 1 ký tự đặc biệt (~!@#$%^&*)!");
        }

       
        if (countMatchingCharacters(username, password) > 3) {
            throw new Exception("Mật khẩu không được trùng quá 3 ký tự với tên tài khoản!");
        }
    }

    
    private static boolean containsDigit(String str) {
        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) {
                return true;
            }
        }
        return false;
    }

    
    private static boolean containsUppercase(String str) {
        for (char c : str.toCharArray()) {
            if (Character.isUpperCase(c)) {
                return true;
            }
        }
        return false;
    }

   
    private static boolean containsSpecialCharacter(String str) {
        String specialChars = "~!@#$%^&*";
        for (char c : str.toCharArray()) {
            if (specialChars.contains(String.valueOf(c))) {
                return true;
            }
        }
        return false;
    }

  
    private static int countMatchingCharacters(String username, String password) {
        int count = 0;
        for (char c : password.toCharArray()) {
            if (username.contains(String.valueOf(c))) {
                count++;
            }
        }
        return count;
    }
}
