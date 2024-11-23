package view;
import exception.InvalidEmailException;
import java.util.Scanner;

    /*
        Link video: https://1drv.ms/v/c/ec838824905fa95d/EZEBoonSjNpOj6_eCVRbwbwBdTFy_GaZpy6cyfy6HCgb0A?e=HjJVpK
    */

public class Ex03 {

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        String email;

        do {
            try{
                System.out.print("Nhập email: ");
                email = ip.nextLine();
                if(!email.matches("^[\\w]+[-_.]{0,1}[\\w]+@([\\w-]+\\.)+[\\w-]{2,4}$")) {
                    throw new InvalidEmailException();
                }
                break;
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
                System.out.println("Vui lòng nhập lại!!!");
                System.out.println("-----------------------");
            }
        }
        while (true);
        System.out.println("Email hợp lệ!!!" );
        System.out.println(email);
    }
}
