package utils;

import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;

public class PasswordCheck {
	
	public static boolean ValidPassword(String password) throws IOException{
		if(password.length() < 8) {
			throw new IOException("Mat khau phai dai hon 8 ki tu");	
		}
		
		if(password.length() > 256) {
			throw new IOException("Mat khau toi da 256 ki tu");	
		}
		
		if(password.split("[^a-z]").length == 0) {
			throw new IOException("Mat khau phai chua it nhat 1 chu cai thuong");
		}
		
		if(password.split("[^A-Z]").length == 0) {
			throw new IOException("Mat khau phai chua it nhat 1 chu cai in hoa");
		}
		
		if(password.split("[^~!@#$%^&*(){}\\/<>?:]").length == 0) {
			throw new IOException("Mat khau phai chua it nhat 1 ki tu dat biet");
		}
	return true;
	}

}
