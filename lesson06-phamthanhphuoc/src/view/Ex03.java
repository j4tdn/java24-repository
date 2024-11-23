package view;
import exception.InvalidEmail;
import exception.LowercasePassword;
import exception.NumberPassword;

import java.util.Scanner;
public class Ex03 {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		
		String account;
		do {
			try {
				System.out.print("Nhập email: ");
				account = ip.nextLine();
				
				 if (!account.endsWith("@gmail.com")) {
	                    throw new InvalidEmail("Email phải kết thúc @gmail.com");
	                }
				 if (!account.matches(".*[a-z].*")) {
	                    throw new LowercasePassword();
	                }
				 if (!account.matches(".*\\d.*")) {
	                    throw new NumberPassword();
	                }
				 System.out.println("Đã đăng nhập thành công !");
				break;
			} catch (InvalidEmail e) {
				 System.out.println("Lỗi: " + e.getMessage());
			}catch (LowercasePassword e) {
				System.out.println("Lỗi: " + e.getMessage());
            } catch (NumberPassword e) {
            	System.out.println("Lỗi: " + e.getMessage());
            }
		} while (true);
		
		ip.close();
	}
	
}
