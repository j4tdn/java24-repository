package nguyenthilannhu.Ex04;

import java.util.Scanner;

public class AccountRegistration {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	      System.out.println("Đăng kí tài khoản");
	        System.out.print("Nhập tên tài khoản: ");
	        String username = scanner.nextLine();

	        String password;
	        while (true) {
	           
	            System.out.print("Nhập mật khẩu: ");
	            password = scanner.nextLine();
	        }
	    }
}
