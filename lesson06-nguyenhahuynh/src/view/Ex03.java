package view;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		String email;
		String emailRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$";
		
		do {
            System.out.print("Nhập email: ");
            email = ip.nextLine();
            
            if (email.matches(emailRegex)) {
            	System.out.println("Email hợp lệ");
            	break;
            } else {
            	System.out.println("Email không hợp lệ, nhập lại");
            }
		} while (true);
		
		ip.close();
	}
}
