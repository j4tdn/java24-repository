package inheritance.abstractclass;

public class Ex01InheritanceAbstractClassDemo {
	
	/*
	 
	 
	 
	 StandardEmailService: login login2Steps
	 BusinessEmailService: login login2Steps
	 
	 */
	public static void main(String[] args) {
		
		//anonymous class
		EmailService em1 = new EmailService() {
			
			@Override
			void login() {
				System.out.println("Anonymous em2 #login");
			}
			
		};
		em1.login();
		em1.login2Steps();
		
	}
}
