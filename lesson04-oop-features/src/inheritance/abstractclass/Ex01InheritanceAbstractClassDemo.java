package inheritance.abstractclass;

public class Ex01InheritanceAbstractClassDemo {
	
	/*
	 	
	 	EmailService
	 	StandardEmailService login login2Steps
	 	BusinessEmailService login login2Steps
	 */
	public static void main(String[] args) {
		EmailService em1 = new StandardEmailService();
		
		EmailService em2 = new EmailService() {
			@Override
			void login() {
				System.out.println("Anonymous em2 # login");
			}
		};
		
		em2.login();
		em2.login2Steps();
	}
}
