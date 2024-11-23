package view;
import exception.*;
import java.util.Scanner;

    /*
        Link video: https://1drv.ms/v/c/ec838824905fa95d/EZEBoonSjNpOj6_eCVRbwbwBdTFy_GaZpy6cyfy6HCgb0A?e=HjJVpK
    */

public class Ex02 {

    private static boolean isPassword(String password) {
        if(password.length() < 8 || password.length() > 256 ) {
            throw new RequireLengthException();
        }
        if(!password.matches(".*[a-z].*")){
            throw new AtLeastALowercaseException();
        }
        if(!password.matches(".*[A-Z].*")){
            throw new AtLeastAUppercaseException();
        }
        if(!password.matches(".*[0-9].*")){
            throw new AtLeastANumberException();
        }
        if(!password.matches(".*[^a-zA-Z0-9].*")){
            throw new AtLeastASpecialCharacterException();
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int count = 5;
        boolean isPassword = false;
        String password = "";
        do {
            try {
                System.out.print("Nhập mật khẩu: ");
                password = ip.nextLine();
                isPassword = isPassword(password);
                break;
            }catch (RuntimeException e) {
                count --;
                System.out.println("---------------------------");
                System.out.println(e.getMessage());
                System.out.println("Vui lòng nhập lại!!!");
                System.out.println("Còn " + count +" lần!");
            }
        }while (count > 0);
        if(isPassword) {
            System.out.println("Đăng ký thành công!!!");
        } else {
            System.out.println("Đăng ký không thành công!!!");

        }
    }
}
