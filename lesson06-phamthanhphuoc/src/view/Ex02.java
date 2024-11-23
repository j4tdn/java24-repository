package view;
import exception.*;
import java.util.Scanner;
public class Ex02 {
	public static void main(String[] args) {
		 Scanner ip = new Scanner(System.in);
		 String Password;
		 int count =0;
		 while(count<5) {
			 try {
				 System.out.print("Nhap mat khau: ");
				 Password = ip.nextLine();
				 
				 if (Password.length() < 6 ||Password.length() > 256 ) {
	                    throw new LengthPassword();
	                }
				 
				 if (!Password.matches(".*[A-Z].*")) {
	                    throw new UppercasePassword();
	                }
				 if (!Password.matches(".*[a-z].*")) {
	                    throw new LowercasePassword();
	                }
				 if (!Password.matches(".*\\d.*")) {
	                    throw new NumberPassword();
	                }
				 if (!Password.matches(".*[.!@#$%^&*].*")) {
	                    throw new CharacterPassword();
	                }
				 System.out.println("Đăng Ký Tài Khoản Thành Công!");
	                break;
				
			} catch (LengthPassword e) {
                System.out.println("Mật khẩu phải có ít nhất 6 ký tự!");
                count++;
            } catch (UppercasePassword e) {
                System.out.println("Mật khẩu phải có ít nhất 1 chữ hoa!");
                count++;
            } catch (LowercasePassword e) {
                System.out.println("Mật khẩu phải có ít nhất một chữ thường!");
                count++;
            } catch (NumberPassword e) {
                System.out.println("Mật khẩu phải có ít nhất một chữ số!");
                count++;
            } catch (CharacterPassword e) {
                System.out.println("Mật khẩu phải có ít nhất 1 ký tự đặt biệt!");
                count++;
            }
			 if (count == 5) {
	                System.out.println("Bạn đã nhập sai 5 lần, kết thúc chương trình!");
	            }
		 }
	}

}
