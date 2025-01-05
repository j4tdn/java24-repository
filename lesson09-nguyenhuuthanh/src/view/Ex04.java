
package view;


public class Ex04 {
	
    public static void main(String[] args) {
        String username = "byztkhx256";
        String password = "Admin123@";
        if (checkAccountSignup(username, password)) {
            System.out.println("--> Đăng ký tài khoản thành công");
        } else {
            System.out.println("--> Đăng ký tài khoản thất bại");
        }
    }
  
    
    public static boolean checkAccountSignup(String username, String password){
        if(password.length() < 8){
            System.out.println("--> Lỗi : Độ dài mật khẩu >= 8");
            return false;
        }
        if (!password.matches(".*\\d.*")) {
            System.out.println("--> Lỗi: Mật khẩu phải chứa ít nhất 1 chữ số");
            return false;
        }
        if (!password.matches(".*[A-Z].*")) {
            System.out.println("--> Lỗi: Mật khẩu phải chứa ít nhất 1 ký tự in hoa");
            return false;
        }
        if (!password.matches(".*[~!@#$%^&*].*")) {
            System.out.println("--> Lỗi: Mật khẩu phải chứa ít nhất 1 ký tự đặc biệt (~!@#$%^&*)");
            return false;
        }
        for (int i = 0; i < username.length() - 2; i++) {
            String substring = username.substring(i, i + 3);
            if (password.contains(substring)) {
                System.out.println("--> Lỗi: Mật khẩu không được trùng quá 3 ký tự liên tiếp với tên tài khoản");
                return false;
            }
        }
        return true;
    }
}