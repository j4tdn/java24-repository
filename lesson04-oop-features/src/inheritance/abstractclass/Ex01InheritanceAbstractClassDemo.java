package inheritance.abstractclass;

public class Ex01InheritanceAbstractClassDemo {
	public static void main(String[] args) {
		EmailService em1 = new StandardEmailService();
		EmailService em2 = new EmailService() {
			
			@Override
			void login() {
				// TODO Auto-generated method stub
				System.out.println("Anonymous em2 # login");
			}
			
		};
		em2.login();
		em2.login2Steps();
	}

}
