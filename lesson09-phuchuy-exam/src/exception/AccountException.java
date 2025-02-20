package exception;

public class AccountException extends Exception {

	private AccountError[]	errors;
	
	public AccountException(AccountError...errors) {
		this.errors = errors;
		
	}
	public AccountException(AccountError error) {
		
	}
	
	
	
	
	
	
	
	
		
	}
}
