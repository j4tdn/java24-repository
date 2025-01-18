package view;

import java.util.Scanner;

public class Ex04 {
	
	public static void main(String[] args) {
		
		Scanner ip = new Scanner(System.in);
		
		System.out.println("Tên tài khoản: byztkhx256 ");
		String acName = "byztkhx256";
		
		while(true) {
			System.out.print("Nhập tên mật khẩu: ");
			String pw = ip.nextLine();
			
			// Thay vì if else, em có thể if, trong if return thì code sẽ dễ nhìn hơn
			// Nên cách bài trước a mới nói em tách hàm để xử lý
			if(pw.length() < 8) {
				System.out.println("Mk phải lớn hơn 8 ký tự");
			} else if(!pw.matches(".*[0-9].*")) {
				System.out.println("Mk phải có ít nhất 1 chữ số");
			} else if(!pw.matches(".*[A-Z].*")) {
				System.out.println("Mk phải có ít nhất 1 ký tự in hoa");
			} else if(!pw.matches(".*[^a-zA-Z0-9].*")) {
				System.out.println("Mk phải có ít nhất 1 ký tự đặc biệt");
			} else {
				break;
			}
			
		}
		
		System.out.println("Đăng ký thành công");
	
		
		
	}

}
