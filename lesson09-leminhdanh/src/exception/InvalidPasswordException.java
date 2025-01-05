package exception;

public class InvalidPasswordException extends Exception{
	
		public InvalidPasswordException() {
			this("Password required is not valid !!!");
		}
		
		public InvalidPasswordException(String message) {
			super(message);
		}
}
