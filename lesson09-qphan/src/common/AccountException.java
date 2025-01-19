package common;

public class AccountException extends Exception {
	private static final long serialVersionUID = -2294938581678059752L;
	
	private AccountError[] errors;
	
	public AccountException(AccountError... errors) {
		this.errors = errors;
	}
	
	public AccountException(AccountError error) {
		this(error.getMessage());
	}
	
	private AccountException(String message) {
		super(message);
	}
	
	public AccountError[] getErrors() {
		return errors;
	}
	
	public enum AccountError {
		
		INVALID_LENGTH("Độ dài mật khẩu không hợp lệ (>=8)"),
		
		AT_LEAST_ONE_DIGIT("Yêu cầu có ít nhất 1 kí tự số"),
		
		AT_LEAST_ONE_UPPERCASE_LETTER("Yêu cầu có ít nhất 1 kí tự in hoa"),
		
		AT_LEAST_ONE_SPECIAL_LETTER("Yêu cầu có ít nhất 1 kí tự đặc biệt"),
		
		OVERLAPPED_ACCOUNT_LETTERS("Yêu cầu không được trùng quá 3 kí tự với tài khoản");
		
		private String message;
		
		AccountError(String message) {
			this.message = message;
		}
		
		public String getMessage() {
			return message;
		}
	}
}
