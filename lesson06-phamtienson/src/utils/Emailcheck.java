package utils;

import java.util.regex.Pattern;

/*
 Kiểm tra phần tiền tố của email
 1. Bắt đầu or kết thúc bằng "." "_"
 2. Chứa các kí tự không hợp lệ
 3. Không có dấu chấm liên tiếp
 Chia email ra tiền tố và hậu tố --> kiểm tra từng phần
 
 */

public class Emailcheck {
	public static boolean isPrefix(String prefix) throws Exception {
		if (prefix.matches("^[._].*")) {
			throw new Exception("Phần tiền tố không được bắt đầu bằng dấu chấm, dấu gạch ngang ");
		}
	    if (prefix.matches(".*[._]$")) {
		    throw new Exception("Phần tiến tố không được kết thúc bằng dấu chấm, dấu gạch ngang");
	    }
	    if(prefix.contains("#") || prefix.contains("@")) {
	    	throw new Exception("Phần tiền tố không được chứa kí tự # @ ");
	    }
	    if(prefix.contains("..")) {
	    	throw new Exception("Phần tiền tố không được chứa dấu chấm liên tiếp");
	    }
	    
	    String prefixRegex = "^[a-zA-Z0-9._]+$";
	    if(!Pattern.matches(prefixRegex, prefix)) {
	    	throw new Exception("Phần tiền tố chỉ được chứa các kí tự cho phép ");
	    }
	    return true;
	    
	}
	
	public static boolean isEmail(String email) throws Exception {
		String[] parts = email.split("@");
		if (parts.length !=2) {
			throw new Exception("Email phải có đúng một dấu @");
		}
		String prefix = parts[0];
		String domain = parts[1];
		try {
			isPrefix(prefix);
		} catch (Exception e) {
			throw new Exception("Lỗi! "+ e.getMessage());
		}
		String domainRegex = "^[a-zA-Z0-9.]+$";
		if(!Pattern.matches(domainRegex, domain)) {
			throw new Exception("Phần miền không hợp lệ");
		}
		return true;
		
	}
	
	

}
