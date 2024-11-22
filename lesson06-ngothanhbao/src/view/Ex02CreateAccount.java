package view;

import java.util.Scanner;

import exception.AlphabeticCharacterException;
import exception.AmountCharacterException;
import exception.AmountNumberException;
import exception.SpecialCharacterException;

public class Ex02CreateAccount {
	
	public static void main(String[] args) {
		
		Scanner ip = new Scanner(System.in);
		String name,password;
		System.out.print("Nhap tai khoan: ");
		name = ip.nextLine();
		int count = 0;
		do {
			try {
				System.out.print("Nhap mat khau: ");
				password = ip.nextLine();
				createAccount(name, password);
				count++;
				
			} catch (AmountCharacterException ace) {
				System.out.println(ace.getMessage());
			} catch (AlphabeticCharacterException ac) {
				System.out.println(ac.getMessage());
			} catch (AmountNumberException ane) {
				System.out.println(ane.getMessage());
			} catch (SpecialCharacterException sce) {
				System.out.println(sce.getMessage());
			} finally {
				count++;
				if(count <= 5) {
					System.out.println("Nhap sai vui long nhap lai lan " + count + ": ");
				} else {
					System.out.println("Nhap sai qua 5 lan !!!");
					break;
				}
			}
			
		} while(true);
		ip.close();
	}
	
	public static void createAccount(String name,String password) throws AmountCharacterException, AlphabeticCharacterException, AmountNumberException, SpecialCharacterException {
		
		if(password.length() < 8 || password.length() > 256) {
			throw new AmountCharacterException("Mat khau khong hop le, vui long nhap dung so luong yeu cau !!!");
		}
		
		if(!password.matches(".*[A-Z].*" + ".*[a-z].*")  ) {
			throw new AlphabeticCharacterException("Mat khau khong gom chu viet theo yeu cau, vui long nhap lai !!!");
		}
		
		if(!password.matches(".*[0-9].*")) {
			throw new AmountNumberException("Mat khau khong gom so theo yeu cau, vui long nhap lai !!!");
		}
		
		if(!password.matches(".*[^a-zA-Z0-9].*")) {
			throw new SpecialCharacterException("Mat khau khong gom ky tu dac biet theo yeu cau vui long nhap lai !!!");
		}
		
	}
	
}
