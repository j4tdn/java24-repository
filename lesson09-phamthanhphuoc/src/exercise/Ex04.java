package exercise;
import java.util.Scanner;

import exception.*;
public class Ex04 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		String Name;
		String PassWord;
		
		try {
			System.out.println("Mời bạn nhập Tài Khoản : \n");
			Name = ip.nextLine();
			System.out.println("Mời bạn nhập Mật Khẩu : ");
			PassWord = ip.nextLine();
			
			 if(PassWord.length() < 8) {
				throw new LengthPassword();
			 }
			 if (!PassWord.matches(".*[A-Z].*")) {
                 throw new UppercasePassword();
             }
			 if (!PassWord.matches(".*\\d.*")) {
                 throw new NumberPassword();
             }
			 if (!PassWord.matches(".*[.!@#$%^&*].*")) {
                 throw new CharacterPassword();
             }
			 for(int i = Name.length();i>Name.length();i++) {
				 System.out.println(Name);
				 int count = 0;
				 if(Name.charAt(i) == PassWord.charAt(i)) {
					 count++;
				 }
				 if(count == 3) {
					 throw new ErroPassword();
				 }
			 }
			 
			 System.out.println("Đăng Ký Tài Khoản Thành Công!");
			
		} catch (LengthPassword e) {
			System.out.println("Mật khẩu phải có ít nhất 6 ký tự!");
		}catch (UppercasePassword e) {
			 System.out.println("Mật khẩu phải có ít nhất 1 chữ hoa!");
		}catch (NumberPassword e) {
			 System.out.println("Mật khẩu phải có ít nhất một chữ số!");
		}catch (CharacterPassword e) {
			System.out.println("Mật khẩu phải có ít nhất 1 ký tự đặt biệt!");
		}catch (ErroPassword e) {
			System.out.println("Không được trùng quá 3 ký tự với tên tài khoản [Đăng ký khi bắt đầu chương trình]");
		}
	}

}
