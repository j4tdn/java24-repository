package inheritance.abstractclass;

public class Ex01InheritanceAbstractClassDemo {

	
	
	public static void main(String[] args) {
		//EmailService em1 = new StandardEmailService();
		
		//anonymous class
		EmailService em2 = new EmailService() {
			
			@Override
			public void login() {
				System.out.println("Anonymous em2 # login");
			}
			
		};
		em2.login();
		em2.login2Steps();
	}
	
}
