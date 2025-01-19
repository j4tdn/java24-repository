package utils;

import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;

public class PassWordCheck {
	
	// Em có thể tham khảo pattern của 1 số bạn
	// A sẽ chỉ tại lớp kỹ hơn hi
	public static boolean ValidPassword(String password) throws IOException{
		if(password.length() < 8) {
			throw new IOException("Mat khau phai dai hon 8 ki tu");	
		}
		
		if (password.split("[^0-9]").length == 0) {
		    throw new IOException("Mật khẩu phải chứa ít nhất 1 chữ số");
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