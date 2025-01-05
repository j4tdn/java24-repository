package exception;

public class ErroPassword extends RuntimeException {
	public ErroPassword() {
		this("Không được trùng quá 3 ký tự với tên tài khoản [Đăng ký khi bắt đầu chương trình]");
	}
	 public ErroPassword(String message) {
	        super(message);
	    }

}
